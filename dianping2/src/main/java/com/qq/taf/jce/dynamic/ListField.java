package com.qq.taf.jce.dynamic;

public final class ListField extends JceField
{
  private JceField[] data;

  ListField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }

  public JceField get(int paramInt)
  {
    return this.data[paramInt];
  }

  public JceField[] get()
  {
    return this.data;
  }

  public void set(int paramInt, JceField paramJceField)
  {
    this.data[paramInt] = paramJceField;
  }

  public void set(JceField[] paramArrayOfJceField)
  {
    this.data = paramArrayOfJceField;
  }

  public int size()
  {
    return this.data.length;
  }
}

/* Location:           C:\Users\xuetong\Desktop\dazhongdianping7.9.6\ProjectSrc\classes-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ListField
 * JD-Core Version:    0.6.0
 */