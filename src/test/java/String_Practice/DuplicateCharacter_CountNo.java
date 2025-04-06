package String_Practice;

public class DuplicateCharacter_CountNo {
    public static void main(String[] args) {
        String str ="Automation Testing";
        int count =0;
        int AllCharCount =0;
        //Convert to char Array
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length; i++)
        {
            AllCharCount++;
            for(int j =i+1; j<ch.length; j++)
            {
                if(ch[i]== ch[j])
                {
                    System.out.println("Here All Duplicate Character : "+ch[i] );
                    count++;
                }
            }
        }

        System.out.println("Here all duplicate char count :" +count);
        System.out.println("Here all char count :" +AllCharCount);

    }
}
