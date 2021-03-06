package com.reviewssitefullstack;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Long> {

	Genre findByGenre(String genreName);

}
