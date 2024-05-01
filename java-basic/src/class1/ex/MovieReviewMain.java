package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] reviews = {inception, aboutTime};

        for(MovieReview r : reviews){ //iter 단축기 확인!
            System.out.println("영화 제목: " + r.title + ", 리뷰: " + r.review);
        }
    }
}
