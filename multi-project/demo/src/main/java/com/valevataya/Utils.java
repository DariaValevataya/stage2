package com.valevataya;

import java.util.ArrayList;
import java.util.List;

public class Utils {
  public static boolean isAllPositiveNumbers(List<String> args) {
    boolean isPositive = false;
    if (args.stream().allMatch(StringUtils::isPositiveNumber)) {
      isPositive = true;
    }
    return isPositive;
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("4");
    list.add("45");
    list.add("44");
    list.add("21");
    System.out.println(Utils.isAllPositiveNumbers(list));
  }
}

