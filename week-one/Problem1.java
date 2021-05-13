class Problem1{

    static boolean isPalindromeSentence(String input){
        int inputLength = input.length();
        StringBuilder inputWithoutAcute= new StringBuilder(); 
        for (int i = 0; i < inputLength; i++) {
            char letter = input.charAt(i);
            if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')) {
                inputWithoutAcute.append(Character.toLowerCase(letter));
            }
        }

        int inputSize = inputWithoutAcute.length();
        for(int i = 0; i < inputSize / 2; i++) {
            if(inputWithoutAcute.charAt(i) != inputWithoutAcute.charAt(inputSize -i -1)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args){
        String input = "La ruta nos aportó otro paso natural";
        System.out.println(isPalindromeSentence(input));
    }
}