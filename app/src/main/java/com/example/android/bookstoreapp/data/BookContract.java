package com.example.android.bookstoreapp.data;

import android.provider.BaseColumns;

/**
 * Created by manar on 04/02/2018.
 */

public class BookContract {

    private BookContract (){}

    public static final class BookEntry implements BaseColumns {

        public static final String TABLE_NAME = "books";
        public static final String COLUMN_NAME = "product_name";
        public static final String COLUMN_PRICE= "price";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_IMAGE = "image";
        public static final String COLUMN_SUPPLIER_NAME = "supplier_name";
        public static final String COLUMN_SUPPLIER_EMAIL = "supplier_email";
        public static final String COLUMN_SUPPLIER_NUMBER = "supplier_phone number";
    }
}