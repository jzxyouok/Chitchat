package com.bwie.chitchat.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.bwie.chitchat.bean.DataBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATA_BEAN".
*/
public class DataBeanDao extends AbstractDao<DataBean, Long> {

    public static final String TABLENAME = "DATA_BEAN";

    /**
     * Properties of entity DataBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Area = new Property(1, String.class, "area", false, "AREA");
        public final static Property PicWidth = new Property(2, int.class, "picWidth", false, "PIC_WIDTH");
        public final static Property Createtime = new Property(3, long.class, "createtime", false, "CREATETIME");
        public final static Property PicHeight = new Property(4, int.class, "picHeight", false, "PIC_HEIGHT");
        public final static Property Gender = new Property(5, String.class, "gender", false, "GENDER");
        public final static Property Lng = new Property(6, double.class, "lng", false, "LNG");
        public final static Property Introduce = new Property(7, String.class, "introduce", false, "INTRODUCE");
        public final static Property ImagePath = new Property(8, String.class, "imagePath", false, "IMAGE_PATH");
        public final static Property UserId = new Property(9, int.class, "userId", false, "USER_ID");
        public final static Property Yxpassword = new Property(10, String.class, "yxpassword", false, "YXPASSWORD");
        public final static Property Password = new Property(11, String.class, "password", false, "PASSWORD");
        public final static Property Lasttime = new Property(12, long.class, "lasttime", false, "LASTTIME");
        public final static Property Phone = new Property(13, String.class, "phone", false, "PHONE");
        public final static Property Nickname = new Property(14, String.class, "nickname", false, "NICKNAME");
        public final static Property Age = new Property(15, String.class, "age", false, "AGE");
        public final static Property Lat = new Property(16, double.class, "lat", false, "LAT");
    }


    public DataBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DataBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATA_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AREA\" TEXT," + // 1: area
                "\"PIC_WIDTH\" INTEGER NOT NULL ," + // 2: picWidth
                "\"CREATETIME\" INTEGER NOT NULL ," + // 3: createtime
                "\"PIC_HEIGHT\" INTEGER NOT NULL ," + // 4: picHeight
                "\"GENDER\" TEXT," + // 5: gender
                "\"LNG\" REAL NOT NULL ," + // 6: lng
                "\"INTRODUCE\" TEXT," + // 7: introduce
                "\"IMAGE_PATH\" TEXT," + // 8: imagePath
                "\"USER_ID\" INTEGER NOT NULL ," + // 9: userId
                "\"YXPASSWORD\" TEXT," + // 10: yxpassword
                "\"PASSWORD\" TEXT," + // 11: password
                "\"LASTTIME\" INTEGER NOT NULL ," + // 12: lasttime
                "\"PHONE\" TEXT," + // 13: phone
                "\"NICKNAME\" TEXT," + // 14: nickname
                "\"AGE\" TEXT," + // 15: age
                "\"LAT\" REAL NOT NULL );"); // 16: lat
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(2, area);
        }
        stmt.bindLong(3, entity.getPicWidth());
        stmt.bindLong(4, entity.getCreatetime());
        stmt.bindLong(5, entity.getPicHeight());
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(6, gender);
        }
        stmt.bindDouble(7, entity.getLng());
 
        String introduce = entity.getIntroduce();
        if (introduce != null) {
            stmt.bindString(8, introduce);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(9, imagePath);
        }
        stmt.bindLong(10, entity.getUserId());
 
        String yxpassword = entity.getYxpassword();
        if (yxpassword != null) {
            stmt.bindString(11, yxpassword);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(12, password);
        }
        stmt.bindLong(13, entity.getLasttime());
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(14, phone);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(15, nickname);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(16, age);
        }
        stmt.bindDouble(17, entity.getLat());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(2, area);
        }
        stmt.bindLong(3, entity.getPicWidth());
        stmt.bindLong(4, entity.getCreatetime());
        stmt.bindLong(5, entity.getPicHeight());
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(6, gender);
        }
        stmt.bindDouble(7, entity.getLng());
 
        String introduce = entity.getIntroduce();
        if (introduce != null) {
            stmt.bindString(8, introduce);
        }
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(9, imagePath);
        }
        stmt.bindLong(10, entity.getUserId());
 
        String yxpassword = entity.getYxpassword();
        if (yxpassword != null) {
            stmt.bindString(11, yxpassword);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(12, password);
        }
        stmt.bindLong(13, entity.getLasttime());
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(14, phone);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(15, nickname);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(16, age);
        }
        stmt.bindDouble(17, entity.getLat());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DataBean readEntity(Cursor cursor, int offset) {
        DataBean entity = new DataBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // area
            cursor.getInt(offset + 2), // picWidth
            cursor.getLong(offset + 3), // createtime
            cursor.getInt(offset + 4), // picHeight
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // gender
            cursor.getDouble(offset + 6), // lng
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // introduce
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // imagePath
            cursor.getInt(offset + 9), // userId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // yxpassword
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // password
            cursor.getLong(offset + 12), // lasttime
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // phone
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // nickname
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // age
            cursor.getDouble(offset + 16) // lat
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DataBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArea(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPicWidth(cursor.getInt(offset + 2));
        entity.setCreatetime(cursor.getLong(offset + 3));
        entity.setPicHeight(cursor.getInt(offset + 4));
        entity.setGender(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLng(cursor.getDouble(offset + 6));
        entity.setIntroduce(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setImagePath(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUserId(cursor.getInt(offset + 9));
        entity.setYxpassword(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPassword(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLasttime(cursor.getLong(offset + 12));
        entity.setPhone(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setNickname(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setAge(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setLat(cursor.getDouble(offset + 16));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DataBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DataBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DataBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
