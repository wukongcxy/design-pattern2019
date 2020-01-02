package com.cxy.designpattern.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author chenxinyue <chenxinyue@kuaishou.com>
 * Created on 2020-01-02
 */
public class Main {
    public static void main(String[] args) throws IOException {
        StateVO stateVO = new StateVO();
        StateVOTheadLocal.setThreadLocal(stateVO);
        State state = new NoHas25State();
        while (true) {
            String input = input();
            stateVO.setInput(InputEnum.valueOf(input));
            do {
                state = state.transmit();
            } while (!state.needInput());
        }
    }

    public static String input() throws IOException {
        System.out.println("please input");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();
        return name;
    }
}
