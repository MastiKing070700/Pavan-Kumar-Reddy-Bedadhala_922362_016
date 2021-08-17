package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.util.DateUtil;

public class MovieDaoCollectionImpl implements MovieDao {
	private static List<Movie> movieList;

	public MovieDaoCollectionImpl() {
		super();
		if (movieList == null) {
			movieList = new ArrayList<Movie>();
			Movie movie;

			movie = new Movie(1, "Avatar", "$2,787,965,087","Yes", DateUtil.convertToDate("15/03/2017"),
					"Science Fiction","No");
			movieList.add(movie);
			movie = new Movie(2, "The Avengers", "$1,518,812,988", "Yes", DateUtil.convertToDate("23/12/2017"),
					"Superhero", "No");
			movieList.add(movie);
			movie = new Movie(3, "Titanic", "$2,187,463,944", "Yes", DateUtil.convertToDate("21/08/2017"), "Romance",
					"No");
			movieList.add(movie);
			movie = new Movie(4, "Jurassic World", "$1,671,713,208", "No", DateUtil.convertToDate("02/07/2017"),
					"Science Fiction", "Yes");
			movieList.add(movie);
			movie = new Movie(5, "Avengers: End Game", "$2,750,760,348","Yes", DateUtil.convertToDate("02/11/2022"),
					"Superhero", "Yes");
			movieList.add(movie);
		}
	}

	public List<Movie> getMovieListAdmin() {
		return movieList;
	}

	public List<Movie> getMovieListCustomer() {
		List<Movie> customerMovieList = new ArrayList<Movie>();

		for (int i = 0; i < movieList.size(); i++) {
			Movie movie = movieList.get(i);
			if ((movie.getDateOfLaunch().equals(new Date()) || movie.getDateOfLaunch().before(new Date()))
					&& movie.isActive().length()>2) {
				customerMovieList.add(movie);
			}
		}

		return customerMovieList;
	}

	public void modifyMovie(Movie movie) {
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).equals(movie)) {
				movieList.set(i, movie);
				break;
			}
		}
	}

	public Movie getMovie(long movieId) {
		Movie movie = null;
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getId() == movieId) {
				movie = movieList.get(i);
				break;
			}
		}
		return movie;
	}

	public void save(List<Movie> movies) {

	}

}
