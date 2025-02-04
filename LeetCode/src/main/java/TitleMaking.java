public class TitleMaking {
    public String capitalizeTitle(String title) {

        String[] titleWords = title.split(" ");
        StringBuilder titleString = new StringBuilder();
        int count = 0;

        for(String word : titleWords){
            String polishedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            if(word.length() < 3 && !(count== titleWords.length -1 )){
                titleString.append(word.toLowerCase());
                titleString.append(" ");
            }
            else if(!(count== titleWords.length - 1)) {
                titleString.append(polishedWord);
                titleString.append(" ");
            }else{
                if(word.length() < 3){
                    titleString.append(word.toLowerCase());
                }else{
                    titleString.append(polishedWord);
                }


            }
            count++;

        }

        return titleString.toString();

    }


    public static void main(String[] args) {
        TitleMaking t = new TitleMaking();
        System.out.println(t.capitalizeTitle("L Hv"));
    }
}
