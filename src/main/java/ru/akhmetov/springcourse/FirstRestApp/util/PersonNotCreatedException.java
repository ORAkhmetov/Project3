package ru.akhmetov.springcourse.FirstRestApp.util;

/**
 * @author Oleg Akhmetov on 05.12.2022
 */
public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
