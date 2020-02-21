package com.imooc.ad.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * Created by Qinyi.
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
