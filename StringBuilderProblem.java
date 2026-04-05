public class StringBuilderProblem {
    public static void main(String args[]) {
        String str ="LeetcodeHelpMeLearn";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.toString());
        int[] spaces ={8,13,16};

        for(int i:spaces)
            stringBuilder.insert(i," ");

        System.out.println(stringBuilder.toString());
    }

}
