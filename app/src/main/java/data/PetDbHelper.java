package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Shelter.db";

    public PetDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES = "CREATE TABLE " + PetContract.PetsEntry.TABLE_PETS_NAME + "("
                + PetContract.PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + PetContract.PetsEntry.TABLE_PETS_NAME + " TEXT NOT NULL, "
                + PetContract.PetsEntry.COLUMN_PETS_BREED + " TEXT, "
                + PetContract.PetsEntry.COLUMN_PETS_GENDER + " INTEGER NOT NULL, "
                + PetContract.PetsEntry.COLUMN_PETS_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL_DELETE_ENTRIES = "DROP TABLE " + PetContract.PetsEntry.TABLE_PETS_NAME;

        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
