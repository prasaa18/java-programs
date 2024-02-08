package com.app.database;

public interface Database
{
      public void insert(Object obj);
      public void update(Object obj);
      public void delete(Object obj);
      public void selectOne();
      public void selectMany();
      public void selectAll();
}
