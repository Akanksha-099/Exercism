public class TwelveDays {
    String verse(int verseNumber) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String[] arr=new String[]{"twelve Drummers Drumming", "eleven Pipers Piping", "ten Lords-a-Leaping",
                "nine Ladies Dancing","eight Maids-a-Milking", "seven Swans-a-Swimming", "six Geese-a-Laying",
                "five Gold Rings","four Calling Birds", "three French Hens", "two Turtle Doves","a Partridge in a Pear Tree."};
        String ans="";

        ans+="On the ";
        switch(verseNumber)
        {
            case 1: ans+="first";
                break;
            case 2: ans+="second";
                break;
            case 3: ans+="third";
                break;
            case 4: ans+="fourth";
                break;
            case 5: ans+="fifth";
                break;
            case 6: ans+="sixth";
                break;
            case 7: ans+="seventh";
                break;
            case 8: ans+="eighth";
                break;
            case 9: ans+="ninth";
                break;
            case 10: ans+="tenth";
                break;
            case 11: ans+="eleventh";
                break;
            case 12: ans+="twelfth";
                break;
            default: System.out.println("Invalid Input");
        }
        ans+=" day of Christmas my true love gave to me: ";

        for(int i=verseNumber-1;i>0;i--)
        {
            ans+=arr[11-i];
            ans+=", ";
        }

        if(verseNumber!=1)
            ans+="and ";

        ans+=arr[11];
        ans+="\n";

        return ans;
    }
    String verses(int startVerse, int endVerse) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String ans="";
        for(int i=startVerse;i<endVerse;i++)
        {
            ans+=verse(i);
            ans+="\n";
        }
        ans+=verse(endVerse);
        return ans;
    }

    String sing() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return verses(1,12);
    }
}
