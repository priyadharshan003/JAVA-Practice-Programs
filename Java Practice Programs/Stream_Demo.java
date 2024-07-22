/*
 explanation of foreach loop using lambda function since it is a functional interface
 */

/*
 benefits fo stream interface : it has many methods , eg: filters
 */

//creating and using a stream by having an arraylist

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream_Demo{

    public static void main(String[] a)
    {
        List<Integer> nums = Arrays.asList(4,1,5,2,6,3,7,8);

//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        nums.forEach(con);


//using streams

        Stream <Integer> s1 = nums.stream();   // nums == s1
        Stream<Integer>s2 = s1.filter(integer -> integer%2==0); // stream can be used only once
        Stream<Integer>s3 = s2.map(integer -> integer*2);
        int result = s3.reduce(0,(c,e)->c+e);


        System.out.println(result);

    }
}