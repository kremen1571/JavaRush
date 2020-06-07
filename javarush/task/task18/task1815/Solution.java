package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface t;

        public TableInterfaceWrapper (TableInterface t) {
            super();
            this.t = t;
        }

        @Override
        public void setHeaderText(String newHeaderText) {
              t.setHeaderText(newHeaderText);
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            t.setModel(rows);
        }

        @Override
        public String getHeaderText() {

            return t.getHeaderText().toUpperCase();
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}