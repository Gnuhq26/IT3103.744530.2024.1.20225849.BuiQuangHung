public class TestPassingParameterHbq
 {
    public static void main(String[] args){
        DVDHungBQ jungleDVD = new DVDHungBQ("Jungle");
        DVDHungBQ cinderellaDVD = new DVDHungBQ("Cinderella");

        swapCorrectHbq(jungleDVD, cinderellaDVD);

        System.out.println("Jungle dvd title: " + jungleDVD.getTitleHbq());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitleHbq());

        changeTitle(jungleDVD, cinderellaDVD.getTitleHbq());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitleHbq());
        System.out.println("Bui Quang Hung 20225849");
    }

    public static void swapCorrectHbq(DVDHungBQ dvd1, DVDHungBQ dvd2) {
        DVDHungBQ tmp = new DVDHungBQ(
            dvd1.getTitleHbq(), 
            dvd1.getCategoryHbq(), 
            dvd1.getAuthorHbq(), 
            dvd1.getLengthHbq(), 
            dvd1.getCostHbq()
        );

        dvd1.setTitleHbq(dvd2.getTitleHbq());
        dvd1.setCategoryHbq(dvd2.getCategoryHbq());
        dvd1.setAuthorHbq(dvd2.getAuthorHbq());
        dvd1.setLengthHbq(dvd2.getLengthHbq());
        dvd1.setCostHbq(dvd2.getCostHbq());

        dvd2.setTitleHbq(tmp.getTitleHbq());
        dvd2.setCategoryHbq(tmp.getCategoryHbq());
        dvd2.setAuthorHbq(tmp.getAuthorHbq());
        dvd2.setLengthHbq(tmp.getLengthHbq());
        dvd2.setCostHbq(tmp.getCostHbq());
    }

    public static void changeTitle(DVDHungBQ dvd, String title){
        String oldTitle = dvd.getTitleHbq();
        dvd.setTitleHbq(title);
        dvd = new DVDHungBQ(oldTitle);
    }
}
