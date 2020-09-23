package data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {}

    public static abstract class PetsEntry implements BaseColumns{
        public final static String _ID = BaseColumns._ID;
        public static final String TABLE_PETS_NAME = "pets";
        public static final String COLUMN_PETS_NAME = "name";
        public static final String COLUMN_PETS_BREED = "breed";
        public static final String COLUMN_PETS_GENDER = "gender";
        public static final String COLUMN_PETS_WEIGHT = "weight";

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_NO_GENDER = 0;
    }
}
