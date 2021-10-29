package com.soap.sqlparser;

import com.facebook.presto.sql.parser.SqlParser;
import com.facebook.presto.sql.tree.Statement;
import com.google.common.base.Preconditions;

/**
 * @author yangfuzhao on 2021/10/28.
 */
public class PrestoSqlParser {
    public static void main(String[] args) {
        SqlParser parser = new SqlParser();
        Statement statement = parser.createStatement("CREATE TABLE app_caterb2b_dbus_delivery_detail (\n" +
                "   id  bigint(20)     ,\n" +
                "   delivery_bill_no  varchar(32)       ,\n" +
                "   sku_code  int(11)     ,\n" +
                "   delivery_qty  int(11)     ,\n" +
                "   actual_delivery_qty  int(11)     ,\n" +
                "   create_time  datetime     ,\n" +
                "   last_modify_time  datetime       ,\n" +
                "   sku_price  varchar(32)     ,\n" +
                "   order_coupon_amount  decimal(10,2)    ,\n" +
                "   sku_name  varchar(255)          ,\n" +
                "   sku_storage  smallint(4)          ,\n" +
                "   sku_volume  decimal(10,6)          ,\n" +
                "   sku_weight  decimal(10,3)         ,\n" +
                "   sku_category  smallint(4)         ,\n" +
                "   sku_brand  varchar(64)          ,\n" +
                "   sku_properties  varchar(512)          ,\n" +
                "   sku_unit_desc  varchar(512)          ,\n" +
                "   sku_unit  varchar(512)         ,\n" +
                "   warehouse_id  bigint(20)   ,\n" +
                "  PRIMARY KEY ( id ),\n" +
                "  KEY  idx_delivery_bill_no  ( delivery_bill_no ),\n" +
                "  KEY  idx_ctime  ( create_time ),\n" +
                "  KEY  idx_ctime_wh  ( warehouse_id , create_time ),\n" +
                "  KEY  idx_sku  ( sku_code )\n" +
                ")  ");
        System.out.println(statement.toString());
    }
}
