package com.interview.javabasic.throwable;

import java.io.FileNotFoundException;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.interview.javabasic.throwable
 * @date 2021/6/5 0:59
 */
public class ErrorAndException {
    private void throwError() {
        throw new StackOverflowError();
    }

    private void throwRuntimeException() {
        throw new RuntimeException();
    }

    private void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}