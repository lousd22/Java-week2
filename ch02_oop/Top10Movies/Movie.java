public class Movie {
        Integer MovieRank;
        String title;
        String director;
        Integer rottenTomatoesScore;

    
        public Movie(final Integer movieRank, final String title, final String director, final Integer rottenTomatoesScore) {
            MovieRank = movieRank;
            this.title = title;
            this.director = director;
            this.rottenTomatoesScore = rottenTomatoesScore;
        }

        public Integer getMovieRank() {
            return MovieRank;
        }

        public void setMovieRank(Integer movieRank) {
            MovieRank = movieRank;
        }


        public String getTitle() {
            return title;
        }


        public void setTitle(String title) {
            this.title = title;
        }


        public String getDirector() {
            return director;
        }


        public void setDirector(String director) {
            this.director = director;
        }


        public Integer getRottenTomatoesScore() {
            return rottenTomatoesScore;
        }


        public void setRottenTomatoesScore(Integer rottenTomatoesScore) {
            this.rottenTomatoesScore = rottenTomatoesScore;
        }

        @Override
        public String toString() {
            return "Movie [MovieRank=" + MovieRank + ", director=" + director + ", rottenTomatoesScore="
                    + rottenTomatoesScore + ", title=" + title + "]";
        }

         
        }
    
        
        
    
    
    

