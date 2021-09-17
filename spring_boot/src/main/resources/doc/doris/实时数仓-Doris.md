# 数据库设计文档

**数据库名：** caterb2b_rt

**文档版本：** 1.0.0

**文档描述：** doris

| 表名                  | 说明       |
| :---: | :---: |
| [app_caterb2b_byr_deal__dt_wk_mo_csu_cat_byr_city_1](#app_caterb2b_byr_deal__dt_wk_mo_csu_cat_byr_city_1) | OLAP |

**表名：** <a id="app_caterb2b_byr_deal__dt_wk_mo_csu_cat_byr_city_1">app_caterb2b_byr_deal__dt_wk_mo_csu_cat_byr_city_1</a>

**说明：** OLAP

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  2   | wk |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  3   | mo |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  4   | bu_id |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  5   | city_id |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  6   | cat1_id |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  7   | cat2_id |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  8   | cat3_id |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
|  9   | dt_byr |   unknown   |  |   0    |    Y     |  N   |       |   |
|  10   | dt_byr_csu |   unknown   |  |   0    |    Y     |  N   |       |   |
|  11   | first_cat1_arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  12   | first_cat2_arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  13   | first_cat3_arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  14   | arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  15   | first_arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  16   | bd_arranged_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  17   | cancel_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  18   | g_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  19   | purchase_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  20   | return_byr_id |   unknown   |  |   0    |    Y     |  N   |       |   |
|  21   | arranged_normal_csu_cnt |   bigint(20)   | 19 |   0    |    Y     |  N   |       |   |
