package crm.mapper;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Base mapper.
 * Mapping Dto, Entity and Request.
 *
 * @param <R> request.
 * @param <E> entity.
 * @param <D> response dto.
 */
public interface BaseMapper<R, E, D> {

  /**
   * Mapping user request {@link R} to database entity {@link E}.
   *
   * @param request users request {@link R}.
   * @return database entity {@link E}.
   */
  E requestToEntity(R request);


  /**
   * Mapping user request {@link R} to database entity {@link E}.
   * and inserting id in entity.
   *
   * @param id insertable id.
   * @param request users request {@link R}.
   * @return database {@link E}.
   */
  E requestToEntity(Long id, R request);

  /**
   * Mapping database entity {@link E} to dto response {@link D}.
   *
   * @param entity database entity {@link E}
   * @return dto response {@link D}
   */
  D entityToDto(E entity);


  /**
   * Mapping database entity list {@link E} to dto response list {@link D}.
   *
   * @param entityList database entity list {@link E}
   * @return dto response list {@link D}
   */
  List<D> entitylistToDtoList(List<E> entityList);

  /**
   * Mapping database entity page {@link E} to dto response page {@link D}.
   *
   * @param entityPage database entity page {@link E}.
   * @return dto response page {@link D}.
   */
  default Page<D> entityPageToDtoPage(Page<E> entityPage) {
    List<E> entityList = entityPage.getContent();
    List<D> dtoList = entitylistToDtoList(entityList);
    Pageable pageable = entityPage.getPageable();
    Integer totalPages = entityPage.getTotalPages();
    Page<D> receiptDtoPage = new PageImpl<>(dtoList, pageable, totalPages);
    return receiptDtoPage;
  }
}
