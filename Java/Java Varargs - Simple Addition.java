/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/


class Add{
    public static void main(String[] args){}

    public void add(int... numbers){
        String result="";   //result
        int total = 0;      //total

        //while there is numbers
        for(int i=0;i<numbers.length;i++){
            //sum previous total and number[i]
            total+=numbers[i];

            //if it is the last element of the table, we change the sigh for the result string
            if(i==numbers.length-1){
                result+=numbers[i]+"="+total;
            }else{
                result+=numbers[i]+"+";
            }
        }

        System.out.println(result);
    }
}

