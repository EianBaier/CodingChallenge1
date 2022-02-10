public class Ascending {
    public boolean ascending(String numbers){

        for (int i = 0; i < numbers.length()/2; i++) {
            String new_str = numbers.substring(0, i + 1);


            int num = Integer.parseInt(new_str);

            while (new_str.length() < numbers.length()) {

                num++;

                new_str = new_str + String.valueOf(num);


            }

            // check if new String becomes equal to original string
            if (new_str.equals(numbers))
                return true;
        }


        return false;



    }





}


