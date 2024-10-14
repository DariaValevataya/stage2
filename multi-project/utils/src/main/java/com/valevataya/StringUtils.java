package com.valevataya;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
  public static boolean isPositiveNumber(String str) {
    return NumberUtils.isCreatable(str) && Integer.parseInt(str)>0;
  }
}