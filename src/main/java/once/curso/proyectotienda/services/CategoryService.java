package once.curso.proyectotienda.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.Data;
import once.curso.proyectotienda.entities.Category;
import once.curso.proyectotienda.repositories.CategoryRepository;

@Data
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category save(Category entity) {

		return getCategoryRepository().save(entity);
	}

	public Iterable<Category> saveAll(Iterable<Category> entities) {

		return getCategoryRepository().saveAll(entities);
	}

	public Optional<Category> findById(Integer id) {

		return getCategoryRepository().findById(id);
	}

	public boolean existsById(Integer id) {

		return getCategoryRepository().existsById(id);
	}

	public Iterable<Category> findAll() {

		return getCategoryRepository().findAll();
	}

	public Iterable<Category> findAllById(Iterable<Integer> ids) {

		return getCategoryRepository().findAllById(ids);
	}

	public Iterable<Category> findAll(Sort sort) {

		return getCategoryRepository().findAll(sort);
	}

	public Page<Category> findAll(Pageable pageable) {

		return getCategoryRepository().findAll(pageable);
	}

	public long count() {

		return getCategoryRepository().count();
	}

	public void deleteById(Integer id) {
		getCategoryRepository().deleteById(id);
	}

	public void delete(Category entity) {
		getCategoryRepository().delete(entity);
	}

	public void deleteAllById(Iterable<? extends Integer> ids) {
		getCategoryRepository().deleteAllById(ids);
	}

	public void deleteAll(Iterable<? extends Category> entities) {
		getCategoryRepository().deleteAll(entities);
	}

	public void deleteAll() {
		getCategoryRepository().deleteAll();
	}
}
