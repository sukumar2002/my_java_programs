public class CountVowelsAndConsonants
{
    public static void count(String str)
    {
        int vowels=0;
        int consonants=0;
        if(str==null||str.isEmpty())
        {
            System.out.println("String is empty");
            return;
        }
        str=str.toLowerCase();
        for(char ch:str.toCharArray())
        {
               if(Character.isLetter(ch))
               {
                   if("aeiou".indexOf(ch)!=-1)
                   {
                       vowels++;
                   }
                   else
                   {
                       consonants++;
                   }
               }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("consonants:"+consonants);

    }
    public static void main(String[] args)
    {
        String str=" sukuMAr".trim();
        count(str);
    }
}
