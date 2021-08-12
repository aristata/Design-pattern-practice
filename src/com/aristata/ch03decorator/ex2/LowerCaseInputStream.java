package com.aristata.ch03decorator.ex2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    } // (1)

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    } // (2)

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    } // (2)

    /*
     * (1) FilterInputStream 은 InputStream 추상 클래스를 확장한 데코레이터이다.
     *   그리고 이 FilterInputStream 을 확장하여 사용하였기 때문에 생성자에서 inputStream 을 받아
     *   데코레이터의 인스턴스 변수에 할당한다
     * (2) read 메소드를 재정의 하였다.
     *   각각 byte 값 하나 또는 byte 배열을 읽고 각 byte 를 검사하여 대문자를 소문자로 변환하였다*/
}
