package com.tencent.open.utils;

import java.util.HashMap;

public class TemporaryStorage
{
  private static HashMap<String, Object> a = new HashMap();

  public static Object get(String paramString)
  {
    return a.remove(paramString);
  }

  public static void remove(String paramString)
  {
    a.remove(paramString);
  }

  public static Object set(String paramString, Object paramObject)
  {
    return a.put(paramString, paramObject);
  }
}

/* Location:           C:\Users\xuetong\Desktop\dazhongdianping7.9.6\ProjectSrc\classes-dex2jar.jar
 * Qualified Name:     com.tencent.open.utils.TemporaryStorage
 * JD-Core Version:    0.6.0
 */