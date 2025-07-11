package crm.service;

import crm.mapper.BaseMapper;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * CRUD Service.
 * C - create
 * R - read
 * U - update
 * D - delete
 * todo необходимо добавить валидацию request и создать понятные логи каждому методу
 *
 * @param <R> user request {@link R}
 * @param <E> database entity {@link E}
 * @param <D> dto response {@link R}
 * @param <M> mapper {@link M}
 * @param <J> jpa repository {@link J}
 */
@Slf4j
@RequiredArgsConstructor
public abstract class CrudService<
    R,
    E,
    D,
    M extends BaseMapper<R, E, D>,
    J extends JpaRepository<E, Long>
    > {

  protected final M mapper;
  protected final J repository;

  /**
   * Method finds all database entity {@link E} in repository {@link J}.
   * The received list of entities {@link E} is mapped to a list of DTOs {@link D}
   * using the mapper {@link M}.
   *
   * @return response DTOs list {@link D}
   */
  public List<D> findAll() {
    List<E> entities = repository.findAll();
    return mapper.entitylistToDtoList(entities);
  }

  /**
   * Method finds one database entity {@link E} by target ID in repository {@link J}.
   * The received entity {@link E} is mapped to a DTO {@link D}.
   *
   * @param id target ID
   * @return response DTO {@link D}
   */
  public D findById(Long id) {
    E entity = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));
    return mapper.entityToDto(entity);
  }

  /**
   * Method request {@link R} is mapped to entity {@link E} and save in repository {@link J}.
   *
   * @param request request, contains data
   * @return response DTO {@link D}
   */
  @Transactional
  public D save(R request) {
    E entity = mapper.requestToEntity(request);
    E savedEntity = repository.save(entity);
    // Логирование
    log.info("Saved entity with id {}", getEntityId(savedEntity));
    return mapper.entityToDto(savedEntity);
  }

  /**
   * Method finds one entity {@link E} by ID in repository {@link J}.
   * Method perform comparison request {@link R} fields and found entity.
   * If the fields are different, request is mapped to entity and save in repository.
   *
   * @param id target id
   * @param request request, contains data
   * @return dto {@link D}
   */
  @Transactional
  public D updateById(Long id, R request) {
    E existing = repository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Entity not found with id " + id));
    E entity = mapper.requestToEntity(id, request);
    E updated = repository.save(entity);
    log.info("Updated entity with id {}", getEntityId(updated));
    return mapper.entityToDto(updated);
  }

  /**
   * Method finds entity by id. If entity exist, method that performs delete.
   *
   * @param id target id
   */
  @Transactional
  public void deleteById(Long id) {
    if (!repository.existsById(id)) {
      throw new EntityNotFoundException("Entity not found with id " + id);
    }
    repository.deleteById(id);
    log.info("Deleted entity with id {}", id);
  }

  /**
   * Method additional for ID getting of entity.
   *
   * @param entity entity
   * @return id of entity
   */
  protected abstract Object getEntityId(E entity);
}