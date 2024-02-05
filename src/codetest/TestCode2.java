package codetest;

import codetest.lv1.CodeTest58;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCode2 {
    public static void main(String[] args) {
        CodeTest58 cd58 = new CodeTest58();
        int[][] a = {{1,2},{2,3}};
        int[][] b = {{3,4},{5,6}};
        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        cd58.solution(a, b);
    }
}
