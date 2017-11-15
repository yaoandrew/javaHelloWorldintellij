package com.yao.andrew;

import com.yao.andrew.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person andrew = new Person ("Andrew", 43);
        andrew.sayIntro();
        System.out.println( "Hello " + andrew.getName() );
    }
}
