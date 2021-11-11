# 数据库设计文档

**数据库名：** rtstat

**文档版本：** 1.0.0

**文档描述：** rtstat

| 表名                  | 说明       |
| :---: | :---: |
| [app_caterb2b_abnormal_bill](#app_caterb2b_abnormal_bill) | 非异表 |
| [app_caterb2b_bd_efficiency_cooperative](#app_caterb2b_bd_efficiency_cooperative) | 快驴事业部-BD人效-BD累计合作商户数 |
| [app_caterb2b_bd_perf_org_ranking](#app_caterb2b_bd_perf_org_ranking) | BD人效实时-org指标排名表 |
| [app_caterb2b_bd_perf_ranking](#app_caterb2b_bd_perf_ranking) | BD人效实时-bd指标排名表 |
| [app_caterb2b_byr_index](#app_caterb2b_byr_index) | 商家维度统计表 |
| [app_caterb2b_byr_login_log](#app_caterb2b_byr_login_log) | 商家登陆日志表 |
| [app_caterb2b_byr_search_log](#app_caterb2b_byr_search_log) | 商家搜索日志表 |
| [app_caterb2b_cat_bu_city_ch_sale_amt](#app_caterb2b_cat_bu_city_ch_sale_amt) | 品类分析销售结果表 |
| [app_caterb2b_cat_bu_city_sale_amt](#app_caterb2b_cat_bu_city_sale_amt) | 品类分析销售结果表 |
| [app_caterb2b_customer](#app_caterb2b_customer) | 实时分析客户信息表 |
| [app_caterb2b_customer_debt](#app_caterb2b_customer_debt) | 快驴事业部-商户欠款分析 |
| [app_caterb2b_data_flow_channel_kuailv](#app_caterb2b_data_flow_channel_kuailv) | 集团埋点数据表（快驴通道） |
| [app_caterb2b_dbus_cross_sorting](#app_caterb2b_dbus_cross_sorting) | 投线任务表 |
| [app_caterb2b_dbus_cross_sorting_item](#app_caterb2b_dbus_cross_sorting_item) | 投线任务项 |
| [app_caterb2b_dbus_delivery](#app_caterb2b_dbus_delivery) | 配送表 |
| [app_caterb2b_dbus_delivery_detail](#app_caterb2b_dbus_delivery_detail) |  |
| [app_caterb2b_dbus_delivery_route](#app_caterb2b_dbus_delivery_route) |  |
| [app_caterb2b_dbus_grid_customer_relation](#app_caterb2b_dbus_grid_customer_relation) | 网格与客户关联表 |
| [app_caterb2b_dbus_manufacture_board](#app_caterb2b_dbus_manufacture_board) | 加工看板 |
| [app_caterb2b_dbus_manufacture_record](#app_caterb2b_dbus_manufacture_record) | 加工流水记录表 |
| [app_caterb2b_dbus_outbound_bill](#app_caterb2b_dbus_outbound_bill) | 出库单 |
| [app_caterb2b_dbus_pick_bill](#app_caterb2b_dbus_pick_bill) | 拣货任务表 |
| [app_caterb2b_dbus_pick_bill_detail](#app_caterb2b_dbus_pick_bill_detail) | 出库单对应的sku信息 |
| [app_caterb2b_dbus_pick_bill_location_detail](#app_caterb2b_dbus_pick_bill_location_detail) | 储位任务按照商品储位和sku维度记录 |
| [app_caterb2b_dbus_rt_activity_reduction](#app_caterb2b_dbus_rt_activity_reduction) |  |
| [app_caterb2b_dbus_rt_activity_seckill_scene](#app_caterb2b_dbus_rt_activity_seckill_scene) |  |
| [app_caterb2b_dbus_rt_activity_seckill_scene_goods](#app_caterb2b_dbus_rt_activity_seckill_scene_goods) |  |
| [app_caterb2b_dbus_rt_asn_reservation_bill](#app_caterb2b_dbus_rt_asn_reservation_bill) | 预约单信息 |
| [app_caterb2b_dbus_rt_asn_reservation_bill_detail](#app_caterb2b_dbus_rt_asn_reservation_bill_detail) | 预约单明细表 |
| [app_caterb2b_dbus_rt_asn_reservation_car_operation](#app_caterb2b_dbus_rt_asn_reservation_car_operation) | 预约单车次维度操作信息表 |
| [app_caterb2b_dbus_rt_asn_reservation_sign](#app_caterb2b_dbus_rt_asn_reservation_sign) | 预约单签到信息 |
| [app_caterb2b_dbus_rt_asn_storage_type_statistics](#app_caterb2b_dbus_rt_asn_storage_type_statistics) | 温区使用量统计表 |
| [app_caterb2b_dbus_rt_attendance_info](#app_caterb2b_dbus_rt_attendance_info) | 考勤信息 |
| [app_caterb2b_dbus_rt_biz_return](#app_caterb2b_dbus_rt_biz_return) | 退货单表 |
| [app_caterb2b_dbus_rt_cart_item](#app_caterb2b_dbus_rt_cart_item) | 购物车表 |
| [app_caterb2b_dbus_rt_case_biz_order](#app_caterb2b_dbus_rt_case_biz_order) | 客诉订单表 |
| [app_caterb2b_dbus_rt_check_task](#app_caterb2b_dbus_rt_check_task) | 复核任务主表 |
| [app_caterb2b_dbus_rt_check_task_item](#app_caterb2b_dbus_rt_check_task_item) | 复核任务明细表 |
| [app_caterb2b_dbus_rt_confirm_responsibility](#app_caterb2b_dbus_rt_confirm_responsibility) | 定责表 |
| [app_caterb2b_dbus_rt_csu_price_seckill](#app_caterb2b_dbus_rt_csu_price_seckill) |  |
| [app_caterb2b_dbus_rt_customer_group_relation](#app_caterb2b_dbus_rt_customer_group_relation) | 客户群和客户关系表 |
| [app_caterb2b_dbus_rt_cx_purchase_bill](#app_caterb2b_dbus_rt_cx_purchase_bill) | 采购单 |
| [app_caterb2b_dbus_rt_cx_purchase_bill_detail](#app_caterb2b_dbus_rt_cx_purchase_bill_detail) | 采购单详情 |
| [app_caterb2b_dbus_rt_delivery_take](#app_caterb2b_dbus_rt_delivery_take) | 提货单表 |
| [app_caterb2b_dbus_rt_delivery_take_detail](#app_caterb2b_dbus_rt_delivery_take_detail) | 提货单明细表 |
| [app_caterb2b_dbus_rt_driver_sign_in](#app_caterb2b_dbus_rt_driver_sign_in) | 快驴司机APP报名计划运力表 |
| [app_caterb2b_dbus_rt_inbound_bill](#app_caterb2b_dbus_rt_inbound_bill) | 入库单表 |
| [app_caterb2b_dbus_rt_inbound_bill_detail](#app_caterb2b_dbus_rt_inbound_bill_detail) | 入库单详情表 |
| [app_caterb2b_dbus_rt_item_promo_amount](#app_caterb2b_dbus_rt_item_promo_amount) | 订单商品优惠分摊表 |
| [app_caterb2b_dbus_rt_item_promo_detail](#app_caterb2b_dbus_rt_item_promo_detail) | 商品级别促销信息 |
| [app_caterb2b_dbus_rt_kl_wqs_purchase_task_check](#app_caterb2b_dbus_rt_kl_wqs_purchase_task_check) | 采购检查任务表 |
| [app_caterb2b_dbus_rt_labour_user](#app_caterb2b_dbus_rt_labour_user) | 三方人员信息表 |
| [app_caterb2b_dbus_rt_labour_user_provider](#app_caterb2b_dbus_rt_labour_user_provider) | 服务商人员关系映射表 |
| [app_caterb2b_dbus_rt_labour_user_warehouse](#app_caterb2b_dbus_rt_labour_user_warehouse) | 人员与仓库的作业关系 |
| [app_caterb2b_dbus_rt_order](#app_caterb2b_dbus_rt_order) | databus同步线上实时订单数据表 |
| [app_caterb2b_dbus_rt_order_detail](#app_caterb2b_dbus_rt_order_detail) | 同步线上订单详情数据表 |
| [app_caterb2b_dbus_rt_order_detail_his](#app_caterb2b_dbus_rt_order_detail_his) | 同步线上订单详情数据表 |
| [app_caterb2b_dbus_rt_order_his](#app_caterb2b_dbus_rt_order_his) | databus同步线上实时订单数据表 |
| [app_caterb2b_dbus_rt_purchase_inbound_bill](#app_caterb2b_dbus_rt_purchase_inbound_bill) | 采购入库单表 |
| [app_caterb2b_dbus_rt_purchase_inbound_bill_detail](#app_caterb2b_dbus_rt_purchase_inbound_bill_detail) | 采购入库单详情表 |
| [app_caterb2b_dbus_rt_putaway_bill](#app_caterb2b_dbus_rt_putaway_bill) | 上架任务单主表 |
| [app_caterb2b_dbus_rt_receiving_bill](#app_caterb2b_dbus_rt_receiving_bill) | 收货任务主表 |
| [app_caterb2b_dbus_rt_route_check](#app_caterb2b_dbus_rt_route_check) | 排线核货主表 |
| [app_caterb2b_dbus_rt_route_check_item](#app_caterb2b_dbus_rt_route_check_item) | 排线核货明细表 |
| [app_caterb2b_dbus_rt_stock_info](#app_caterb2b_dbus_rt_stock_info) | 库位库存表 |
| [app_caterb2b_dbus_rt_zone_pick_bill](#app_caterb2b_dbus_rt_zone_pick_bill) | 拣货子任务主表 |
| [app_caterb2b_dbus_shortage_statistics](#app_caterb2b_dbus_shortage_statistics) | 缺货统计 |
| [app_caterb2b_dbus_warehouse_base_config](#app_caterb2b_dbus_warehouse_base_config) | 仓基础配置表 |
| [app_caterb2b_hourly_fresh_order_stat_csu_bu](#app_caterb2b_hourly_fresh_order_stat_csu_bu) |  |
| [app_caterb2b_hourly_fresh_order_stat_csu_bu_date](#app_caterb2b_hourly_fresh_order_stat_csu_bu_date) |  |
| [app_caterb2b_meat_battle_board](#app_caterb2b_meat_battle_board) | 肉禽攻坚战看板-全国实时数据 |
| [app_caterb2b_mobile_sales_bd_stat](#app_caterb2b_mobile_sales_bd_stat) | 快驴-销售管理移动版实时数据 |
| [app_caterb2b_mobile_sales_bd_stat_3p](#app_caterb2b_mobile_sales_bd_stat_3p) | 快驴-销售管理移动版实时数据3P |
| [app_caterb2b_mobile_sales_bd_stat_with_3p](#app_caterb2b_mobile_sales_bd_stat_with_3p) | 快驴-销售管理移动版实时数据3P |
| [app_caterb2b_mobile_sales_stat](#app_caterb2b_mobile_sales_stat) | 快驴-销售管理移动版实时数据 |
| [app_caterb2b_poc_rt_data](#app_caterb2b_poc_rt_data) | POC实时结果表 |
| [app_caterb2b_purchase_inbound_wh_cat1_stat](#app_caterb2b_purchase_inbound_wh_cat1_stat) |  |
| [app_caterb2b_purchase_inbound_wh_cat2_stat](#app_caterb2b_purchase_inbound_wh_cat2_stat) |  |
| [app_caterb2b_purchase_inbound_wh_stat](#app_caterb2b_purchase_inbound_wh_stat) |  |
| [app_caterb2b_purchase_inbound_wh_supplier_stat](#app_caterb2b_purchase_inbound_wh_supplier_stat) |  |
| [app_caterb2b_rt_bd_ka_perf_detail](#app_caterb2b_rt_bd_ka_perf_detail) | 数据魔方-bdka销售明细表 |
| [app_caterb2b_rt_bd_perf_category_detail](#app_caterb2b_rt_bd_perf_category_detail) | BD人效类目维度 |
| [app_caterb2b_rt_bd_perf_detail](#app_caterb2b_rt_bd_perf_detail) | BD人效详情实时表 |
| [app_caterb2b_rt_bd_target_ext_new](#app_caterb2b_rt_bd_target_ext_new) | 目标系统实时的SKU、SPU指标 |
| [app_caterb2b_rt_case_dtc_object](#app_caterb2b_rt_case_dtc_object) |  |
| [app_caterb2b_rt_case_extend](#app_caterb2b_rt_case_extend) |  |
| [app_caterb2b_rt_case_main](#app_caterb2b_rt_case_main) |  |
| [app_caterb2b_rt_customer_biz_detail](#app_caterb2b_rt_customer_biz_detail) | 快驴事业部-营销活动数据记录表 |
| [app_caterb2b_rt_customer_business_type](#app_caterb2b_rt_customer_business_type) | 客户业务归属标签表 |
| [app_caterb2b_rt_fact_grid_indicator_agg](#app_caterb2b_rt_fact_grid_indicator_agg) | 网格实时指标 |
| [app_caterb2b_rt_flink_case_dtc_object](#app_caterb2b_rt_flink_case_dtc_object) |  |
| [app_caterb2b_rt_flink_case_dtc_object_new](#app_caterb2b_rt_flink_case_dtc_object_new) |  |
| [app_caterb2b_rt_flink_case_extend_info](#app_caterb2b_rt_flink_case_extend_info) |  |
| [app_caterb2b_rt_flink_case_main](#app_caterb2b_rt_flink_case_main) |  |
| [app_caterb2b_rt_flink_new_case_dtc_object](#app_caterb2b_rt_flink_new_case_dtc_object) |  |
| [app_caterb2b_rt_flink_new_case_extend_info](#app_caterb2b_rt_flink_new_case_extend_info) |  |
| [app_caterb2b_rt_labor_feature](#app_caterb2b_rt_labor_feature) |  |
| [app_caterb2b_rt_order](#app_caterb2b_rt_order) | 同步线上实时订单数据表 |
| [app_caterb2b_rt_order_bak](#app_caterb2b_rt_order_bak) | 同步线上实时订单数据历史表 |
| [app_caterb2b_rt_order_detail](#app_caterb2b_rt_order_detail) | 同步线上订单详情数据表 |
| [app_caterb2b_rt_order_detail_bak](#app_caterb2b_rt_order_detail_bak) | 同步线上订单详情数据历史表 |
| [app_caterb2b_rt_order_stat_csu_bu](#app_caterb2b_rt_order_stat_csu_bu) |  |
| [app_caterb2b_rt_order_stat_csu_bu_ch](#app_caterb2b_rt_order_stat_csu_bu_ch) |  |
| [app_caterb2b_rt_promotion_item_rule](#app_caterb2b_rt_promotion_item_rule) | 单品促销信息表 |
| [app_caterb2b_rt_sell_grid](#app_caterb2b_rt_sell_grid) | 售卖区域表 |
| [app_caterb2b_rt_transport_feature](#app_caterb2b_rt_transport_feature) |  |
| [app_caterb2b_seckill_byr_push](#app_caterb2b_seckill_byr_push) |  |
| [app_caterb2b_storm_rt_order](#app_caterb2b_storm_rt_order) | storm同步线上实时订单数据表 |
| [app_caterb2b_storm_rt_order_detail](#app_caterb2b_storm_rt_order_detail) | storm同步线上订单详情数据表 |
| [app_caterb2b_storm_rt_order_detail_his](#app_caterb2b_storm_rt_order_detail_his) | storm同步线上订单详情数据表 |
| [app_caterb2b_storm_rt_order_his](#app_caterb2b_storm_rt_order_his) | storm同步线上实时订单数据表 |
| [app_caterb2b_task_schedule](#app_caterb2b_task_schedule) |  |
| [app_caterb2b_wh_delivery_order_cat2_stat](#app_caterb2b_wh_delivery_order_cat2_stat) |  |
| [app_caterb2b_wh_delivery_order_hour_stat](#app_caterb2b_wh_delivery_order_hour_stat) |  |
| [app_caterb2b_wh_delivery_order_stat](#app_caterb2b_wh_delivery_order_stat) | 仓配监控仓库维度订单汇总 |
| [app_caterb2b_wh_delivery_pr_wh_cm_stat](#app_caterb2b_wh_delivery_pr_wh_cm_stat) |  |
| [app_caterb2b_wh_delivery_pr_wh_stat](#app_caterb2b_wh_delivery_pr_wh_stat) |  |
| [app_caterb2b_wh_delivery_take_inbound_type_src](#app_caterb2b_wh_delivery_take_inbound_type_src) | 提货入库监控仓库汇总 |
| [app_caterb2b_wh_delivery_take_res_wh_dsp_type_src](#app_caterb2b_wh_delivery_take_res_wh_dsp_type_src) | 仓配运营监控-提货监控-仓库-服务商维度汇总 |
| [app_caterb2b_wh_delivery_take_res_wh_type_src](#app_caterb2b_wh_delivery_take_res_wh_type_src) | 仓配运营监控-提货监控-仓库维度汇总 |
| [app_caterb2b_wh_delivery_take_stat](#app_caterb2b_wh_delivery_take_stat) |  |
| [app_caterb2b_wh_delivery_take_wh_stat](#app_caterb2b_wh_delivery_take_wh_stat) |  |
| [app_caterb2b_wh_delivery_take_wh_times_stat](#app_caterb2b_wh_delivery_take_wh_times_stat) |  |
| [app_caterb2b_wh_delivery_times_stat](#app_caterb2b_wh_delivery_times_stat) |  |
| [app_caterb2b_wh_outbound_statistics](#app_caterb2b_wh_outbound_statistics) |  |
| [app_caterb2b_wh_pre_shortage_cat](#app_caterb2b_wh_pre_shortage_cat) | 仓配主题-预售缺货-仓库汇总 |
| [app_caterb2b_wh_stock_check_task_ship_area_wh_stat](#app_caterb2b_wh_stock_check_task_ship_area_wh_stat) | 仓储主题-复核-发货区 |
| [app_caterb2b_wh_stock_check_task_wh_stat](#app_caterb2b_wh_stock_check_task_wh_stat) | 仓储主题-核货-核货仓库汇总 |
| [app_caterb2b_wh_stock_pre_cat_cross_wh_stat](#app_caterb2b_wh_stock_pre_cat_cross_wh_stat) | 仓储主题-投线任务-预售分类拣货汇总 |
| [app_caterb2b_wh_stock_pre_cat_pick_cross_wh_stat](#app_caterb2b_wh_stock_pre_cat_pick_cross_wh_stat) | 仓储主题-拣货投线任务-预售分类汇总 |
| [app_caterb2b_wh_stock_route_check_ship_area_wh_stat](#app_caterb2b_wh_stock_route_check_ship_area_wh_stat) | 仓储主题-复核-发货区 |
| [app_caterb2b_wh_stock_route_check_task_ship_area_wh_stat](#app_caterb2b_wh_stock_route_check_task_ship_area_wh_stat) | 仓储主题-复核核货-发货区 |
| [app_caterb2b_wh_stock_route_check_wh_stat](#app_caterb2b_wh_stock_route_check_wh_stat) | 仓储主题-核货-核货仓库汇总 |
| [app_caterb2b_wh_stock_task_ship_area_wh_stat](#app_caterb2b_wh_stock_task_ship_area_wh_stat) | 仓储主题-复核核货-发货区 |
| [app_customer_group_cat_tag_day](#app_customer_group_cat_tag_day) | 品类新客表 |
| [app_mobile_dashboard_rt_bu_city_area_sale](#app_mobile_dashboard_rt_bu_city_area_sale) | 快驴-城市大盘移动版数据 |
| [app_mobile_dashboard_rt_region_bu_city_area_sale](#app_mobile_dashboard_rt_region_bu_city_area_sale) | 快驴-城市大盘移动版数据 |
| [app_mobile_dashboard_rt_sale](#app_mobile_dashboard_rt_sale) | 快驴-星辰移动仪表盘数据 |
| [app_mobile_dashboard_rt_sale_3p](#app_mobile_dashboard_rt_sale_3p) | 快驴-星辰移动仪表盘数据3P |
| [app_mobile_dashboard_rt_sale_with_3p](#app_mobile_dashboard_rt_sale_with_3p) | 快驴-星辰移动仪表盘数据3P |
| [app_perf_crane_cat_sale_data_day](#app_perf_crane_cat_sale_data_day) | 实时品类维度销售数据统计表 |
| [app_perf_crane_nrt_bd_perf_detail_3p](#app_perf_crane_nrt_bd_perf_detail_3p) | BD人效详情准实时表 |
| [app_perf_crane_nrt_bd_perf_detail_3p_history](#app_perf_crane_nrt_bd_perf_detail_3p_history) | BD人效详情历史记录表 |
| [app_perf_xt_off_cat_sale_data_day](#app_perf_xt_off_cat_sale_data_day) | 离线全国品类维度销售数据统计表 |
| [app_poultry_attack_customer_pre_reactive](#app_poultry_attack_customer_pre_reactive) | 快驴事业部--肉禽攻坚战-预复活客户 |
| [app_rt_bu_cat_sale_data](#app_rt_bu_cat_sale_data) | 实时事业部维度品类销售数据统计表 |
| [app_rt_bu_sale_data](#app_rt_bu_sale_data) | 实时事业部维度销售数据统计表 |
| [app_rt_wh_sale_data](#app_rt_wh_sale_data) | 实时仓库部维度销售数据统计表 |
| [app_rt_wh_storage_location](#app_rt_wh_storage_location) | 温层库位使用统计 |
| [app_rt_wh_storage_volume](#app_rt_wh_storage_volume) | 仓库温层维度的容积 |
| [app_rt_wh_storage_volume_flink](#app_rt_wh_storage_volume_flink) | 仓库温层维度的容积 |
| [app_sm_star_target_analysis](#app_sm_star_target_analysis) | 快驴事业部-销售目标信息表 |
| [app_tgt_crane_nrt_bd_perf_category_detail_with_3p](#app_tgt_crane_nrt_bd_perf_category_detail_with_3p) | BD人效类目维度实时表 |
| [app_tgt_crane_nrt_bd_target_ext_with_3p](#app_tgt_crane_nrt_bd_target_ext_with_3p) | 数据播报额外数据指标表（包含3P数据） |
| [app_tl_pd_order_screen_day_withpop](#app_tl_pd_order_screen_day_withpop) | 快驴事业部-驼铃订单管理订单列表筛选(含3p) |
| [app_transport_forecast_results](#app_transport_forecast_results) | 销量预测-预测结果 |
| [app_wh_dbus_rt_parcel](#app_wh_dbus_rt_parcel) | 包裹表 |
| [app_wh_dbus_rt_parcel_item](#app_wh_dbus_rt_parcel_item) | 包裹明细表 |
| [app_wh_dbus_rt_seller_info](#app_wh_dbus_rt_seller_info) | 卖家送货模式映射表 |
| [app_wh_operator_task_effect](#app_wh_operator_task_effect) |  |
| [bd_perf_detail_history](#bd_perf_detail_history) | BD人效实时历史记录表 |
| [caterb2b_customer_tag_day](#caterb2b_customer_tag_day) | 快驴事业部-客户维度指标标签数据 |
| [dbus_driver_schedule](#dbus_driver_schedule) | 参与排班司机表 |
| [dbus_fact_centralized_pick_bill](#dbus_fact_centralized_pick_bill) | 总拣任务主表 |
| [dbus_rt_order_outbound_bill](#dbus_rt_order_outbound_bill) | 订单出库单 |
| [dbus_rt_replenish_task_bill](#dbus_rt_replenish_task_bill) | 补货任务表 |
| [dbus_shift](#dbus_shift) | 班次配置表 |
| [dim_caterb2b_ba_category_details](#dim_caterb2b_ba_category_details) | 商分自定义类目与后台类目关联关系 |
| [dim_caterb2b_bd_detail](#dim_caterb2b_bd_detail) | 快驴事业部-RAC组织结构人员实时信息数据 |
| [dim_caterb2b_bd_organization](#dim_caterb2b_bd_organization) | 快驴事业部-快驴BD组织结构信息表 |
| [dim_caterb2b_bi_cat_mapping_details](#dim_caterb2b_bi_cat_mapping_details) | B2B业务部--后台类目表-商分组织类目-kpi类目 |
| [dim_caterb2b_business_unit](#dim_caterb2b_business_unit) | 快驴-事业部维表 |
| [dim_caterb2b_city](#dim_caterb2b_city) | B2B业务部开站城市 |
| [dim_caterb2b_city_business_unit](#dim_caterb2b_city_business_unit) |  |
| [dim_caterb2b_customer](#dim_caterb2b_customer) | 快驴事业部-快驴客户信息表 |
| [dim_caterb2b_customer_his](#dim_caterb2b_customer_his) | B2B业务部-快驴商家客户历史信息表 |
| [dim_caterb2b_customer_ord_time_his](#dim_caterb2b_customer_ord_time_his) | B2B业务部-商户交易时间维表 |
| [dim_caterb2b_customer_tag](#dim_caterb2b_customer_tag) | 快驴事业部-客户所对应的标签 |
| [dim_caterb2b_dbus_delivery_times](#dim_caterb2b_dbus_delivery_times) | 配送时间表 |
| [dim_caterb2b_dbus_rt_abnormal_indicator](#dim_caterb2b_dbus_rt_abnormal_indicator) | 非异指标表 |
| [dim_caterb2b_dbus_rt_activity_seckill_scene](#dim_caterb2b_dbus_rt_activity_seckill_scene) |  |
| [dim_caterb2b_dbus_rt_activity_seckill_scene_goods](#dim_caterb2b_dbus_rt_activity_seckill_scene_goods) |  |
| [dim_caterb2b_dbus_rt_category](#dim_caterb2b_dbus_rt_category) | SKU分类表,支持1/2/3级分类 |
| [dim_caterb2b_dbus_rt_cg_prices](#dim_caterb2b_dbus_rt_cg_prices) |  |
| [dim_caterb2b_dbus_rt_csu_info](#dim_caterb2b_dbus_rt_csu_info) | 销售单元 |
| [dim_caterb2b_dbus_rt_csu_sales_info](#dim_caterb2b_dbus_rt_csu_sales_info) | CSU售卖模式 |
| [dim_caterb2b_dbus_rt_dam_org](#dim_caterb2b_dbus_rt_dam_org) | 组织机构节点信息 |
| [dim_caterb2b_dbus_rt_dam_user](#dim_caterb2b_dbus_rt_dam_user) | 用户信息表 |
| [dim_caterb2b_dbus_rt_dam_user_account](#dim_caterb2b_dbus_rt_dam_user_account) | 用户账号表 |
| [dim_caterb2b_dbus_rt_dam_user_pos](#dim_caterb2b_dbus_rt_dam_user_pos) | 用户岗位信息 |
| [dim_caterb2b_dbus_rt_item_promo_detail](#dim_caterb2b_dbus_rt_item_promo_detail) | 商品级别促销信息 |
| [dim_caterb2b_dbus_rt_poi](#dim_caterb2b_dbus_rt_poi) | 门店信息表 |
| [dim_caterb2b_dbus_rt_poi_delivery_guide](#dim_caterb2b_dbus_rt_poi_delivery_guide) | 门店配送引导表 |
| [dim_caterb2b_dbus_rt_rac_org_node](#dim_caterb2b_dbus_rt_rac_org_node) | 具体机构节点信息表 |
| [dim_caterb2b_dbus_rt_rac_org_pos_user](#dim_caterb2b_dbus_rt_rac_org_pos_user) | 机构-岗位-人员关联表 |
| [dim_caterb2b_dbus_rt_rac_org_type_meta](#dim_caterb2b_dbus_rt_rac_org_type_meta) | 节点类型表 |
| [dim_caterb2b_dbus_rt_service_provider](#dim_caterb2b_dbus_rt_service_provider) | 服务商表 |
| [dim_caterb2b_dbus_rt_sku](#dim_caterb2b_dbus_rt_sku) | SKU表 |
| [dim_caterb2b_dbus_rt_sku_info](#dim_caterb2b_dbus_rt_sku_info) | SKU信息表 |
| [dim_caterb2b_dbus_rt_spu](#dim_caterb2b_dbus_rt_spu) | SPU表 |
| [dim_caterb2b_dbus_rt_spu_info](#dim_caterb2b_dbus_rt_spu_info) | 商品信息表 |
| [dim_caterb2b_dbus_rt_warehouse_sku_info](#dim_caterb2b_dbus_rt_warehouse_sku_info) | sku基本信息表 |
| [dim_caterb2b_delivery_region](#dim_caterb2b_delivery_region) | 快驴-配送区域表 |
| [dim_caterb2b_delivery_warehouse_times](#dim_caterb2b_delivery_warehouse_times) | 仓履约时段表 |
| [dim_caterb2b_fresh_authority](#dim_caterb2b_fresh_authority) |  |
| [dim_caterb2b_organization_level](#dim_caterb2b_organization_level) | B2B组织机构节点关系平铺表 |
| [dim_caterb2b_region_bu](#dim_caterb2b_region_bu) | 快驴-事业部和大区映射维表 |
| [dim_caterb2b_rt_bd_detail](#dim_caterb2b_rt_bd_detail) | 快驴事业部-RAC组织结构人员实时信息数据 |
| [dim_caterb2b_rt_category_level3](#dim_caterb2b_rt_category_level3) | B2B业务部,后台3级分类表 |
| [dim_caterb2b_rt_csu](#dim_caterb2b_rt_csu) | 快驴csu信息表 |
| [dim_caterb2b_rt_customer](#dim_caterb2b_rt_customer) |  |
| [dim_caterb2b_rt_delivery_vehicle_type](#dim_caterb2b_rt_delivery_vehicle_type) | 配送车型表 |
| [dim_caterb2b_rt_sku_cat](#dim_caterb2b_rt_sku_cat) | 快驴sku分类信息表 |
| [dim_caterb2b_rt_sku_sale_mode_cat](#dim_caterb2b_rt_sku_sale_mode_cat) | sku预售分类 |
| [dim_caterb2b_supplier_arrive_time](#dim_caterb2b_supplier_arrive_time) |  |
| [dim_caterb2b_target_amt_per_car](#dim_caterb2b_target_amt_per_car) | 目标单车货值--预测用 |
| [dim_caterb2b_transport_depart_time_standard](#dim_caterb2b_transport_depart_time_standard) | 快驴-发车及时率标准上传表 |
| [dim_caterb2b_warehouse](#dim_caterb2b_warehouse) | 快驴事业部-仓库维表 |
| [dim_caterb2b_warehouse_his](#dim_caterb2b_warehouse_his) | B2B业务部-快驴仓库信息表 |
| [dim_caterb2b_wh_advance_minutes](#dim_caterb2b_wh_advance_minutes) |  |
| [dim_caterb2b_wh_delivery_time](#dim_caterb2b_wh_delivery_time) | 仓库-该仓单商户配送时长对应表 |
| [dim_customer_cat_ord_time_his](#dim_customer_cat_ord_time_his) |  |
| [dim_cust_zhongb_label](#dim_cust_zhongb_label) | 快驴-中B客户表 |
| [dim_date](#dim_date) |  |
| [dim_dbus_rt_warehouse_area](#dim_dbus_rt_warehouse_area) | 库区 |
| [dim_dbus_rt_warehouse_capacity](#dim_dbus_rt_warehouse_capacity) | 仓容信息 |
| [dim_dbus_rt_warehouse_container](#dim_dbus_rt_warehouse_container) | 设备信息 |
| [dim_dbus_rt_warehouse_location](#dim_dbus_rt_warehouse_location) | 库位 |
| [dim_dts_rt_customer_group_relation](#dim_dts_rt_customer_group_relation) | 客户组关联客户详情表 |
| [dim_dts_schedule_class](#dim_dts_schedule_class) | 班次信息 |
| [dim_purchase_asn_reservation_strategy](#dim_purchase_asn_reservation_strategy) | 仓配预约配额维度数据 |
| [dim_rt_sku_sale_mode_storage_cat](#dim_rt_sku_sale_mode_storage_cat) | sku预售贮存分类 |
| [dim_sm_racorg_bd_info](#dim_sm_racorg_bd_info) | 快驴事业部快驴事业部-RAC组织结构人员信息数据 |
| [dim_xt_off_caterb2b_customer_tag_day](#dim_xt_off_caterb2b_customer_tag_day) |  |
| [dim_xt_off_caterb2b_customer_tag_day_history](#dim_xt_off_caterb2b_customer_tag_day_history) |  |
| [dim_xt_off_caterb2b_vendor](#dim_xt_off_caterb2b_vendor) | 供应商维表 |
| [dwd_rt_topic_pacific_case_lifecycle](#dwd_rt_topic_pacific_case_lifecycle) | 工单实时宽表 |
| [dwd_wh_crane_nrt_parcel_sku](#dwd_wh_crane_nrt_parcel_sku) | 准实时包裹sku明细表 |
| [dws_crane_ranking_info](#dws_crane_ranking_info) |  |
| [dws_datacube_ranking_info](#dws_datacube_ranking_info) |  |
| [dws_flink_rt_bd_sales_amt](#dws_flink_rt_bd_sales_amt) | 快驴BD销售额汇总表 |
| [fact_operator_rf_pv_time](#fact_operator_rf_pv_time) |  |
| [mid_dim_caterb2b_bd](#mid_dim_caterb2b_bd) | B2B业务部-快驴BD信息表 |
| [mid_fact_caterb2b_city_csu_price_change](#mid_fact_caterb2b_city_csu_price_change) |  |
| [mid_fact_caterb2b_cross_bill_detail](#mid_fact_caterb2b_cross_bill_detail) | 投线统计任务汇总表 |
| [mid_fact_caterb2b_pick_bill_detail](#mid_fact_caterb2b_pick_bill_detail) | 拣货任务详情表 |
| [mid_fact_caterb2b_rt_activity_seckill_scene_goods](#mid_fact_caterb2b_rt_activity_seckill_scene_goods) |  |
| [mid_fact_caterb2b_rt_byr_csu_city](#mid_fact_caterb2b_rt_byr_csu_city) |  |
| [mid_fact_caterb2b_rt_case_detail](#mid_fact_caterb2b_rt_case_detail) |  |
| [mid_fact_caterb2b_rt_flink_marketing_activity](#mid_fact_caterb2b_rt_flink_marketing_activity) | 营销活动主题宽表 |
| [mid_fact_caterb2b_rt_flink_order_detail](#mid_fact_caterb2b_rt_flink_order_detail) | 快驴订单详情事实宽表 |
| [mid_fact_caterb2b_rt_flink_order_detail_bak](#mid_fact_caterb2b_rt_flink_order_detail_bak) | 快驴订单详情事实宽表 |
| [mid_fact_caterb2b_rt_flink_order_detail_with_pop](#mid_fact_caterb2b_rt_flink_order_detail_with_pop) | 快驴订单详情事实宽表 |
| [mid_fact_caterb2b_rt_order_detail](#mid_fact_caterb2b_rt_order_detail) | 快驴订单详情事实宽表 |
| [mid_fact_caterb2b_rt_order_detail_flink](#mid_fact_caterb2b_rt_order_detail_flink) | 快驴订单详情事实宽表 |
| [mid_fact_caterb2b_rt_purchase_inbound](#mid_fact_caterb2b_rt_purchase_inbound) | 采购入库中间表 |
| [mid_fact_caterb2b_rt_purchase_inbound_car](#mid_fact_caterb2b_rt_purchase_inbound_car) | 供应上商到货车次明细 |
| [mid_fact_caterb2b_rt_purchase_inbound_flink](#mid_fact_caterb2b_rt_purchase_inbound_flink) | 采购入库中间表-Flink |
| [mid_fact_caterb2b_rt_standard_stock_sku](#mid_fact_caterb2b_rt_standard_stock_sku) | 非预售品库存汇总表 |
| [mid_fact_caterb2b_rt_stock_sku](#mid_fact_caterb2b_rt_stock_sku) | 库存预警汇总表 |
| [mid_fact_caterb2b_rt_wh_delivery](#mid_fact_caterb2b_rt_wh_delivery) |  |
| [mid_fact_caterb2b_rt_wh_delivery_flink](#mid_fact_caterb2b_rt_wh_delivery_flink) | 配送明细实时宽表 |
| [mid_fact_caterb2b_rt_wh_delivery_take](#mid_fact_caterb2b_rt_wh_delivery_take) |  |
| [mid_fact_caterb2b_rt_wh_delivery_take_flink](#mid_fact_caterb2b_rt_wh_delivery_take_flink) | 提货明细宽表 |
| [mid_fact_caterb2b_rt_wh_delivery_take_inbound](#mid_fact_caterb2b_rt_wh_delivery_take_inbound) | 提货入库中间表 |
| [mid_fact_caterb2b_rt_wh_order_cat](#mid_fact_caterb2b_rt_wh_order_cat) |  |
| [mid_fact_caterb2b_rt_wh_order_cat_flink](#mid_fact_caterb2b_rt_wh_order_cat_flink) | 配送单订单flinkmid表 |
| [mid_fact_caterb2b_rt_wh_stock_attendance_user](#mid_fact_caterb2b_rt_wh_stock_attendance_user) | 仓储主题-考勤人员数据 |
| [mid_fact_caterb2b_rt_wh_stock_attendance_user_task](#mid_fact_caterb2b_rt_wh_stock_attendance_user_task) | 仓储主题-人员任务表 |
| [mid_fact_caterb2b_rt_wh_stock_check_task](#mid_fact_caterb2b_rt_wh_stock_check_task) | 仓储主题-复核-复核中间表 |
| [mid_fact_caterb2b_rt_wh_stock_route_check](#mid_fact_caterb2b_rt_wh_stock_route_check) | 仓储主题-核货-核货中间表 |
| [mid_fact_rt_flink_order_detail_for_purchase](#mid_fact_rt_flink_order_detail_for_purchase) | 快驴订单详情事实宽表-采购看板实时专用 |
| [mid_fact_rt_reservation_bill](#mid_fact_rt_reservation_bill) | 预约明细表 |
| [mid_outbound_detail_flink](#mid_outbound_detail_flink) | mid_outbound_detail |
| [mid_outbound_detail_flink_v2](#mid_outbound_detail_flink_v2) |  |
| [min_fact_caterb2b_cross_bill](#min_fact_caterb2b_cross_bill) | 缺货统计任务汇总表 |
| [min_fact_caterb2b_pick_bill](#min_fact_caterb2b_pick_bill) | 拣货任务详情表 |
| [min_fact_caterb2b_shortage_sku_bill](#min_fact_caterb2b_shortage_sku_bill) | 投线任务汇总表 |
| [mq_purchase_check](#mq_purchase_check) |  |
| [ods_dbus_task_opt_extra](#ods_dbus_task_opt_extra) | 任务过程拓展表 |
| [ods_dts_kuailv_kl_pms__purchase_bill](#ods_dts_kuailv_kl_pms__purchase_bill) | 新采购单表 |
| [ods_dts_kuailv_kl_pms__purchase_bill_detail](#ods_dts_kuailv_kl_pms__purchase_bill_detail) | 新采购单详情 |
| [ods_dts_rt_wh_delivery_bill](#ods_dts_rt_wh_delivery_bill) | 送货单表 |
| [ods_dts_rt_wh_delivery_bill_detail](#ods_dts_rt_wh_delivery_bill_detail) | 送货单详情 |
| [pay_evaluate](#pay_evaluate) | 美团评价相关 |
| [poc_rt_data](#poc_rt_data) | POC实时结果表 |
| [promotion_info](#promotion_info) | 促销信息表 |
| [tab1](#tab1) |  |
| [upload_table_standard_location](#upload_table_standard_location) | 上传表-库位使用报表-已标准化 |

**表名：** <a id="app_caterb2b_abnormal_bill">app_caterb2b_abnormal_bill</a>

**说明：** 非异表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | bill_no |   varchar   | 60 |   0    |    Y     |  N   |       | 相关单据编号  |
|  3   | bill_type |   tinyint   | 4 |   0    |    Y     |  N   |   -1    | 相关单据类型:-1无,0订单,1退单,2工单  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 门店ID  |
|  6   | customer_name |   varchar   | 255 |   0    |    N     |  N   |       | 商家名称  |
|  7   | bd_id |   int   | 10 |   0    |    Y     |  N   |   0    | 负责BDID  |
|  8   | city_id |   int   | 10 |   0    |    N     |  N   |   0    | 城市ID  |
|  9   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | fresh |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 是否含有生鲜:0无,1有  |
|  12   | alert_level |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 预警级别:0低,1高  |
|  13   | abnormal_bill_type |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 异常单类别:1非异,2运营异常,3体验风险异常  |
|  14   | abnor_status |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 异常状态:0废弃，1生效  |
|  15   | order_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 下单时间  |
|  16   | indicator_id |   bigint   | 20 |   0    |    N     |  N   |       | 异常指标ID  |
|  17   | indicator_name |   varchar   | 255 |   0    |    N     |  N   |       | 异常指标描述  |
|  18   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  19   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  20   | istatus |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  21   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  22   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最新更新时间  |
|  23   | create_by |   varchar   | 255 |   0    |    N     |  N   |       | 创建人名称  |
|  24   | last_modify_by |   varchar   | 255 |   0    |    N     |  N   |       | 最新操作人名称  |

**表名：** <a id="app_caterb2b_bd_efficiency_cooperative">app_caterb2b_bd_efficiency_cooperative</a>

**说明：** 快驴事业部-BD人效-BD累计合作商户数

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |   0    | 事业部ID  |
|  2   | org_id |   int   | 10 |   0    |    N     |  Y   |   0    | 销售组ID  |
|  3   | bd_id |   int   | 10 |   0    |    N     |  Y   |   0    | BDID  |
|  4   | food_all_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 餐饮组累计商户数  |
|  5   | trans_all_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 流通组累计商户数  |
|  6   | all_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 累计合作商户数  |

**表名：** <a id="app_caterb2b_bd_perf_org_ranking">app_caterb2b_bd_perf_org_ranking</a>

**说明：** BD人效实时-org指标排名表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | org_id |   int   | 10 |   0    |    N     |  Y   |       | 小组id  |
|  3   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  5   | bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  7   | pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 销售额排名  |
|  8   | last_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次销售额排名  |
|  9   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 商户数  |
|  10   | byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 商户数排名  |
|  11   | last_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上一名次商户数  |
|  12   | new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  13   | new_byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数排名  |
|  14   | last_new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上一名次新客数  |
|  15   | fresh_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 生鲜销售额  |
|  16   | fresh_pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数排名  |
|  17   | last_fresh_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次生鲜销售额  |
|  18   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |       | 统计时间  |
|  19   | meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 肉禽销售额  |
|  20   | meat_pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 肉禽销售额排名  |
|  21   | last_meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次肉禽销售额  |

**表名：** <a id="app_caterb2b_bd_perf_ranking">app_caterb2b_bd_perf_ranking</a>

**说明：** BD人效实时-bd指标排名表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | bd_info_id |   int   | 10 |   0    |    N     |  Y   |       | bdInfoId  |
|  3   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | bd名称  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  5   | bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  7   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  8   | pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  9   | pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 销售额排名  |
|  10   | last_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次销售额排名  |
|  11   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 商户数  |
|  12   | byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 商户数排名  |
|  13   | last_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上一名次商户数  |
|  14   | new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  15   | new_byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数排名  |
|  16   | last_new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上一名次新客数  |
|  17   | fresh_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 生鲜销售额  |
|  18   | fresh_pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数排名  |
|  19   | last_fresh_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次生鲜销售额  |
|  20   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |       | 统计时间  |
|  21   | meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 肉禽销售额  |
|  22   | meat_pym_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 肉禽销售额排名  |
|  23   | last_meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 上一名次肉禽销售额  |

**表名：** <a id="app_caterb2b_byr_index">app_caterb2b_byr_index</a>

**说明：** 商家维度统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 商家ID  |
|  3   | stock_orders |   json   | 1073741824 |   0    |    Y     |  N   |       | 缺货异常订单商品  |
|  4   | ab_deliverys |   json   | 1073741824 |   0    |    Y     |  N   |       | 配送异常订单  |
|  5   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_byr_login_log">app_caterb2b_byr_login_log</a>

**说明：** 商家登陆日志表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 商家ID  |
|  3   | earliest_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当天最早登陆时间  |
|  4   | latest_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当天最晚登陆时间  |
|  5   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_byr_search_log">app_caterb2b_byr_search_log</a>

**说明：** 商家搜索日志表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 商家ID  |
|  3   | latest_search_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当天最晚搜索时间  |
|  4   | keywords |   json   | 1073741824 |   0    |    Y     |  N   |       | 客户当天搜索最近关键词  |
|  5   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_cat_bu_city_ch_sale_amt">app_caterb2b_cat_bu_city_ch_sale_amt</a>

**说明：** 品类分析销售结果表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  Y   |       |   |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | cat1_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | cat2_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  6   | cat3_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  7   | total_count |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |
|  8   | gift_count |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |
|  9   | sale_price_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  10   | csu_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  12   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  13   | channel_id |   bigint   | 20 |   0    |    N     |  Y   |       | 渠道id  |
|  14   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  15   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |

**表名：** <a id="app_caterb2b_cat_bu_city_sale_amt">app_caterb2b_cat_bu_city_sale_amt</a>

**说明：** 品类分析销售结果表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  Y   |       |   |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | cat1_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | cat2_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  6   | cat3_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  7   | total_count |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |
|  8   | gift_count |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |
|  9   | sale_price_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  10   | csu_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  12   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_customer">app_caterb2b_customer</a>

**说明：** 实时分析客户信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | last_arranged_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最新一次成交单的下单时间  |
|  3   | stat_date |   varchar   | 32 |   0    |    Y     |  N   |       | 统计日期  |

**表名：** <a id="app_caterb2b_customer_debt">app_caterb2b_customer_debt</a>

**说明：** 快驴事业部-商户欠款分析

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | type |   int   | 10 |   0    |    Y     |  N   |       | 数据类型1事业部2销售组3人员  |
|  3   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部ID  |
|  4   | bu_name |   varchar   | 50 |   0    |    Y     |  N   |       | 事业部名称  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | city_name |   varchar   | 50 |   0    |    Y     |  N   |       | 城市名称  |
|  7   | bdm_id |   bigint   | 20 |   0    |    Y     |  N   |       | BDMID  |
|  8   | bdm_name |   varchar   | 50 |   0    |    Y     |  N   |       | BDM姓名  |
|  9   | org_id |   bigint   | 20 |   0    |    Y     |  N   |       | 销售组ID  |
|  10   | org_name |   varchar   | 50 |   0    |    Y     |  N   |       | 销售组名称  |
|  11   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | BDID  |
|  12   | bd_name |   varchar   | 50 |   0    |    Y     |  N   |       | BD姓名  |
|  13   | bd_misid |   varchar   | 50 |   0    |    Y     |  N   |       | BDMISID  |
|  14   | debt_ord_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 欠款单数  |
|  15   | debt_ord_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 欠款金额  |
|  16   | debt_rate |   decimal   | 39 |   6    |    Y     |  N   |       | 欠款比例  |
|  17   | last_day_add_debt |   decimal   | 39 |   6    |    Y     |  N   |       | 昨日新增欠款  |
|  18   | last_day_received_payments |   decimal   | 39 |   6    |    Y     |  N   |       | 昨日回款  |
|  19   | debt_cnt_3_7 |   bigint   | 20 |   0    |    Y     |  N   |       | 3-7日欠款单数  |
|  20   | debt_amt_3_7 |   decimal   | 39 |   6    |    Y     |  N   |       | 3-7日欠款金额  |
|  21   | debt_cnt_7 |   bigint   | 20 |   0    |    Y     |  N   |       | 7日以上欠款单数  |
|  22   | debt_amt_7 |   decimal   | 39 |   6    |    Y     |  N   |       | 7日以上欠款金额  |
|  23   | debt_cnt_15 |   bigint   | 20 |   0    |    Y     |  N   |       | 15日以上欠款单数  |
|  24   | debt_amt_15 |   decimal   | 39 |   6    |    Y     |  N   |       | 15日以上欠款金额  |
|  25   | debt_cnt_30 |   bigint   | 20 |   0    |    Y     |  N   |       | 30日以上欠款单数  |
|  26   | debt_amt_30 |   decimal   | 39 |   6    |    Y     |  N   |       | 30日以上欠款金额  |
|  27   | roll_sale_amt_30 |   decimal   | 39 |   6    |    Y     |  N   |       | 滚动30日销售额  |
|  28   | roll_sale_rate_30 |   decimal   | 39 |   6    |    Y     |  N   |       | 滚动30日销售占比  |

**表名：** <a id="app_caterb2b_data_flow_channel_kuailv">app_caterb2b_data_flow_channel_kuailv</a>

**说明：** 集团埋点数据表（快驴通道）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | app_name |   varchar   | 64 |   0    |    Y     |  N   |       | 应用名  |
|  3   | app_version |   varchar   | 64 |   0    |    Y     |  N   |       | 应用版本  |
|  4   | login_type |   varchar   | 64 |   0    |    Y     |  N   |       | 登录类型  |
|  5   | user_id |   bigint   | 20 |   0    |    N     |  N   |       | 用户ID  |
|  6   | val_lab |   json   | 1073741824 |   0    |    Y     |  N   |       | 事件属性  |
|  7   | uuid |   varchar   | 64 |   0    |    Y     |  N   |       | 美团唯一移动设备标识  |
|  8   | page_id |   bigint   | 20 |   0    |    N     |  N   |       | 页面ID  |
|  9   | page_name |   varchar   | 64 |   0    |    Y     |  N   |       | 页面名  |
|  10   | page_bu |   varchar   | 64 |   0    |    Y     |  N   |       | 页面BU  |
|  11   | page_type |   varchar   | 64 |   0    |    Y     |  N   |       | 页面类型  |
|  12   | page_bg |   varchar   | 64 |   0    |    Y     |  N   |       | 页面BG  |
|  13   | page_identifier |   varchar   | 64 |   0    |    Y     |  N   |       | 页面标识  |
|  14   | event_id |   varchar   | 64 |   0    |    Y     |  N   |       | 事件ID  |
|  15   | event_type |   varchar   | 64 |   0    |    Y     |  N   |       | 事件类型  |
|  16   | event_timestamp |   bigint   | 20 |   0    |    N     |  N   |       | 事件发生时间  |
|  17   | brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  18   | access_point_name |   varchar   | 64 |   0    |    Y     |  N   |       | 访问点名称  |
|  19   | download_channel |   varchar   | 64 |   0    |    Y     |  N   |       | 下载渠道  |
|  20   | launch_channel |   varchar   | 64 |   0    |    Y     |  N   |       | 启动渠道  |
|  21   | log_channel |   varchar   | 64 |   0    |    Y     |  N   |       | 日志渠道  |
|  22   | log_creation_time |   datetime   | 19 |   0    |    Y     |  N   |       | 日志创建时间  |
|  23   | log_category |   varchar   | 64 |   0    |    Y     |  N   |       | 日志类别  |

**表名：** <a id="app_caterb2b_dbus_cross_sorting">app_caterb2b_dbus_cross_sorting</a>

**说明：** 投线任务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | cross_sorting_no |   varchar   | 50 |   0    |    Y     |  N   |       | 投线任务编号  |
|  3   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |       | 原规格编码  |
|  4   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | 规格编码  |
|  5   | total_count |   int   | 10 |   0    |    Y     |  N   |       | sku总件数  |
|  6   | total_count_indeed |   int   | 10 |   0    |    Y     |  N   |       | 实投sku总件数  |
|  7   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人账号id  |
|  8   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  9   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 完成时间  |
|  10   | cross_sorting_status |   varchar   | 4 |   0    |    Y     |  N   |       | 投线状态10已生成20投线中30投线暂停40投线完成  |
|  11   | route_count |   int   | 10 |   0    |    Y     |  N   |       | 线路总数  |
|  12   | route_count_indeed |   int   | 10 |   0    |    Y     |  N   |       | 实投线路总数  |
|  13   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  14   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  16   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  17   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  18   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  19   | istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |

**表名：** <a id="app_caterb2b_dbus_cross_sorting_item">app_caterb2b_dbus_cross_sorting_item</a>

**说明：** 投线任务项

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | cross_sorting_id |   bigint   | 20 |   0    |    N     |  N   |       | 投线任务id  |
|  3   | cross_sorting_no |   varchar   | 50 |   0    |    N     |  N   |       | 投线任务编号  |
|  4   | processed |   varchar   | 4 |   0    |    N     |  N   |   0    | 是否已处理0未处理，1已处理  |
|  5   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 原规格编码  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格编码  |
|  7   | route_no |   varchar   | 32 |   0    |    N     |  N   |       | 排线编号  |
|  8   | delivery_times |   varchar   | 512 |   0    |    Y     |  N   |       | 配送时间段  |
|  9   | sorting_count |   int   | 10 |   0    |    N     |  N   |       | 应投数量  |
|  10   | sorting_indeed |   int   | 10 |   0    |    Y     |  N   |       | 实投数量  |
|  11   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道id  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  13   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       | 修改时间  |
|  15   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |
|  16   | istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |

**表名：** <a id="app_caterb2b_dbus_delivery">app_caterb2b_dbus_delivery</a>

**说明：** 配送表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       | 订单号  |
|  4   | order_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 订单下单时间  |
|  5   | delivery_bill_no |   varchar   | 32 |   0    |    N     |  N   |       | 配送单号  |
|  6   | outbound_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 出库单号  |
|  7   | ware_house_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库ID  |
|  8   | cancel_status |   bit   | 1 |   0    |    N     |  N   |   0    | 是否取消1：取消0：未取消  |
|  9   | delivery_line |   varchar   | 50 |   0    |    N     |  N   |       | 配送线路  |
|  10   | is_completed |   varchar   | 4 |   0    |    N     |  N   |       | 已完成1未完成0  |
|  11   | is_abnormal_signed |   varchar   | 4 |   0    |    Y     |  N   |   0    | 是否异常是1否0  |
|  12   | delivery_bill_status |   varchar   | 4 |   0    |    N     |  N   |   1    | 配送单状态1已生成2已发车3已送达  |
|  13   | complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  14   | unit_total |   int   | 10 |   0    |    N     |  N   |   0    | 订单件数  |
|  15   | delivery_times |   varchar   | 256 |   0    |    Y     |  N   |       | 配送时间段  |
|  16   | service_provider_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 所属区域的履约服务商ID  |
|  17   | route_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 排线ID  |
|  18   | istatus |   int   | 10 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  19   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  20   | create_account |   varchar   | 64 |   0    |    N     |  N   |       | 创建账号  |
|  21   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  22   | last_modify_account |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改账号  |
|  23   | order_label |   int   | 10 |   0    |    N     |  N   |   0    | 订单标签，0：未知，1：普通订单；2：大宗订单  |
|  24   | address_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 门店地址ID  |
|  25   | service_provider_name |   varchar   | 128 |   0    |    N     |  N   |       | 所属区域的履约服务商名称  |
|  26   | volume_total |   decimal   | 16 |   3    |    N     |  N   |   0.000    | 订单体积  |
|  27   | weight_total |   decimal   | 16 |   3    |    N     |  N   |   0.000    | 订单重量  |
|  28   | is_complete_short_supply |   smallint   | 6 |   0    |    Y     |  N   |       | 是否整单缺货1：是0：否  |
|  29   | accept_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否已接单  |
|  30   | actual_delivery_time |   varchar   | 32 |   0    |    N     |  N   |       | 实际配送时间  |
|  31   | sign_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 签收类型1：正常签收；2：整单拒收；3：部分签收；4：物流代签  |
|  32   | appointment_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  33   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 客户ID  |
|  34   | customer_level |   varchar   | 32 |   0    |    N     |  N   |       | 客户级别  |
|  35   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店ID  |
|  36   | poi_name |   varchar   | 255 |   0    |    N     |  N   |       | 门店名称  |
|  37   | bd_name |   varchar   | 128 |   0    |    N     |  N   |       | bd名  |
|  38   | bd_phone |   varchar   | 64 |   0    |    N     |  N   |       | bd电话  |
|  39   | sign_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 签收方式1：当面签收；2：非当面签收  |
|  40   | order_category_label |   int   | 10 |   0    |    Y     |  N   |   0    | 订单运输品类0：空；1：全标品；2:含蔬菜；4：含鲜肉；6：含蔬菜，含鲜肉；8:含冻品；10：含蔬菜，含冻品；12：含鲜肉，含冻品；14：含蔬菜，含鲜肉，含冻品  |
|  41   | delivery_product |   int   | 10 |   0    |    Y     |  N   |   0    | 配送产品名称0：未知1：极鲜达2：下午达3：标准达  |

**表名：** <a id="app_caterb2b_dbus_delivery_detail">app_caterb2b_dbus_delivery_detail</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | delivery_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  3   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  4   | delivery_qty |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | actual_delivery_qty |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  8   | sku_price |   varchar   | 32 |   0    |    N     |  N   |   0    | 单价  |
|  9   | order_coupon_amount |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 下单优惠分摊金额  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库id  |

**表名：** <a id="app_caterb2b_dbus_delivery_route">app_caterb2b_dbus_delivery_route</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | ware_house_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库id  |
|  4   | route_no |   varchar   | 22 |   0    |    N     |  N   |       | 排线编号  |
|  5   | route_name |   varchar   | 20 |   0    |    N     |  N   |       | 排线名称  |
|  6   | route_date |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    |   |
|  7   | route_status |   int   | 10 |   0    |    Y     |  N   |   1    | 排线状态。1：待接线，2：已接线，3：已发车  |
|  8   | audit_committed |   int   | 10 |   0    |    Y     |  N   |   0    | 是否审核1：是0：否  |
|  9   | driver_id |   int   | 10 |   0    |    Y     |  N   |       | 司机ID  |
|  10   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机姓名  |
|  11   | service_provider_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 服务商id  |
|  12   | vehicle_type_id |   int   | 10 |   0    |    Y     |  N   |       | 车型id  |
|  13   | vehicle_type_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  14   | driver_service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属履约服务商名称  |
|  15   | driver_service_provider_id |   int   | 10 |   0    |    Y     |  N   |       | 司机所属服务商ID  |
|  16   | cooperation_mode |   smallint   | 6 |   0    |    Y     |  N   |   0    | 服务商合作模式:0未知10自营20三方  |
|  17   | istatus |   int   | 10 |   0    |    Y     |  N   |   1    | 逻辑删除正常1,删除0  |
|  18   | order_label |   int   | 10 |   0    |    Y     |  N   |       | 订单标签，1：普通订单；2：大宗订单  |
|  19   | load_factor |   decimal   | 9 |   2    |    Y     |  N   |   0.00    | 载重率  |
|  20   | transport_type |   int   | 10 |   0    |    Y     |  N   |   1    | 运输方式1：专车；2：顺风车  |
|  21   | route_type |   int   | 10 |   0    |    Y     |  N   |       |   |
|  22   | complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 配送单完成时间  |
|  23   | appoint_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 履约时间  |
|  24   | final_complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最终完成时间  |
|  25   | take_complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 提货单完成时间  |
|  26   | depart_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 发车时间  |
|  27   | accept_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 接单时间  |
|  28   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  29   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  30   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  31   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |
|  32   | data_env |   varchar   | 20 |   0    |    N     |  N   |   common    | 当前数据环境  |
|  33   | region_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 归属区域  |
|  34   | region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 区域名称  |
|  35   | route_transfer_type |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 单据转移类型0正常1被调单2调单3被救援4救援  |
|  36   | route_status_new |   int   | 10 |   0    |    Y     |  N   |   0    | 排线状态。0：无意义老数据，10：初始态，20：已审核30：已绑定40：已下发50：已接线60：已核货70：已发车80：已完成  |
|  37   | delivery_product |   varchar   | 128 |   0    |    Y     |  N   |       | 配送产品  |
|  38   | supervisor |   varchar   | 64 |   0    |    Y     |  N   |       | 区域责任主管  |
|  39   | time_interval |   int   | 10 |   0    |    Y     |  N   |       | 1:上午2:下午  |

**表名：** <a id="app_caterb2b_dbus_grid_customer_relation">app_caterb2b_dbus_grid_customer_relation</a>

**说明：** 网格与客户关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | grid_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 网格id  |
|  3   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 客户id  |
|  4   | customer_name |   varchar   | 60 |   0    |    N     |  N   |       | 客户名称  |
|  5   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部id  |
|  6   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  7   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  9   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  11   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="app_caterb2b_dbus_manufacture_board">app_caterb2b_dbus_manufacture_board</a>

**说明：** 加工看板

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | profit_date |   date   | 10 |   0    |    N     |  N   |   1970-01-01    | 收益日  |
|  5   | manufacture_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 加工方式,0:称重加工,1:数量加工  |
|  6   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 主规格  |
|  7   | sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 规格代码  |
|  8   | sku_name |   varchar   | 128 |   0    |    N     |  N   |       | 成品商品名称  |
|  9   | sku_pack_spec |   int   | 10 |   0    |    N     |  N   |   0    | 成品包装规格  |
|  10   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 成品规格描述  |
|  11   | attribute |   varchar   | 512 |   0    |    Y     |  N   |       | 属性(优质)  |
|  12   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 成品规格单位(袋)  |
|  13   | task_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 任务需加工量  |
|  14   | finish_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 任务已加工量  |
|  15   | require_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 剩余未加工量  |
|  16   | replenish_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 应补任务量(当日实时销量-成品在库量-加工未完成量)  |
|  17   | real_sale_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 实时销量  |
|  18   | yesterday_sale_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 昨日销量  |
|  19   | period_sale_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 上周同期销量  |
|  20   | avg_seven_sale_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 7日平均销量  |
|  21   | avg_three_sale_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 3日平均销量  |
|  22   | onhand_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 成品在库量  |
|  23   | material_quantity |   decimal   | 19 |   2    |    N     |  N   |   0.00    | 原料可用库存  |
|  24   | material_processed_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 原料可加工数  |
|  25   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 状态,1有效,0删除  |
|  26   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  27   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  28   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |
|  29   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后更新人  |

**表名：** <a id="app_caterb2b_dbus_manufacture_record">app_caterb2b_dbus_manufacture_record</a>

**说明：** 加工流水记录表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | task_no |   varchar   | 64 |   0    |    N     |  N   |       | 任务单号  |
|  5   | workbench_code |   varchar   | 64 |   0    |    N     |  N   |       | 加工台编号  |
|  6   | profit_date |   date   | 10 |   0    |    N     |  N   |   1970-01-01    | 收益日  |
|  7   | manufacture_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 加工方式,0:称重加工,1:数量加工  |
|  8   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 成品sku编码  |
|  9   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 成品sku规格编码  |
|  10   | sku_name |   varchar   | 128 |   0    |    N     |  N   |       | 成品商品名称  |
|  11   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 成品商品规格描述  |
|  12   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 成品商品单位  |
|  13   | sku_brand |   varchar   | 64 |   0    |    N     |  N   |       | 成品品牌  |
|  14   | sku_shelf_life |   int   | 10 |   0    |    N     |  N   |   0    | 成品保质期  |
|  15   | sku_production_place |   varchar   | 64 |   0    |    N     |  N   |       | 成品产地  |
|  16   | purchase_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 采购单号  |
|  17   | sku_supplier_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 供应商ID  |
|  18   | sku_supplier_code |   varchar   | 64 |   0    |    N     |  N   |       | 供应商Code(库存返回该字段，POC无)  |
|  19   | sku_supplier_name |   varchar   | 128 |   0    |    N     |  N   |       | 供应商/经销商  |
|  20   | pkg_code |   varchar   | 64 |   0    |    N     |  N   |       | 包裹编码,加工类型标识（0：供应商加工1：库内加工）+仓库ID（4位）+年月日（6位）+流水号（6位）  |
|  21   | pkg_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 包裹状态,1:待上架2:已上架3:已出库4:已拆包  |
|  22   | pkg_actual_weight |   decimal   | 8 |   2    |    N     |  N   |   0.00    | 包裹实重  |
|  23   | materials_quantity |   decimal   | 8 |   2    |    N     |  N   |   0.00    | 原料用量  |
|  24   | pkg_weight_unit |   varchar   | 16 |   0    |    N     |  N   |       | 称重单位  |
|  25   | print_num |   smallint   | 6 |   0    |    N     |  N   |   0    | 打印次数  |
|  26   | print_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后打印时间  |
|  27   | operator_id |   varchar   | 128 |   0    |    N     |  N   |       | 操作人ID  |
|  28   | operator_name |   varchar   | 128 |   0    |    N     |  N   |       | 包装人(操作人名称)  |
|  29   | operate_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 包装时间  |
|  30   | pack_duration |   bigint   | 20 |   0    |    N     |  N   |   0    | 加工时长,单位秒  |
|  31   | unpack_operator_id |   varchar   | 128 |   0    |    N     |  N   |       | 拆包人Id  |
|  32   | unpack_operator_name |   varchar   | 128 |   0    |    N     |  N   |       | 拆包人  |
|  33   | unpack_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 拆包时间  |
|  34   | device_id |   varchar   | 64 |   0    |    N     |  N   |       | 设备ID(安卓类型不可为空)  |
|  35   | device_type |   smallint   | 6 |   0    |    N     |  N   |       | 设备类型,1:安卓2:PC  |
|  36   | bind_order_no |   varchar   | 64 |   0    |    N     |  N   |       | 订单编号  |
|  37   | bind_driver_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 绑重司机id  |
|  38   | bind_driver_name |   varchar   | 32 |   0    |    N     |  N   |       | 绑重司机姓名  |
|  39   | bind_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 绑重/解绑时间  |
|  40   | bind_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 绑重状态0:未绑重1:已绑重  |
|  41   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除,0:删除1:有效  |
|  42   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  43   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  44   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |
|  45   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后更新人  |

**表名：** <a id="app_caterb2b_dbus_outbound_bill">app_caterb2b_dbus_outbound_bill</a>

**说明：** 出库单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | outbound_bill_no |   varchar   | 2048 |   0    |    Y     |  N   |       | 出库单号  |
|  5   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 订单号  |
|  6   | order_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 下单时间  |
|  7   | return_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 退货单号  |
|  8   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店Id  |
|  9   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 商家id  |
|  10   | delivery_route_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 排线id  |
|  11   | delivery_route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  12   | outbound_bill_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 出库单状态1已生成2出库完成，5已生成拣货任务，6拣货中，7拣货完成，8已集货，  |
|  13   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  14   | delivery_times |   varchar   | 256 |   0    |    Y     |  N   |       | 配送时间段  |
|  15   | order_shortage |   bit   | 1 |   0    |    Y     |  N   |       | 0缺货1不缺货  |
|  16   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除:0删除  |
|  17   | cancel_status |   bit   | 1 |   0    |    N     |  N   |   0    | 是否取消1：取消0：未取消  |
|  18   | business_id |   int   | 10 |   0    |    N     |  N   |   0    | 商家  |
|  19   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  20   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  21   | scheduled_delivery_date |   timestamp   | 19 |   0    |    Y     |  N   |       | 预计配送履约时间格式yyyy-mm-dd  |
|  22   | outbound_bill_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 1订单出库2调整出库3升级出库4降级出库5退货出库6消残出库7.调拨8.盘亏9样品10检验品  |
|  23   | outbound_bill_source |   smallint   | 6 |   0    |    Y     |  N   |   1    | 出库单来源1自建2订单系统下发3品级调整4PMS  |

**表名：** <a id="app_caterb2b_dbus_pick_bill">app_caterb2b_dbus_pick_bill</a>

**说明：** 拣货任务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  4   | pick_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 拣货单编号  |
|  5   | istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |
|  6   | pick_status |   varchar   | 4 |   0    |    N     |  N   |   10    | 拣货任务的状态10已生成，20拣货中30拣货完成40已取消  |
|  7   | policy_type |   varchar   | 4 |   0    |    N     |  N   |   10    | 策略:10储位拣货策略,20投线策略,30储位与投线策略  |
|  8   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  9   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  10   | order_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣sku数  |
|  11   | actual_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣sku数  |
|  12   | order_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  13   | actual_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  14   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  16   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  17   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  18   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 任务领取人账号ID  |
|  19   | handler_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |

**表名：** <a id="app_caterb2b_dbus_pick_bill_detail">app_caterb2b_dbus_pick_bill_detail</a>

**说明：** 出库单对应的sku信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  4   | biz_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 业务单号，如订单号，调拨出库单号，退供应商单号  |
|  5   | pick_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 拣货任务编号  |
|  6   | outbound_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 出库单号  |
|  7   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  8   | policy_type |   varchar   | 4 |   0    |    N     |  N   |   10    | 策略:10储位拣货策略,20投线策略，40总拣再投线  |
|  9   | istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 逻辑删除1有效，0删除  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  11   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  12   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  13   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  14   | route_no |   varchar   | 22 |   0    |    Y     |  N   |       | 排线号  |
|  15   | wrap_status |   varchar   | 4 |   0    |    Y     |  N   |       | 包装物标识1是0否  |

**表名：** <a id="app_caterb2b_dbus_pick_bill_location_detail">app_caterb2b_dbus_pick_bill_location_detail</a>

**说明：** 储位任务按照商品储位和sku维度记录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | ware_house_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  4   | pick_bill_no_re |   varchar   | 50 |   0    |    Y     |  N   |       | 拣货单号  |
|  5   | pick_bill_no |   varchar   | 50 |   0    |    N     |  N   |       | 拣货任务编号  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  7   | policy_type |   smallint   | 6 |   0    |    N     |  N   |   10    | 策略:10储位拣货策略,20投线策略,40总拣再投线  |
|  8   | location_order_qty |   int   | 10 |   0    |    N     |  N   |       | 储位应拣数量  |
|  9   | location_actual_qty |   int   | 10 |   0    |    Y     |  N   |       | 储位实捡数量  |
|  10   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | sku的拣货完成时间  |
|  11   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除:1有效0删除  |
|  12   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  13   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  14   | task_type |   smallint   | 6 |   0    |    N     |  N   |   10    | 任务类型：10主任务，20子任务  |
|  15   | picking_type |   smallint   | 6 |   0    |    Y     |  N   |   10    | 拣货类型10、正常拣货20、补货拣货  |

**表名：** <a id="app_caterb2b_dbus_rt_activity_reduction">app_caterb2b_dbus_rt_activity_reduction</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部ID  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  4   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  5   | activity_name |   varchar   | 255 |   0    |    N     |  N   |       | 活动名称  |
|  6   | start_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 开始时间，毫秒数  |
|  7   | end_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 结束时间，毫秒数  |
|  8   | activity_state |   int   | 10 |   0    |    Y     |  N   |   0    | 约束状态，1:未开始，2:活动中，3:已暂停，4:已结束，5:已取消  |
|  9   | deleted |   tinyint   | 4 |   0    |    N     |  N   |   1    | 删除标记1-正常2-删除  |
|  10   | target_user |   tinyint   | 4 |   0    |    N     |  N   |   0    | 目标用户，1:全体  |
|  11   | join_way |   tinyint   | 4 |   0    |    N     |  N   |   0    | 参与方式，1:全场，2:部分参加，3:部分不参加  |
|  12   | activity_type |   tinyint   | 4 |   0    |    N     |  N   |   0    | 满减类型，2:阶梯满减，3:每满减，4:阶梯满赠，5:每满赠  |
|  13   | discount_way |   tinyint   | 4 |   0    |    N     |  N   |   0    | 优惠规则，1:阶梯优惠，2:每满优惠  |
|  14   | ctime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间，毫秒数  |
|  15   | create_acc |   varchar   | 100 |   0    |    N     |  N   |       | 创建人账号  |
|  16   | utime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间，毫秒数  |
|  17   | update_acc |   varchar   | 100 |   0    |    N     |  N   |       | 更新人账号  |
|  18   | pay_way |   tinyint   | 4 |   0    |    N     |  N   |   1    | 支付方式，1为不限  |
|  19   | goods_type |   tinyint   | 4 |   0    |    N     |  N   |   1    | 商品类型，1按SKU参与，2按品类参与  |

**表名：** <a id="app_caterb2b_dbus_rt_activity_seckill_scene">app_caterb2b_dbus_rt_activity_seckill_scene</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | activity_seckill_id |   bigint   | 20 |   0    |    Y     |  N   |       | 秒杀活动外键  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  4   | start_time |   datetime   | 23 |   0    |    Y     |  N   |       | 开始时间，毫秒数  |
|  5   | end_time |   datetime   | 23 |   0    |    Y     |  N   |       | 结束时间，毫秒数  |
|  6   | state |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 约束状态，1:未开始，2:活动中，3:已暂停，4:已结束，5:已取消，6:待提审，7:操作冻结  |
|  7   | seq_no |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 秒杀场次号  |
|  8   | ctime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  9   | create_acc |   varchar   | 100 |   0    |    Y     |  N   |       | 创建人账号  |
|  10   | utime |   timestamp   | 19 |   0    |    N     |  N   |   0000-00-0000:00:00    | 更新时间  |
|  11   | update_acc |   varchar   | 100 |   0    |    N     |  N   |       | 更新人账号  |
|  12   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | dealer_id  |
|  13   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | channel_id  |

**表名：** <a id="app_caterb2b_dbus_rt_activity_seckill_scene_goods">app_caterb2b_dbus_rt_activity_seckill_scene_goods</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | activity_seckill_id |   bigint   | 20 |   0    |    Y     |  N   |       | 秒杀活动外键  |
|  3   | activity_seckill_scene_id |   bigint   | 20 |   0    |    Y     |  N   |       | 秒杀活动场次外键  |
|  4   | csu_code |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  5   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  6   | sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | skuCode  |
|  7   | ssu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 秒杀商品名称  |
|  8   | discount_price |   int   | 10 |   0    |    Y     |  N   |   0    | 折扣价格  |
|  9   | price_version |   tinyint   | 3 |   0    |    Y     |  N   |   1    | 价格版本  |
|  10   | poi_top |   int   | 10 |   0    |    Y     |  N   |   0    | 门店限购数量  |
|  11   | total_top |   int   | 10 |   0    |    Y     |  N   |   0    | 总限购数量  |
|  12   | remain_top |   int   | 10 |   0    |    Y     |  N   |   0    | 剩余限购数  |
|  13   | sort_num |   int   | 10 |   0    |    Y     |  N   |   0    | 商品排序号  |
|  14   | version |   smallint   | 5 |   0    |    Y     |  N   |   1    | 商品列表快照版本号  |
|  15   | price_type |   int   | 10 |   0    |    Y     |  N   |   1    | 用户类型1-不区分；2-区分、新客价；3-区分、老客价  |
|  16   | lock_version |   int   | 10 |   0    |    Y     |  N   |   1    | 秒杀商品锁版本  |
|  17   | deleted |   bit   | 1 |   0    |    Y     |  N   |   1    | 删除标记1-正常2-删除  |
|  18   | ctime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  19   | utime |   timestamp   | 19 |   0    |    N     |  N   |   0000-00-0000:00:00    | 更新时间  |

**表名：** <a id="app_caterb2b_dbus_rt_asn_reservation_bill">app_caterb2b_dbus_rt_asn_reservation_bill</a>

**说明：** 预约单信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  5   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  6   | supplier_code |   varchar   | 64 |   0    |    Y     |  N   |       | 供应商ID  |
|  7   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名称  |
|  8   | reserve_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-起始  |
|  9   | reserve_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-截止  |
|  10   | unload_time |   datetime   | 19 |   0    |    Y     |  N   |       | 卸货完成时间  |
|  11   | total_volume |   float   | 13 |   0    |    Y     |  N   |       | 总体积(立方米)  |
|  12   | reserve_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 预约数量（或重量）  |
|  13   | reservation_bill_type |   int   | 10 |   0    |    N     |  N   |   1    | 预约单类型：0-非预售品，1-预售品  |
|  14   | reservation_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 预约状态：1-已预约，2-已签到，3-完成，4-取消  |
|  15   | cancel_reason |   smallint   | 6 |   0    |    Y     |  N   |       | 取消原因：枚举类  |
|  16   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1-正常，0-删除  |
|  17   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  18   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  19   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改人  |
|  20   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  21   | temperature_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 贮存温区：0-空；1-常温，2-冷冻，3-冷藏  |
|  22   | reserve_whole_package_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 实际占用的箱数  |
|  23   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型：0-全部；1-自营；2-pop；3-代仓代配  |

**表名：** <a id="app_caterb2b_dbus_rt_asn_reservation_bill_detail">app_caterb2b_dbus_rt_asn_reservation_bill_detail</a>

**说明：** 预约单明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  4   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  5   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  6   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  7   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | 规格代码  |
|  8   | reserve_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 预约数量  |
|  9   | received_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 入库收货数量  |
|  10   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除  |
|  11   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建人  |
|  12   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  13   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改人  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  15   | temperature_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 贮存温区：0-空；1-常温，2-冷冻，3-冷藏  |
|  16   | outer_packing_factor |   int   | 10 |   0    |    Y     |  N   |       | 箱规  |

**表名：** <a id="app_caterb2b_dbus_rt_asn_reservation_car_operation">app_caterb2b_dbus_rt_asn_reservation_car_operation</a>

**说明：** 预约单车次维度操作信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  4   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  5   | car_plate |   varchar   | 64 |   0    |    Y     |  N   |       | 签到车牌照  |
|  6   | car_sequence |   smallint   | 5 |   0    |    Y     |  N   |   1    | 签到车次排序标识  |
|  7   | sign_from |   smallint   | 5 |   0    |    Y     |  N   |   2    | 签到来源：0-司机扫码，1-PC签到，2-初始值，3-系统自动签到  |
|  8   | sign_status |   smallint   | 6 |   0    |    Y     |  N   |   2    | 签到状态：0-成功，1-失败，2-初始值  |
|  9   | reserve_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预约开始时间  |
|  10   | reserve_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预约结束时间  |
|  11   | sign_time |   datetime   | 19 |   0    |    Y     |  N   |       | 车次签到时间  |
|  12   | unload_time |   datetime   | 19 |   0    |    Y     |  N   |       | 车次卸货完成时间  |
|  13   | sign_fail_reason |   varchar   | 128 |   0    |    Y     |  N   |       | 签到失败原因  |
|  14   | istatus |   smallint   | 5 |   0    |    Y     |  N   |   1    | 逻辑删除：1-正常，0-删除  |
|  15   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建人  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  17   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改人  |
|  18   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_dbus_rt_asn_reservation_sign">app_caterb2b_dbus_rt_asn_reservation_sign</a>

**说明：** 预约单签到信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  5   | sign_from |   smallint   | 6 |   0    |    N     |  N   |   1    | 签到来源：0-司机扫码，1-PC签到  |
|  6   | sign_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到时间  |
|  7   | sign_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 签到状态：0-成功，1-失败  |
|  8   | sign_fail_reason |   varchar   | 128 |   0    |    Y     |  N   |       | 签到失败的原因  |
|  9   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1-正常，0-删除  |
|  10   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |

**表名：** <a id="app_caterb2b_dbus_rt_asn_storage_type_statistics">app_caterb2b_dbus_rt_asn_storage_type_statistics</a>

**说明：** 温区使用量统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  4   | temperature_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 所属温区：0-默认，1-常温，2-冷冻，3-冷藏  |
|  5   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  6   | reserve_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-起始  |
|  7   | reserve_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-截止  |
|  8   | use_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 实际占用数量（或重量）  |
|  9   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除：1-正常，0-删除  |
|  10   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建人  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改人  |
|  13   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  14   | use_whole_package_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 实际占用的箱数  |

**表名：** <a id="app_caterb2b_dbus_rt_attendance_info">app_caterb2b_dbus_rt_attendance_info</a>

**说明：** 考勤信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | class_id |   bigint   | 20 |   0    |    N     |  N   |       | 班次id  |
|  4   | schedule_id |   bigint   | 20 |   0    |    N     |  N   |       | 排班id  |
|  5   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  6   | labour_id |   bigint   | 20 |   0    |    N     |  N   |       | 人员id  |
|  7   | labour_service_type |   smallint   | 6 |   0    |    Y     |  N   |       | 0:固定工1:临时工2:小时工  |
|  8   | provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 服务商id  |
|  9   | job_position_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位类型  |
|  10   | temporary_status |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否临时工0:否1:是  |
|  11   | attence_date |   date   | 10 |   0    |    N     |  N   |       | 考勤日期  |
|  12   | first_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 首次打卡时间  |
|  13   | end_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 末次打卡时间  |
|  14   | attence_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 考勤计算开始时间  |
|  15   | attence_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 考勤计算结束时间  |
|  16   | status |   tinyint   | 4 |   0    |    Y     |  N   |       | 考勤状态:0--无,1--正常,2--休,3--假,4--迟到,5--早退,6--半天旷工,7--全天旷工,8--迟到+半天旷工,9--早退+半天旷工,10--迟到+早退  |
|  17   | istatus |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  18   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  19   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  20   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  21   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_biz_return">app_caterb2b_dbus_rt_biz_return</a>

**说明：** 退货单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | return_no |   varchar   | 60 |   0    |    Y     |  N   |       | 退货单号  |
|  3   | after_sales_type |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 售后类型：1-退货，3-退押金  |
|  4   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  5   | order_no |   varchar   | 60 |   0    |    Y     |  N   |       | 订单号  |
|  6   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店ID  |
|  7   | poi_name |   varchar   | 255 |   0    |    Y     |  N   |       | 门店名称  |
|  8   | return_excuse |   varchar   | 255 |   0    |    Y     |  N   |       | 退货原因  |
|  9   | return_remark |   varchar   | 1024 |   0    |    Y     |  N   |       | 退货描述  |
|  10   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  11   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  12   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  13   | status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 退货状态：10-待处理，40-已确认，50-已收退货，60-已装车，70-已入库，80-已完成，90-已拒绝;YSL:120-已生效，170-确认入库，180-已完成，190-已取消  |
|  14   | sub_status |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 辅助状态  |
|  15   | inbound_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 入库单号  |
|  16   | inbound_warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 入库仓库ID  |
|  17   | inbound_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库时间  |
|  18   | creator_id |   int   | 10 |   0    |    Y     |  N   |       | 创建人ID  |
|  19   | creator_name |   varchar   | 60 |   0    |    N     |  N   |       | 创建人  |
|  20   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  21   | sign_status |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 签收状态：1-已签收、2-当场退货  |
|  22   | source |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 来源  |
|  23   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  24   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  25   | cancel_second_excuse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 取消退单二级原因id  |

**表名：** <a id="app_caterb2b_dbus_rt_cart_item">app_caterb2b_dbus_rt_cart_item</a>

**说明：** 购物车表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | acct_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 客户ID  |
|  3   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  4   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店ID  |
|  5   | suit_id |   bigint   | 20 |   0    |    Y     |  N   |       | 套装id  |
|  6   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | 商品CSUCode  |
|  7   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | 商品SKUCode  |
|  8   | spu_code |   varchar   | 30 |   0    |    Y     |  N   |       | 商品SPUCODE  |
|  9   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  10   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  11   | quantity |   int   | 10 |   0    |    Y     |  N   |   0    | 商品数量  |
|  12   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 商品类型：1-订购品、2-定制品、3-补偿品、4-赠品  |
|  13   | bd_operate |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 是否bd更新  |
|  14   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  15   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  16   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="app_caterb2b_dbus_rt_case_biz_order">app_caterb2b_dbus_rt_case_biz_order</a>

**说明：** 客诉订单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  3   | customer_id |   bigint   | 20 |   0    |    N     |  N   |       | 门店ID  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |   0    | 负责BDID  |
|  5   | city_id |   int   | 10 |   0    |    N     |  N   |       | 城市ID  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事务部ID  |
|  7   | sales_grid_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 售卖区域ID  |
|  8   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  9   | status |   smallint   | 6 |   0    |    N     |  N   |       | 订单状态：10-待支付，15-未接单，19-接单中，20-已接单，55-已发货，60-已送达，89-取消中，90-已取消  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="app_caterb2b_dbus_rt_check_task">app_caterb2b_dbus_rt_check_task</a>

**说明：** 复核任务主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  4   | check_task_no |   varchar   | 50 |   0    |    Y     |  N   |       | 复核任务号  |
|  5   | route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  6   | route_name |   varchar   | 20 |   0    |    N     |  N   |       | 排线名称  |
|  7   | ship_area_code |   varchar   | 32 |   0    |    N     |  N   |       | 发货区编码  |
|  8   | ship_area_name |   varchar   | 32 |   0    |    N     |  N   |       | 发货区名称  |
|  9   | service_provider_name |   varchar   | 128 |   0    |    N     |  N   |       | 承运商名称  |
|  10   | service_provider_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 承运商id  |
|  11   | check_task_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 复核任务的状态10已生成，20复核中30复核完成99取消  |
|  12   | receiver_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 任务领取人账号ID  |
|  13   | receiver_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |
|  14   | receive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  15   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  16   | sort_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 分拣状态10未完成，20已完成  |
|  17   | expect_sort_pieces_qty |   int   | 10 |   0    |    Y     |  N   |       | 应分拣件数  |
|  18   | actual_sort_pieces_qty |   int   | 10 |   0    |    Y     |  N   |       | 实分拣件数  |
|  19   | expect_check_pieces_qty |   int   | 10 |   0    |    Y     |  N   |       | 应复核件数  |
|  20   | actual_check_pieces_qty |   int   | 10 |   0    |    Y     |  N   |       | 实复核件数  |
|  21   | expect_check_sku_qty |   int   | 10 |   0    |    Y     |  N   |       | 应复核sku数  |
|  22   | actual_check_sku_qty |   int   | 10 |   0    |    Y     |  N   |       | 实复核sku数  |
|  23   | version |   int   | 10 |   0    |    Y     |  N   |   0    | 版本号  |
|  24   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |
|  25   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  26   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  27   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       | 最后修改时间  |
|  28   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后修改人  |
|  29   | biz_bill_type |   smallint   | 6 |   0    |    Y     |  N   |   10    | 10订单正常出库11调拨出库12退供出库成品13订单换货出库14订单补货出库15退供原料出库  |
|  30   | pick_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 拣货单编号  |
|  31   | goods_collection_code |   varchar   | 32 |   0    |    Y     |  N   |       | 集货位  |

**表名：** <a id="app_caterb2b_dbus_rt_check_task_item">app_caterb2b_dbus_rt_check_task_item</a>

**说明：** 复核任务明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  4   | check_task_no |   varchar   | 50 |   0    |    N     |  N   |       | 复核任务号  |
|  5   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  6   | sort_bill_no |   varchar   | 100 |   0    |    Y     |  N   |       | 分拣单号用逗号隔开  |
|  7   | sort_operator_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分拣人名称  |
|  8   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格代码  |
|  9   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 最小规格编码sku  |
|  10   | sku_name |   varchar   | 255 |   0    |    N     |  N   |       | sku名称  |
|  11   | sku_unit_desc |   varchar   | 512 |   0    |    N     |  N   |       | 规格  |
|  12   | sku_unit |   varchar   | 512 |   0    |    N     |  N   |       | 单位  |
|  13   | sku_brand |   varchar   | 45 |   0    |    N     |  N   |       | sku品牌  |
|  14   | cat1_name |   varchar   | 64 |   0    |    N     |  N   |       | 商品一级分类  |
|  15   | cat2_name |   varchar   | 64 |   0    |    N     |  N   |       | 商品二级分类  |
|  16   | cat3_name |   varchar   | 64 |   0    |    N     |  N   |       | 商品三级分类  |
|  17   | expect_sort_pieces_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应分拣件数  |
|  18   | actual_sort_pieces_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实分拣件数  |
|  19   | actual_check_pieces_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实复核件数  |
|  20   | check_time |   datetime   | 19 |   0    |    Y     |  N   |       | 商品复核保存时间  |
|  21   | sku_sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 商品销售类型，0现货销售,1预售  |
|  22   | shortage_reason |   varchar   | 64 |   0    |    Y     |  N   |       | 缺货原因  |
|  23   | sort_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 分拣状态10未完成，20已完成  |
|  24   | cancel_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 取消状态10未取消，20取消  |
|  25   | version |   int   | 10 |   0    |    Y     |  N   |   0    | 版本号  |
|  26   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效，0删除1有效0删除  |
|  27   | create_time |   datetime   | 19 |   0    |    N     |  N   |       |   |
|  28   | create_by |   varchar   | 128 |   0    |    N     |  N   |       |   |
|  29   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       |   |
|  30   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       |   |
|  31   | check_operator_name |   varchar   | 20 |   0    |    Y     |  N   |       | 复核人员  |
|  32   | check_operator_id |   bigint   | 20 |   0    |    Y     |  N   |       | 复核详情操作人员ID  |
|  33   | pick_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 拣货单编号  |
|  34   | goods_collection_code |   varchar   | 32 |   0    |    Y     |  N   |       | 集货位  |

**表名：** <a id="app_caterb2b_dbus_rt_confirm_responsibility">app_caterb2b_dbus_rt_confirm_responsibility</a>

**说明：** 定责表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | confirm_responsibility_no |   varchar   | 60 |   0    |    N     |  N   |       | 定责单号  |
|  3   | parent_work_no |   varchar   | 60 |   0    |    N     |  N   |       | 工单号  |
|  4   | work_no |   varchar   | 60 |   0    |    N     |  N   |       | 工单号  |
|  5   | source |   tinyint   | 4 |   0    |    N     |  N   |   1    | 类型：1-工单，2-售后  |
|  6   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单编号  |
|  7   | return_no |   varchar   | 60 |   0    |    N     |  N   |       | 退单编号  |
|  8   | fifth_faq_key |   varchar   | 128 |   0    |    N     |  N   |       | 5级FAQ  |
|  9   | sixth_faq_key |   varchar   | 128 |   0    |    N     |  N   |       | 6级FAQ  |
|  10   | process_instance_no |   varchar   | 128 |   0    |    N     |  N   |       | 流程实例编号  |
|  11   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 商家ID  |
|  12   | previous_confirm_responsibility_status |   smallint   | 6 |   0    |    Y     |  N   |       | 上一个定责状态:10-待定责,20-待确认,30-待举证,40-举证完成,50-待确认(二次),60-申诉待处理,80-已结案  |
|  13   | confirm_responsibility_status |   smallint   | 6 |   0    |    N     |  N   |       | 现定责状态:10-待定责,20-待确认,30-待举证,40-举证完成,50-待确认(二次),60-申诉待处理,80-已结案  |
|  14   | start_responsible_party |   bigint   | 20 |   0    |    Y     |  N   |       | 起始责任方(位运算):1-仓库,2-配送,4-采购,8-品控,16-商户,32-平台  |
|  15   | previous_responsible_party |   bigint   | 20 |   0    |    Y     |  N   |       | 前一个责任方(位运算):1-仓库,2-配送,4-采购,8-品控,16-商户,32-平台  |
|  16   | current_responsible_party |   bigint   | 20 |   0    |    Y     |  N   |       | 当前责任方(位运算):1-仓库,2-配送,4-采购,8-品控,16-商户,32-平台  |
|  17   | end_responsible_party |   bigint   | 20 |   0    |    Y     |  N   |       | 最终责任方(位运算):1-仓库,2-配送,4-采购,8-品控,16-商户,32-平台  |
|  18   | had_responsible_party |   bigint   | 20 |   0    |    Y     |  N   |   0    | 曾经有的责任方(位运算):1-仓库,2-配送,4-采购,8-品控,16-商户,32-平台  |
|  19   | last_operator_role |   smallint   | 6 |   0    |    Y     |  N   |       | 最近操作人角色1-城市运营(仓配),2-城市运营(配),4-城市经理,8-总部运营,16-三方(仓),32-三方(配),64-客服  |
|  20   | processor |   bigint   | 20 |   0    |    Y     |  N   |       | 处理方(位运算):1-城市运营(仓配),2-城市运营(配),4-城市经理,8-总部运营,16-三方(仓),32-三方(配),64-客服  |
|  21   | csu_codes |   varchar   | 2048 |   0    |    Y     |  N   |       | 客诉商品CSUCode列表  |
|  22   | cat1_id |   int   | 10 |   0    |    N     |  N   |   0    | 一级品类  |
|  23   | cat2_id |   int   | 10 |   0    |    N     |  N   |   0    | 二级品类  |
|  24   | cat3_id |   int   | 10 |   0    |    N     |  N   |   0    | 三级品类  |
|  25   | cat4_id |   int   | 10 |   0    |    N     |  N   |   0    | 四级品类  |
|  26   | pick_csu_codes |   varchar   | 2048 |   0    |    Y     |  N   |       | 命中规则的csu列表  |
|  27   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  28   | city_id |   int   | 10 |   0    |    N     |  N   |       | 城市ID  |
|  29   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  30   | warehouse_name |   varchar   | 32 |   0    |    Y     |  N   |       | 仓库名  |
|  31   | warehouse_service_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库服务商ID  |
|  32   | warehouse_service_name |   varchar   | 32 |   0    |    Y     |  N   |       | 仓库服务商名  |
|  33   | service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 配送承运商ID  |
|  34   | service_provider_name |   varchar   | 32 |   0    |    Y     |  N   |       | 配送承运商名  |
|  35   | feedback_explain |   varchar   | 1024 |   0    |    N     |  N   |       | 反馈详情  |
|  36   | responsibility_explain |   varchar   | 4096 |   0    |    Y     |  N   |       | 判责说明  |
|  37   | compensation_explain |   varchar   | 1024 |   0    |    N     |  N   |       | 赔付说明  |
|  38   | customer_question |   varchar   | 1024 |   0    |    Y     |  N   |       | 商户问题  |
|  39   | first_judge_time |   datetime   | 19 |   0    |    Y     |  N   |       | 首次判责时间  |
|  40   | work_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 工单创建时间  |
|  41   | close_case_time |   datetime   | 19 |   0    |    Y     |  N   |       | 结案时间  |
|  42   | faq_type |   smallint   | 6 |   0    |    Y     |  N   |       | 问题类别:1-商品问题,2-配送问题,3-缺货问题  |
|  43   | confirm_responsibility_status_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 状态更新时间  |
|  44   | appeal_record_success |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否申诉成功:0-空,1-是,2-否  |
|  45   | timeout |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否超时判责：0-不是,1-是  |
|  46   | backout |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否支持撤销：0-不支持,1-支持  |
|  47   | confirm_type |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 判责方式，0-人工，1-自动  |
|  48   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  49   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  50   | istatus |   tinyint   | 4 |   0    |    N     |  N   |   1    | 是否有效，0无效，1有效  |
|  51   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  52   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最新更新时间  |
|  53   | create_by |   varchar   | 255 |   0    |    N     |  N   |       | 创建人名称  |
|  54   | last_modify_by |   varchar   | 255 |   0    |    N     |  N   |       | 最新操作人名称  |

**表名：** <a id="app_caterb2b_dbus_rt_csu_price_seckill">app_caterb2b_dbus_rt_csu_price_seckill</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增的主键ID  |
|  2   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | 商品的csuId  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  4   | city_id |   int   | 10 |   0    |    Y     |  N   |   0    | 城市ID  |
|  5   | county_id |   int   | 10 |   0    |    Y     |  N   |   0    | 区域ID  |
|  6   | seckill_scene_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 场次id  |
|  7   | seckill_price |   int   | 10 |   0    |    Y     |  N   |   0    | 秒杀价精确到分  |
|  8   | seckill_status |   int   | 10 |   0    |    Y     |  N   |   1    | 秒杀状态0代表秒杀活动无效1代表秒杀活动有效  |
|  9   | seckill_stime |   datetime   | 19 |   0    |    Y     |  N   |       | 秒杀开始时间  |
|  10   | seckill_etime |   datetime   | 19 |   0    |    Y     |  N   |       | 秒杀结束时间  |
|  11   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道号id  |
|  12   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  13   | valid |   int   | 10 |   0    |    Y     |  N   |   1    | 0代表删除，1代表存在  |
|  14   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 记录创建时间  |
|  15   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 记录修改时间  |

**表名：** <a id="app_caterb2b_dbus_rt_customer_group_relation">app_caterb2b_dbus_rt_customer_group_relation</a>

**说明：** 客户群和客户关系表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | customer_group_mark |   varchar   | 64 |   0    |    N     |  N   |       | 客户群编号  |
|  3   | batch_no |   varchar   | 60 |   0    |    N     |  N   |       | 批次号  |
|  4   | customer_ids |   text   | 65535 |   0    |    N     |  N   |       | 客户ID多个用分号分隔  |
|  5   | customer_num |   int   | 10 |   0    |    N     |  N   |   0    | 客户数量  |
|  6   | sync_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 同步状态1:待验证2:待同步3:已同步  |
|  7   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  8   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  9   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  10   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  11   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  12   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_cx_purchase_bill">app_caterb2b_dbus_rt_cx_purchase_bill</a>

**说明：** 采购单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_code |   varchar   | 60 |   0    |    N     |  N   |       | 采购单号  |
|  3   | supplier_id |   int   | 10 |   0    |    N     |  N   |   0    | 供应商id  |
|  4   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名  |
|  5   | warehouse_id |   int   | 10 |   0    |    Y     |  N   |   0    | 仓库id  |
|  6   | warehouse_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名  |
|  7   | status |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 状态值  |
|  8   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 删除标志1:正常,2:删除,0:异常  |
|  9   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  10   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  11   | total |   bigint   | 20 |   0    |    Y     |  N   |   0    | 采购单总金额,doboule*100保留2位小数  |
|  12   | instock_total |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  13   | creator_id |   int   | 10 |   0    |    N     |  N   |   0    | 创建人misId  |
|  14   | creator_name |   varchar   | 100 |   0    |    Y     |  N   |       | 创建人mis账号  |
|  15   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 备注信息  |
|  16   | arrived_time |   int   | 10 |   0    |    Y     |  N   |       | 预计到货时间  |
|  17   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部id  |
|  18   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名  |
|  19   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  20   | estimate_arr_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 预计到达时间，精确到分  |
|  21   | settle_type |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 结算类型0：先货后款，1：先款后货  |
|  22   | settle_code |   varchar   | 60 |   0    |    Y     |  N   |       | 线下结算凭证号  |
|  23   | inbound_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 入库时间  |
|  24   | pur_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 采购单状态，0:待确认，1：已确认，2：已完成，3：已取消  |
|  25   | settlement_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 结算状态，0:未结算，1：部分结算，2：结算完成  |
|  26   | inbound_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 结算状态，0:未入库，1：部分入库，2：入库完成  |
|  27   | approval_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 审批状态，0：待审核，1：审核中，2：审核完成，3：已驳回，4：已撤销  |
|  28   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_dbus_rt_cx_purchase_bill_detail">app_caterb2b_dbus_rt_cx_purchase_bill_detail</a>

**说明：** 采购单详情

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_id |   int   | 10 |   0    |    N     |  N   |       | 采购单ID  |
|  3   | bill_code |   varchar   | 60 |   0    |    N     |  N   |       | 采购单号  |
|  4   | psu_id |   int   | 10 |   0    |    N     |  N   |   0    | psu_id  |
|  5   | psu_name |   varchar   | 255 |   0    |    Y     |  N   |       | psu名  |
|  6   | psu_brand |   varchar   | 255 |   0    |    Y     |  N   |       | 品牌  |
|  7   | psu_specification |   varchar   | 255 |   0    |    Y     |  N   |       | 规格  |
|  8   | purchase_price |   int   | 10 |   0    |    Y     |  N   |   0    | 采购价格,double小数*100,保留2位小数  |
|  9   | min_supply_quantity |   int   | 10 |   0    |    Y     |  N   |   0    | 起批量,double小数*100,保留2位小数  |
|  10   | quantity |   int   | 10 |   0    |    Y     |  N   |   0    | 采购量,,double小数*100,保留2位小数  |
|  11   | return_quantity |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  12   | instock_quantity |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  13   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 删除标志1:正常,2:删除,0:异常  |
|  14   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  15   | utime |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  16   | pic_url |   varchar   | 4096 |   0    |    Y     |  N   |       | 图片地址  |
|  17   | psu_prop |   varchar   | 512 |   0    |    Y     |  N   |       | psu属性  |
|  18   | purchase_plus_price |   decimal   | 9 |   2    |    Y     |  N   |   0.00    | 采购C+价  |
|  19   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  20   | sku_id |   int   | 10 |   0    |    Y     |  N   |   0    | sku_id  |
|  21   | spu_code |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  22   | settle_code |   varchar   | 60 |   0    |    Y     |  N   |       | 线下结算凭证号  |
|  23   | tax_rate |   decimal   | 3 |   2    |    N     |  N   |   0.00    | 税率  |
|  24   | pur_price |   decimal   | 11 |   4    |    Y     |  N   |   0.0000    | 采购C价  |
|  25   | gift_label |   smallint   | 6 |   0    |    Y     |  N   |   0    | 采购单赠品标签，0：非赠品，1：赠品  |
|  26   | estimate_price |   decimal   | 9 |   2    |    Y     |  N   |   0.00    | 预估成本价保留2位小数  |
|  27   | parent_sku_id |   int   | 10 |   0    |    N     |  N   |   0    | >0当前包装品对应主商品sku，=0主商品不含包装物  |
|  28   | processed_total_quantity |   int   | 10 |   0    |    N     |  N   |   0    | 供应商加工sku总数量  |
|  29   | processed_total_weight |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 供应商加工sku总重量  |
|  30   | pur_weight |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 实际采购重量  |
|  31   | instock_weight |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 实际入库重量  |
|  32   | return_weight |   decimal   | 11 |   2    |    Y     |  N   |   0.00    | 退货重量  |
|  33   | suggest_pur_quantity |   varchar   | 45 |   0    |    N     |  N   |       | 建议采购量  |

**表名：** <a id="app_caterb2b_dbus_rt_delivery_take">app_caterb2b_dbus_rt_delivery_take</a>

**说明：** 提货单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | ware_house_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库ID  |
|  4   | delivery_take_no |   varchar   | 32 |   0    |    N     |  N   |       | 提货单号  |
|  5   | inbound_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 入库单号  |
|  6   | return_no |   varchar   | 64 |   0    |    N     |  N   |       | 售后单号  |
|  7   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       | 订单号  |
|  8   | take_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 提货单类型1：退货；2：包装物；3：换货  |
|  9   | take_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 提货单状态1：已生成；2：已排线；3：已发车；4：已提货；5：提货失败；6：已返仓；7：已取消  |
|  10   | take_source |   smallint   | 6 |   0    |    N     |  N   |   1    | 渠道来源1：客服；2：司机APP  |
|  11   | driver_take_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 司机领取方式0:默认未领取10:司机APP20:排线  |
|  12   | order_category_label |   smallint   | 6 |   0    |    N     |  N   |   0    | 订单运输品类0：空；1：全标品；2:含蔬菜；4：含鲜肉；6：含蔬菜，含鲜肉；8:含冻品；10：含蔬菜，含冻品；12：含鲜肉，含冻品；14：含蔬菜，含鲜肉，含冻品  |
|  13   | business_name |   varchar   | 255 |   0    |    N     |  N   |       | 商家名称  |
|  14   | address_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 商家地址ID  |
|  15   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店ID  |
|  16   | region_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 区域ID  |
|  17   | route_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 排线ID  |
|  18   | unit_total |   int   | 10 |   0    |    N     |  N   |   0    | 订单件数  |
|  19   | order_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 下单时间  |
|  20   | appoint_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 履约时间  |
|  21   | appointment_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  22   | inbound_completed_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 入库时间  |
|  23   | delivery_take_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 提货时间  |
|  24   | depart_time |   varchar   | 32 |   0    |    N     |  N   |       | 发车时间  |
|  25   | return_warehouse_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 返仓时间  |
|  26   | complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  27   | cancel_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 取消时间  |
|  28   | is_abnormal_signed |   varchar   | 4 |   0    |    N     |  N   |       | 是否异常是：1；否：0  |
|  29   | abnormal_reason |   varchar   | 1024 |   0    |    N     |  N   |       | 提货失败原因  |
|  30   | abnormal_desc |   varchar   | 1024 |   0    |    N     |  N   |       | 提货失败详细描述  |
|  31   | taked_desc |   varchar   | 1024 |   0    |    N     |  N   |       | 确认提货备注  |
|  32   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  33   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  34   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  35   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 最后修改时间  |
|  36   | data_env |   varchar   | 20 |   0    |    N     |  N   |   common    | 当前数据环境  |

**表名：** <a id="app_caterb2b_dbus_rt_delivery_take_detail">app_caterb2b_dbus_rt_delivery_take_detail</a>

**说明：** 提货单明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | delivery_take_no |   varchar   | 32 |   0    |    N     |  N   |       | 提货单号  |
|  4   | detail_id |   bigint   | 20 |   0    |    N     |  N   |   0    | WMS入库单详情表ID  |
|  5   | sku_code |   int   | 10 |   0    |    N     |  N   |   0    | sku编码  |
|  6   | sku_name |   varchar   | 255 |   0    |    N     |  N   |       | sku名称  |
|  7   | sku_brand |   varchar   | 64 |   0    |    N     |  N   |       | sku品牌  |
|  8   | sku_properties |   varchar   | 512 |   0    |    N     |  N   |       | sku属性  |
|  9   | sku_unit_desc |   varchar   | 512 |   0    |    N     |  N   |       | sku规格  |
|  10   | sku_unit |   varchar   | 512 |   0    |    N     |  N   |       | 单位  |
|  11   | sku_price |   varchar   | 32 |   0    |    N     |  N   |   0    | 单价  |
|  12   | sku_desc |   varchar   | 1024 |   0    |    N     |  N   |       | sku商品描述  |
|  13   | order_qty |   int   | 10 |   0    |    N     |  N   |   0    | 下单数量  |
|  14   | delivery_plan_qty |   int   | 10 |   0    |    N     |  N   |   0    | 计划提货数量  |
|  15   | delivery_real_qty |   int   | 10 |   0    |    N     |  N   |   0    | 实际提货数量  |
|  16   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  17   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  18   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  19   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 最后修改时间  |
|  20   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="app_caterb2b_dbus_rt_driver_sign_in">app_caterb2b_dbus_rt_driver_sign_in</a>

**说明：** 快驴司机APP报名计划运力表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | driver_id |   bigint   | 20 |   0    |    Y     |  N   |       | driver表的主键ID  |
|  3   | sign_in_state |   bit   | 1 |   0    |    N     |  N   |   0    | 报名状态，如：0未签到1已签到  |
|  4   | sign_in_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 签到时刻  |
|  5   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 签到仓库ID  |
|  6   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  7   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 注册时间  |
|  9   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  11   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="app_caterb2b_dbus_rt_inbound_bill">app_caterb2b_dbus_rt_inbound_bill</a>

**说明：** 入库单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  4   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称  |
|  5   | inbound_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 入库单号  |
|  6   | original_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 原始单号  |
|  7   | arrive_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 到货时间  |
|  8   | supplier_id |   bigint   | 20 |   0    |    Y     |  N   |       | 供应商  |
|  9   | supplier_code |   varchar   | 64 |   0    |    Y     |  N   |       | 供应商编码  |
|  10   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名称  |
|  11   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  12   | ware_house_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名字  |
|  13   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  14   | allot_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 调拨单号  |
|  15   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 订单号  |
|  16   | return_bill_no |   varchar   | 45 |   0    |    Y     |  N   |       | 退货单号  |
|  17   | return_excuse |   varchar   | 1024 |   0    |    Y     |  N   |       | 退货原因  |
|  18   | sign_declined_source |   bit   | 1 |   0    |    Y     |  N   |   1    | 拒收来源  |
|  19   | adjustment_bill_no |   varchar   | 45 |   0    |    Y     |  N   |       | 调整单号  |
|  20   | batch_no |   varchar   | 25 |   0    |    Y     |  N   |       | 入库批次  |
|  21   | inbound_bill_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 状态1:未入库2:已入库  |
|  22   | inbound_bill_source |   smallint   | 6 |   0    |    Y     |  N   |       | 入库来源：1采购入库2调整入库3退货入库4残次品入库5升级入库  |
|  23   | cancel_status |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否取消1：取消0：未取消  |
|  24   | pre_sale_status |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否预售0：非预售,1：预售  |
|  25   | vendor_process_status |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否加工类型采购单0：非加工,1：加工  |
|  26   | is_selfbuild |   bit   | 1 |   0    |    Y     |  N   |       | 是否自建1：自建0：非自建  |
|  27   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 备注  |
|  28   | return_desc |   varchar   | 255 |   0    |    Y     |  N   |       | 退货问题描述  |
|  29   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  30   | purchase_delivery_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 采购运输类型0仓库派车1供应商送货2自雇车辆  |
|  31   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  32   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  33   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  34   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |

**表名：** <a id="app_caterb2b_dbus_rt_inbound_bill_detail">app_caterb2b_dbus_rt_inbound_bill_detail</a>

**说明：** 入库单详情表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | inbound_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 入库单号  |
|  4   | spu_code |   varchar   | 30 |   0    |    Y     |  N   |       | SPU编码  |
|  5   | sku_brand |   varchar   | 45 |   0    |    Y     |  N   |       | 品牌  |
|  6   | mfg_date |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 生产日期  |
|  7   | purchase_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 采购数量  |
|  8   | receive_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 收货数量  |
|  9   | customer_service_qty |   int   | 10 |   0    |    Y     |  N   |       | 客服确认数量  |
|  10   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  11   | sku_name |   varchar   | 255 |   0    |    Y     |  N   |       | sku名称  |
|  12   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 规格  |
|  13   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 单位  |
|  14   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 入库单详情备注  |
|  15   | bu_item_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 业务唯一标识  |
|  16   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  17   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  18   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  19   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |

**表名：** <a id="app_caterb2b_dbus_rt_item_promo_amount">app_caterb2b_dbus_rt_item_promo_amount</a>

**说明：** 订单商品优惠分摊表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  3   | order_item_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单商品ID  |
|  4   | promo_divide_amount |   decimal   | 13 |   2    |    N     |  N   |   0.00    | 商品优惠分摊金额  |
|  5   | promo_id |   bigint   | 20 |   0    |    N     |  N   |       | 优惠促销ID  |
|  6   | promo_type |   tinyint   | 3 |   0    |    N     |  N   |       | 促销类型:2-优惠券，5-满减  |
|  7   | promo_scope |   tinyint   | 3 |   0    |    N     |  N   |       | 优惠影响范围，1-平台单品，2-平台订单，3-经销商订单  |
|  8   | istatus |   bit   | 1 |   0    |    N     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  9   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最新更新时间  |
|  11   | create_by |   varchar   | 255 |   0    |    N     |  N   |       | 创建人名称  |
|  12   | last_modify_by |   varchar   | 255 |   0    |    N     |  N   |       | 最新操作人名称  |

**表名：** <a id="app_caterb2b_dbus_rt_item_promo_detail">app_caterb2b_dbus_rt_item_promo_detail</a>

**说明：** 商品级别促销信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | order_item_id |   bigint   | 20 |   0    |    Y     |  N   |       | 订单ID  |
|  3   | order_id |   bigint   | 20 |   0    |    Y     |  N   |       | 订单ID  |
|  4   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | 商品CSUCode  |
|  5   | promo_id |   int   | 10 |   0    |    Y     |  N   |       | 优惠促销ID  |
|  6   | promo_name |   varchar   | 255 |   0    |    Y     |  N   |       | 优惠名称  |
|  7   | promo_amount |   decimal   | 13 |   2    |    Y     |  N   |   0.00    | 优惠金额  |
|  8   | promo_type |   tinyint   | 3 |   0    |    Y     |  N   |       | 促销类型:1-促销，2-优惠券，3-赠品，4-折扣，5-满减，6-秒杀  |
|  9   | promo_scope |   tinyint   | 3 |   0    |    Y     |  N   |       | 促销影响范围:1-平台单品，2-平台订单，3-经销商订单  |
|  10   | promo_content |   text   | 65535 |   0    |    Y     |  N   |       | 优惠信息（mbc获取的obj的jsonstring）  |
|  11   | returned |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 是否已归还:1-是，0-否  |
|  12   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  13   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_dbus_rt_kl_wqs_purchase_task_check">app_caterb2b_dbus_rt_kl_wqs_purchase_task_check</a>

**说明：** 采购检查任务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键id  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | task_bill_no |   varchar   | 32 |   0    |    N     |  N   |       | 检查任务单号  |
|  4   | purchase_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 采购单号  |
|  5   | inbound_bill_no |   varchar   | 32 |   0    |    N     |  N   |       | 入库单号  |
|  6   | receiving_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 收货任务单号  |
|  7   | vendor_name |   varchar   | 255 |   0    |    N     |  N   |       | 供应商名称  |
|  8   | vendor_code |   varchar   | 64 |   0    |    N     |  N   |       | 供应商编码  |
|  9   | vendor_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 供应商id  |
|  10   | warehouse_name |   varchar   | 64 |   0    |    N     |  N   |       | 仓库名称  |
|  11   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库id  |
|  12   | buyer_name |   varchar   | 50 |   0    |    N     |  N   |       | 采购员名称  |
|  13   | registrar_name |   varchar   | 50 |   0    |    N     |  N   |       | 登记人名称  |
|  14   | registrar_id |   bigint   | 20 |   0    |    Y     |  N   |       | 登记人id  |
|  15   | quality_check_type |   bit   | 1 |   0    |    N     |  N   |   0    | 品控检查分类1：预售0：非预售  |
|  16   | task_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 检查任务状态1:已生成2:登记中3:已关闭4:已完成  |
|  17   | qualified_result |   bit   | 1 |   0    |    N     |  N   |   2    | 是否合格1：是0：否，2：未选择  |
|  18   | ticket_register_result |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否登记票证1：是0：否  |
|  19   | temperature |   decimal   | 11 |   2    |    Y     |  N   |       | 温度,-30〜50数字，小数点2位  |
|  20   | vendor_arrive_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 供应商到货时间  |
|  21   | vendor_discharge_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 供应商卸货时间  |
|  22   | register_type |   bit   | 1 |   0    |    Y     |  N   |   1    | 登记类型1:正常2:特殊  |
|  23   | remark |   varchar   | 1024 |   0    |    Y     |  N   |       | 备注  |
|  24   | purchase_goods_type |   bit   | 1 |   0    |    N     |  N   |   1    | 采购商品类型，1：成品，2:原料  |
|  25   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建日期  |
|  26   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  27   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 更新日期  |
|  28   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 更新人  |
|  29   | complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  30   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |

**表名：** <a id="app_caterb2b_dbus_rt_labour_user">app_caterb2b_dbus_rt_labour_user</a>

**说明：** 三方人员信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | name |   varchar   | 64 |   0    |    Y     |  N   |       | 姓名  |
|  4   | account_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 账号类型1:passport2:miss账号  |
|  5   | account_id |   bigint   | 20 |   0    |    Y     |  N   |       | 账号id  |
|  6   | rac_user_id |   bigint   | 20 |   0    |    Y     |  N   |       | rac用户id  |
|  7   | user_status |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 用户状态0停用，1启用  |
|  8   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 备注  |
|  9   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  10   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  11   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  12   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  13   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_labour_user_provider">app_caterb2b_dbus_rt_labour_user_provider</a>

**说明：** 服务商人员关系映射表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 表自增id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | user_id |   bigint   | 20 |   0    |    Y     |  N   |       | 用户ID  |
|  4   | provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 服务商id  |
|  5   | provider_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 服务商类型0类型未指定1仓储3配送  |
|  6   | job_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位类型1仓储职能岗2仓储生产岗3配送职能岗  |
|  7   | job_name_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位名称类型11仓储三方结算12仓储客服岗21分拣员22制单员23叉车司机24收退员25班组长26加工员27理货员31配送三方结算32配送客服岗33配送调度岗  |
|  8   | job_name_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 岗位名称描述  |
|  9   | self_employment_status |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否自主招聘0非快驴招聘1:自主招聘  |
|  10   | temporary_status |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否临时工0:否1:是  |
|  11   | power_status |   tinyint   | 4 |   0    |    N     |  N   |   0    | 是否有权限：0-无权限,1-有权限  |
|  12   | bind_status |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 状态0:未绑定1:己绑定  |
|  13   | bind_time |   datetime   | 19 |   0    |    Y     |  N   |       | 绑定时间  |
|  14   | unbind_time |   datetime   | 19 |   0    |    Y     |  N   |       | 解绑时间  |
|  15   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 备注  |
|  16   | induction_date |   datetime   | 19 |   0    |    Y     |  N   |       | 入职日期  |
|  17   | leave_date |   datetime   | 19 |   0    |    Y     |  N   |       | 离职日期  |
|  18   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  19   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  20   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  21   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  22   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_labour_user_warehouse">app_caterb2b_dbus_rt_labour_user_warehouse</a>

**说明：** 人员与仓库的作业关系

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | warehouse_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名字  |
|  4   | provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 服务商id  |
|  5   | user_id |   bigint   | 20 |   0    |    Y     |  N   |       | 用户ID  |
|  6   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  7   | job_status |   tinyint   | 4 |   0    |    N     |  N   |   0    | '在职状态：0-离职，1-待入职，2-在职',  |
|  8   | job_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位类型1仓储职能岗2仓储生产岗3配送职能岗  |
|  9   | job_id |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位名称类型11仓储三方结算12仓储客服岗21分拣员22制单员23叉车司机24收退员25班组长26加工员27理货员31配送三方结算32配送客服岗33配送调度岗  |
|  10   | leave_date |   datetime   | 19 |   0    |    Y     |  N   |       | 离职日期  |
|  11   | induction_date |   datetime   | 19 |   0    |    Y     |  N   |       | 入职日期  |
|  12   | waitfor_entry_date |   datetime   | 19 |   0    |    Y     |  N   |       | 入职登记日期（待入职日期）  |
|  13   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  14   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  15   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  16   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  17   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_order">app_caterb2b_dbus_rt_order</a>

**说明：** databus同步线上实时订单数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | customer_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  3   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事务部ID  |
|  7   | status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  12   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |
|  13   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店ID  |
|  14   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  15   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  16   | payment_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 支付类型：1-货到付款，2-在线支付  |
|  17   | order_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 订单类型:1-自下单，2-BD代下单，3-补货订单，4-换货订单  |
|  18   | mark_word |   varchar   | 60 |   0    |    Y     |  N   |       | 订单标识位  |

**表名：** <a id="app_caterb2b_dbus_rt_order_detail">app_caterb2b_dbus_rt_order_detail</a>

**说明：** 同步线上订单详情数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单明细id  |
|  2   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  3   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  4   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  5   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  6   | csu_order_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  7   | csu_origin_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  8   | item_coupon_amount |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  9   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  10   | quantity |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  11   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | spu_code |   varchar   | 30 |   0    |    Y     |  N   |       | 商品SPUCode  |
|  16   | csu_brand_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 品牌ID  |
|  17   | csu_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 商品品牌  |
|  18   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 售卖单位  |
|  19   | sku_unit_desc |   varchar   | 255 |   0    |    Y     |  N   |       | SKU售卖描述  |

**表名：** <a id="app_caterb2b_dbus_rt_order_detail_his">app_caterb2b_dbus_rt_order_detail_his</a>

**说明：** 同步线上订单详情数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单明细id  |
|  2   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  3   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  4   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  5   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  6   | csu_order_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  7   | csu_origin_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  8   | item_coupon_amount |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  9   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  10   | quantity |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  11   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |

**表名：** <a id="app_caterb2b_dbus_rt_order_his">app_caterb2b_dbus_rt_order_his</a>

**说明：** databus同步线上实时订单数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | customer_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  3   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事务部ID  |
|  7   | status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  12   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |
|  13   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店ID  |
|  14   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  15   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  16   | payment_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 支付类型：1-货到付款，2-在线支付  |
|  17   | order_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 订单类型:1-自下单，2-BD代下单，3-补货订单，4-换货订单  |

**表名：** <a id="app_caterb2b_dbus_rt_purchase_inbound_bill">app_caterb2b_dbus_rt_purchase_inbound_bill</a>

**说明：** 采购入库单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | wsc_id |   bigint   | 20 |   0    |    Y     |  N   |       | wsc下传的采购主表ID  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  4   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       | 经销商ID  |
|  5   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  6   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称  |
|  7   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  8   | warehouse_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名字  |
|  9   | inbound_bill_no |   varchar   | 32 |   0    |    N     |  N   |       | 入库单号  |
|  10   | inbound_bill_source |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单来源:10采购20订单30库内40加工99其他  |
|  11   | inbound_bill_status |   smallint   | 6 |   0    |    N     |  N   |       | 状态1:己创建2:入库完成3:己取消4：生成任务单5：收货中6：收货完成7：上架中8：上架完成  |
|  12   | batch_no |   varchar   | 64 |   0    |    Y     |  N   |       | 入库批次  |
|  13   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  14   | purchase_sale_type |   bit   | 1 |   0    |    N     |  N   |   0    | 是否预售0：非预售,1：预售  |
|  15   | purchase_process_type |   bit   | 1 |   0    |    N     |  N   |   0    | 是否加工类型采购单0：非加工,1：加工  |
|  16   | purchase_material_type |   bit   | 1 |   0    |    N     |  N   |   0    | 是否原材料0：非原材料,1：原材料  |
|  17   | purchase_delivery_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 采购运输类型0仓库派车1供应商送货2自雇车辆  |
|  18   | supplier_id |   bigint   | 20 |   0    |    Y     |  N   |       | 供应商  |
|  19   | supplier_code |   varchar   | 64 |   0    |    Y     |  N   |       | 供应商编码  |
|  20   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名称  |
|  21   | allow_receive_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否超允收期  |
|  22   | arrive_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 到货时间  |
|  23   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  24   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 备注  |
|  25   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  26   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  27   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  28   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  29   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_purchase_inbound_bill_detail">app_caterb2b_dbus_rt_purchase_inbound_bill_detail</a>

**说明：** 采购入库单详情表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | wsc_id |   bigint   | 20 |   0    |    Y     |  N   |       | wsc下传的采购主表ID  |
|  3   | wsc_detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | wsc下传的采购明细表ID  |
|  4   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  5   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       | 经销商ID  |
|  6   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  7   | inbound_bill_no |   varchar   | 32 |   0    |    N     |  N   |       | 入库单号  |
|  8   | spu_code |   varchar   | 30 |   0    |    Y     |  N   |       | SPU编码  |
|  9   | spu_name |   varchar   | 255 |   0    |    Y     |  N   |       | SPU名称  |
|  10   | spu_brand |   varchar   | 45 |   0    |    Y     |  N   |       | SPU品牌  |
|  11   | spu_properties |   varchar   | 512 |   0    |    Y     |  N   |       | SPU属性  |
|  12   | spu_storage |   int   | 10 |   0    |    Y     |  N   |       | 存储方式1冷藏2冷冻3常温  |
|  13   | spu_transport |   varchar   | 64 |   0    |    Y     |  N   |       | 运输方式  |
|  14   | spu_shelf_life_desc |   varchar   | 32 |   0    |    Y     |  N   |       | SPU保质期描述  |
|  15   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  16   | sku_type |   smallint   | 6 |   0    |    Y     |  N   |       | SKU类型1普通商品2包装物3原料  |
|  17   | sku_barcode |   varchar   | 512 |   0    |    Y     |  N   |       | SKU条形码  |
|  18   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 单位  |
|  19   | sku_unit_type |   int   | 10 |   0    |    Y     |  N   |       | 整散标记:100整件,200散件  |
|  20   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 规格  |
|  21   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |       | base_sku编码  |
|  22   | base_sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 单位  |
|  23   | base_sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 规格  |
|  24   | base_sku_conversion_factor |   int   | 10 |   0    |    Y     |  N   |       | base_sku转换率  |
|  25   | wrap_sku_code |   int   | 10 |   0    |    Y     |  N   |       | 包装物sku_code  |
|  26   | wrap_sku_conversion_factor |   int   | 10 |   0    |    Y     |  N   |       | 包装物转换率  |
|  27   | purchase_qty |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  28   | receive_qty |   int   | 10 |   0    |    Y     |  N   |       | 己收货数量  |
|  29   | receive_process_qty |   int   | 10 |   0    |    Y     |  N   |       | 收货过程中末确认数量  |
|  30   | receive_remain_qty |   int   | 10 |   0    |    Y     |  N   |       | 收货任务剩余可收货数量  |
|  31   | purchase_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 计划采购重量(保留两位小数)  |
|  32   | receive_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 实际收货重量(保留两位小数)  |
|  33   | spot_check_defect_rate |   decimal   | 11 |   2    |    Y     |  N   |       | 抽检不合格率(保留两位小数)  |
|  34   | spot_check_defect_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 抽检不合格重量(保留两位小数)  |
|  35   | spot_check_rate |   decimal   | 11 |   2    |    Y     |  N   |       | 抽检率(保留两位小数)  |
|  36   | spot_check_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 抽检重量(保留两位小数)  |
|  37   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 入库单详情备注  |
|  38   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  39   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  40   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  41   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  42   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  43   | receive_by_id |   bigint   | 20 |   0    |    Y     |  N   |       | 收货人ID  |
|  44   | receive_by_name |   varchar   | 128 |   0    |    Y     |  N   |       | 收货人名称  |
|  45   | receive_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 收货时间  |

**表名：** <a id="app_caterb2b_dbus_rt_putaway_bill">app_caterb2b_dbus_rt_putaway_bill</a>

**说明：** 上架任务单主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库id  |
|  3   | putaway_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 上架任务编号  |
|  4   | inbound_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 上架任务对应的入库编号  |
|  5   | receiving_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 收货任务单号  |
|  6   | putaway_status |   smallint   | 6 |   0    |    Y     |  N   |   10    | 10已生成20上架中30上架完成  |
|  7   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    |   |
|  8   | biz_bill_type |   smallint   | 6 |   0    |    Y     |  N   |       | 单据类型10采购入库20退货入库30调拨入库  |
|  9   | biz_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 关联业务编号  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  11   | claimed_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  12   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  13   | claimed_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人账号ID  |
|  14   | claimed_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |
|  15   | print_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 打印状态1已打印0未打印  |
|  16   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  17   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 任务完成时间  |
|  18   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  19   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_dbus_rt_receiving_bill">app_caterb2b_dbus_rt_receiving_bill</a>

**说明：** 收货任务主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库id  |
|  3   | receiving_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 收货任务编号  |
|  4   | inbound_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 收货任务对应的入库单编号  |
|  5   | biz_bill_type |   smallint   | 6 |   0    |    Y     |  N   |   10    | 单据类型10采购入库20退货入库30采购入库  |
|  6   | receiving_status |   smallint   | 6 |   0    |    Y     |  N   |   10    | 收获任务的状态10已生成20登记中30登记完成40收货完成50关闭50已关闭  |
|  7   | sku_duplicated |   smallint   | 6 |   0    |    Y     |  N   |   0    | SKU重复标记0不重复1重复  |
|  8   | print_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 收获任务打印状态1已经打印0未打印  |
|  9   | biz_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 收货任务对应的业务编号  |
|  10   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | claimed_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人账号ID  |
|  13   | claimed_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  15   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  16   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | receiving_print_times |   int   | 10 |   0    |    Y     |  N   |   0    | 收货任务单打印次数  |
|  18   | confirm_receiving_date |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 确认收货时间  |
|  19   | last_modify_by |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  20   | lock_version |   int   | 10 |   0    |    Y     |  N   |   0    | 乐观锁版本  |

**表名：** <a id="app_caterb2b_dbus_rt_route_check">app_caterb2b_dbus_rt_route_check</a>

**说明：** 排线核货主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  4   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线编码  |
|  5   | route_name |   varchar   | 20 |   0    |    N     |  N   |       | 排线名称  |
|  6   | driver_id |   bigint   | 20 |   0    |    N     |  N   |       | 司机id  |
|  7   | driver_name |   varchar   | 20 |   0    |    N     |  N   |       | 司机姓名  |
|  8   | check_status |   smallint   | 6 |   0    |    Y     |  N   |       | 核货状态，10待核货，20核货中，30已完成  |
|  9   | shortage_status |   smallint   | 6 |   0    |    Y     |  N   |       | 0不缺货，1缺货  |
|  10   | delivery_route_date |   datetime   | 19 |   0    |    N     |  N   |       | 排线生成时间  |
|  11   | total_order_count |   int   | 10 |   0    |    Y     |  N   |       | 订单总数  |
|  12   | total_pieces_count |   int   | 10 |   0    |    Y     |  N   |       | 订单总件数  |
|  13   | checked_pieces_qty |   int   | 10 |   0    |    Y     |  N   |       | 已核货件数  |
|  14   | sort_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 分拣完成时间  |
|  15   | check_begin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 开始复核时间  |
|  16   | check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 复核完成时间  |
|  17   | check_variance_commit_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货差异提交时间  |
|  18   | check_variance_hanlder_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货差异处理时间  |
|  19   | check_operator_id |   varchar   | 20 |   0    |    Y     |  N   |       | 复核人id  |
|  20   | check_operator_name |   varchar   | 20 |   0    |    Y     |  N   |       | 复核人姓名  |
|  21   | driver_check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货完成时间  |
|  22   | sync_time |   datetime   | 19 |   0    |    Y     |  N   |       | 同步时间  |
|  23   | version |   int   | 10 |   0    |    Y     |  N   |   0    | 版本号  |
|  24   | route_version |   bigint   | 20 |   0    |    Y     |  N   |   0    | 版本号  |
|  25   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效，0删除1有效0删除  |
|  26   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  27   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  28   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       | 最后修改时间  |
|  29   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后修改人  |
|  30   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |   00000    | 发货区编码  |
|  31   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  32   | goods_collection_code |   varchar   | 32 |   0    |    Y     |  N   |       | 集货位  |

**表名：** <a id="app_caterb2b_dbus_rt_route_check_item">app_caterb2b_dbus_rt_route_check_item</a>

**说明：** 排线核货明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  4   | check_item_id |   bigint   | 20 |   0    |    Y     |  N   |       | 复核明细id  |
|  5   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线编码  |
|  6   | sort_bill_no |   varchar   | 100 |   0    |    Y     |  N   |       | 分拣单号用逗号隔开  |
|  7   | ship_area_code |   varchar   | 32 |   0    |    N     |  N   |       | 发货区编码  |
|  8   | ship_area_name |   varchar   | 32 |   0    |    N     |  N   |       | 发货区名称  |
|  9   | sku_sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 商品销售类型，0现货销售,1预售  |
|  10   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格代码  |
|  11   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 最小规格编码sku  |
|  12   | sku_name |   varchar   | 255 |   0    |    N     |  N   |       | sku名称  |
|  13   | pic_urls |   varchar   | 1014 |   0    |    Y     |  N   |       | sku图片地址  |
|  14   | sku_properties |   varchar   | 512 |   0    |    Y     |  N   |       | SKU属性  |
|  15   | sku_unit_desc |   varchar   | 512 |   0    |    N     |  N   |       | 规格  |
|  16   | sku_unit |   varchar   | 512 |   0    |    N     |  N   |       | 单位  |
|  17   | sku_brand |   varchar   | 45 |   0    |    N     |  N   |       | sku品牌  |
|  18   | order_qty |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  19   | lock_qty |   int   | 10 |   0    |    Y     |  N   |       | 锁定数量  |
|  20   | actual_sort_qty |   int   | 10 |   0    |    Y     |  N   |       | 实分拣数量,默认等于锁定数量  |
|  21   | final_check_qty |   int   | 10 |   0    |    Y     |  N   |       | 最终核货数量,默认等于锁定数量  |
|  22   | sort_operator_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分拣人  |
|  23   | shortage_reason |   varchar   | 100 |   0    |    Y     |  N   |       | 缺货原因  |
|  24   | sku_check_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 复核状态10分拣中，20复核中，30待核货，40有差异，50差异处理中，60已确认，70已完成  |
|  25   | check_policy_type |   smallint   | 6 |   0    |    N     |  N   |   10    | 复核策略10不需要复核，20需要复核  |
|  26   | version |   int   | 10 |   0    |    Y     |  N   |   0    | 版本号  |
|  27   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |
|  28   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  29   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  30   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       | 最后修改时间  |
|  31   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后修改人  |
|  32   | shortage_operator_name |   varchar   | 128 |   0    |    Y     |  N   |       | 缺货操作人  |
|  33   | variance_save_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货差异数量保存时间  |
|  34   | goods_collection_code |   varchar   | 32 |   0    |    Y     |  N   |       | 集货位  |
|  35   | confirm_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货确认时间  |

**表名：** <a id="app_caterb2b_dbus_rt_stock_info">app_caterb2b_dbus_rt_stock_info</a>

**说明：** 库位库存表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | warehouse_code |   varchar   | 50 |   0    |    N     |  N   |       | 仓库编码  |
|  5   | stock_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 库存商品类型：1：成品库存2：原料品库存  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 商品编码  |
|  7   | sku_pack_spec |   int   | 10 |   0    |    N     |  N   |   1    | 包装率  |
|  8   | lot_no |   varchar   | 64 |   0    |    N     |  N   |       | 批次号  |
|  9   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 商品编码  |
|  10   | sku_production_date |   date   | 10 |   0    |    Y     |  N   |   1970-01-01    | 生产日期  |
|  11   | expiry_date |   date   | 10 |   0    |    N     |  N   |   1970-01-01    | 过期日期  |
|  12   | location_id |   bigint   | 20 |   0    |    N     |  N   |       | 库位id  |
|  13   | location_code |   varchar   | 32 |   0    |    N     |  N   |       | 库位编码  |
|  14   | area_id |   bigint   | 20 |   0    |    N     |  N   |       | 库区id  |
|  15   | area_code |   varchar   | 32 |   0    |    N     |  N   |       | 库区编码  |
|  16   | area_type |   smallint   | 6 |   0    |    N     |  N   |       | 库区类型：1：可销售存储2：可销售拣货3：残损4：采退5：可销售存拣  |
|  17   | inbound_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 直接入库单号  |
|  18   | inbound_bill_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 直接入库类型  |
|  19   | purchase_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 采购单号  |
|  20   | inbound_date |   date   | 10 |   0    |    N     |  N   |   1970-01-01    | 入库日期  |
|  21   | inbound_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 直接入库时间  |
|  22   | inbound_qty |   int   | 10 |   0    |    N     |  N   |   0    | 入库数量  |
|  23   | outbound_qty |   int   | 10 |   0    |    N     |  N   |   0    | 出库数量  |
|  24   | lock_qty |   int   | 10 |   0    |    N     |  N   |   0    | 锁定数量  |
|  25   | freeze_qty |   int   | 10 |   0    |    N     |  N   |   0    | 冻结数量  |
|  26   | inbound_wgt |   decimal   | 19 |   2    |    N     |  N   |   0.00    | 入库重量  |
|  27   | outbound_wgt |   decimal   | 19 |   2    |    N     |  N   |   0.00    | 出库重量  |
|  28   | lock_wgt |   decimal   | 19 |   2    |    N     |  N   |   0.00    | 锁定重量  |
|  29   | freeze_wgt |   decimal   | 19 |   2    |    N     |  N   |   0.00    | 冻结重量  |
|  30   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1正常0删除  |
|  31   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  32   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  33   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  34   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="app_caterb2b_dbus_rt_zone_pick_bill">app_caterb2b_dbus_rt_zone_pick_bill</a>

**说明：** 拣货子任务主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | ware_house_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道id  |
|  4   | pick_bill_no |   varchar   | 50 |   0    |    N     |  N   |       | 拣货任务号  |
|  5   | zone_pick_bill_no |   varchar   | 50 |   0    |    N     |  N   |       | 分区子任务编号  |
|  6   | logic_area_id |   bigint   | 20 |   0    |    N     |  N   |       | 逻辑库区id  |
|  7   | logic_area_name |   varchar   | 32 |   0    |    N     |  N   |       | 逻辑库区名称  |
|  8   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  9   | route_name |   varchar   | 20 |   0    |    N     |  N   |       | 排线名称  |
|  10   | service_provider_name |   varchar   | 128 |   0    |    N     |  N   |       | 服务商名称  |
|  11   | service_provider_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 承运商id  |
|  12   | delivery_times |   varchar   | 256 |   0    |    N     |  N   |       | 配送时间段  |
|  13   | delivery_region_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送区域id  |
|  14   | delivery_region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 配送区域名称  |
|  15   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |
|  16   | pick_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 拣货任务的状态10已生成，20拣货中30拣货完成40已取消  |
|  17   | policy_type |   smallint   | 6 |   0    |    N     |  N   |   10    | 策略:10储位拣货策略  |
|  18   | sort_print_times |   smallint   | 6 |   0    |    N     |  N   |       | 分拣单打印次数  |
|  19   | pick_print_times |   smallint   | 6 |   0    |    N     |  N   |       | 拣货单打印次数  |
|  20   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 任务领取人账号ID  |
|  21   | handler_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |
|  22   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  23   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  24   | order_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣sku数  |
|  25   | actual_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣sku数  |
|  26   | order_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  27   | actual_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  28   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  29   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  30   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |       | 修改时间  |
|  31   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |
|  32   | priority_rank |   smallint   | 6 |   0    |    N     |  N   |   5    | 拣货任务的优先级1一级，2二级，3三级，4四级，5五级  |
|  33   | biz_bill_type |   smallint   | 6 |   0    |    Y     |  N   |   10    | 10订单正常出库11调拨出库12退供出库成品13订单换货出库14订单补货出库15退供原料出库  |

**表名：** <a id="app_caterb2b_dbus_shortage_statistics">app_caterb2b_dbus_shortage_statistics</a>

**说明：** 缺货统计

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | route_no |   varchar   | 30 |   0    |    Y     |  N   |       | 排线号  |
|  3   | route_name |   varchar   | 50 |   0    |    Y     |  N   |       | 排线名称  |
|  4   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  5   | sku_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  6   | sku_unit |   varchar   | 512 |   0    |    Y     |  N   |       | 单位  |
|  7   | sku_unit_desc |   varchar   | 512 |   0    |    Y     |  N   |       | 商品规格  |
|  8   | shortage_reason |   varchar   | 100 |   0    |    Y     |  N   |       | 缺货原因  |
|  9   | total_order_qty |   int   | 10 |   0    |    Y     |  N   |       | 订单汇总数量  |
|  10   | shortage_qty |   int   | 10 |   0    |    Y     |  N   |       | 缺货数量  |
|  11   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  12   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  13   | istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 是否有效0删除1有效  |
|  14   | record_status |   varchar   | 4 |   0    |    N     |  N   |   10    | 记录状态10暂存20已确认  |
|  15   | create_type |   varchar   | 4 |   0    |    N     |  N   |   10    | 生成方式10人工录入20系统分配  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  17   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  18   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  19   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  20   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 最小规格SKU，商品主单元  |
|  21   | delivery_times |   varchar   | 255 |   0    |    N     |  N   |       | 配送时段  |
|  22   | service_provider_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 承运商id  |
|  23   | service_provider_name |   varchar   | 128 |   0    |    N     |  N   |       | 服务商名称  |
|  24   | confirm_by |   varchar   | 128 |   0    |    N     |  N   |       | 确认人  |
|  25   | confirm_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 确认时间  |
|  26   | sale_mode |   varchar   | 4 |   0    |    N     |  N   |   1    | 销售模式1现货销售，2预售  |

**表名：** <a id="app_caterb2b_dbus_warehouse_base_config">app_caterb2b_dbus_warehouse_base_config</a>

**说明：** 仓基础配置表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | config_type |   smallint   | 6 |   0    |    N     |  N   |       | 配置类型，1:截单时间DEADLINE_TIME2:加工客户端版本号CLIENT_VERSION  |
|  5   | config_value |   varchar   | 256 |   0    |    N     |  N   |       | 配置内容  |
|  6   | config_comment |   varchar   | 256 |   0    |    N     |  N   |       | 配置描述  |
|  7   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 状态:1有效,0删除  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  9   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |
|  11   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后更新人  |

**表名：** <a id="app_caterb2b_hourly_fresh_order_stat_csu_bu">app_caterb2b_hourly_fresh_order_stat_csu_bu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | warehouse_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | hour |   varchar   | 10 |   0    |    N     |  Y   |       |   |
|  5   | csu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  6   | csu_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | csu_real_amt |   decimal   | 13 |   2    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_hourly_fresh_order_stat_csu_bu_date">app_caterb2b_hourly_fresh_order_stat_csu_bu_date</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | warehouse_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | hour |   varchar   | 10 |   0    |    N     |  Y   |       |   |
|  5   | date |   datetime   | 19 |   0    |    N     |  Y   |       |   |
|  6   | csu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  7   | csu_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | csu_real_amt |   decimal   | 13 |   2    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_meat_battle_board">app_caterb2b_meat_battle_board</a>

**说明：** 肉禽攻坚战看板-全国实时数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  3   | pay_amt |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 销售额  |
|  4   | meat_poultry_pay_amt |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 肉禽销售额  |
|  5   | gross_weight |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 肉禽购买斤数  |
|  6   | veg_fruit_pay_amt |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 蔬菜水果销售额  |
|  7   | customer_ids |   json   | 1073741824 |   0    |    Y     |  N   |       | 合作客户列表  |
|  8   | meat_poultry_customer_ids |   json   | 1073741824 |   0    |    Y     |  N   |       | 肉禽合作客户列表  |
|  9   | new_customer_ids |   json   | 1073741824 |   0    |    Y     |  N   |       | 新客列表  |
|  10   | revived_customer_ids |   json   | 1073741824 |   0    |    Y     |  N   |       | 复活客户列表  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  12   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_caterb2b_mobile_sales_bd_stat">app_caterb2b_mobile_sales_bd_stat</a>

**说明：** 快驴-销售管理移动版实时数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_scale |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | time_tag |   int   | 10 |   0    |    N     |  Y   |       | 时间维度标记:1准实时,2每小时增量  |
|  3   | hour_time |   varchar   | 8 |   0    |    N     |  Y   |       | 时间小时  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  5   | bu_name |   varchar   | 40 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | bd_name |   varchar   | 40 |   0    |    Y     |  N   |       | BD姓名  |
|  7   | bd_id |   int   | 10 |   0    |    N     |  Y   |       | BD员工id  |
|  8   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  9   | city_name |   varchar   | 40 |   0    |    Y     |  N   |       | 城市名称  |
|  10   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 区ID  |
|  11   | area_name |   varchar   | 40 |   0    |    Y     |  N   |       | 区域名称  |
|  12   | org_id |   int   | 10 |   0    |    N     |  Y   |       | 销售组id  |
|  13   | org_name |   varchar   | 40 |   0    |    Y     |  N   |       | 销售组名称  |
|  14   | total_sale_amt |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 总销售额  |
|  15   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期合作商户数  |
|  16   | total_amt_allmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 肉禽销售额  |
|  17   | total_amt_fresh |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 蔬果销售额  |
|  18   | total_amt_freshmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 鲜肉销售额  |
|  19   | total_amt_freezemeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻肉销售额  |
|  20   | total_amt_freezeother |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻半销售额  |
|  21   | total_amt_wine |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 酒饮销售额  |
|  22   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  23   | total_new_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期新客数  |
|  24   | total_spu_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期内每客户购买spu种类数之和  |
|  25   | total_cooper_cnt_daily_allmeat |   int   | 10 |   0    |    Y     |  N   |   0    | (肉禽)每日合作客户数于统计期内累加  |
|  26   | total_cooper_cnt_daily_fresh |   int   | 10 |   0    |    Y     |  N   |   0    | (蔬果)每日合作客户数于统计期内累加  |
|  27   | total_cooper_cnt_freshmeat |   int   | 10 |   0    |    Y     |  N   |   0    | 鲜肉合作客户数  |
|  28   | total_amt_rice |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 米面粮油销售额  |

**表名：** <a id="app_caterb2b_mobile_sales_bd_stat_3p">app_caterb2b_mobile_sales_bd_stat_3p</a>

**说明：** 快驴-销售管理移动版实时数据3P

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | date_scale |   varchar   | 32 |   0    |    N     |  N   |       | 生成日期,YYYYMMDD  |
|  3   | time_tag |   int   | 10 |   0    |    N     |  N   |       | 时间维度标记:1准实时,2每小时增量  |
|  4   | hour_time |   varchar   | 8 |   0    |    N     |  N   |       | 时间小时  |
|  5   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  6   | bu_name |   varchar   | 40 |   0    |    Y     |  N   |       | 事业部名称  |
|  7   | bd_name |   varchar   | 40 |   0    |    Y     |  N   |       | BD姓名  |
|  8   | bd_id |   int   | 10 |   0    |    N     |  N   |       | BD员工id  |
|  9   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  10   | city_name |   varchar   | 40 |   0    |    Y     |  N   |       | 城市名称  |
|  11   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 区ID  |
|  12   | area_name |   varchar   | 40 |   0    |    Y     |  N   |       | 区域名称  |
|  13   | org_id |   int   | 10 |   0    |    N     |  N   |       | 销售组id  |
|  14   | org_name |   varchar   | 40 |   0    |    Y     |  N   |       | 销售组名称  |
|  15   | total_sale_amt |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 总销售额  |
|  16   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期合作商户数  |
|  17   | total_amt_allmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 肉禽销售额  |
|  18   | total_amt_fresh |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 蔬果销售额  |
|  19   | total_amt_freshmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 鲜肉销售额  |
|  20   | total_amt_freezemeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻肉销售额  |
|  21   | total_amt_freezeother |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻半销售额  |
|  22   | total_amt_wine |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 酒饮销售额  |
|  23   | total_new_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期新客数  |
|  24   | total_spu_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期内每客户购买spu种类数之和  |
|  25   | total_cooper_cnt_daily_allmeat |   int   | 10 |   0    |    Y     |  N   |   0    | (肉禽)每日合作客户数于统计期内累加  |
|  26   | total_cooper_cnt_daily_fresh |   int   | 10 |   0    |    Y     |  N   |   0    | (蔬果)每日合作客户数于统计期内累加  |
|  27   | total_cooper_cnt_freshmeat |   int   | 10 |   0    |    Y     |  N   |   0    | 鲜肉合作客户数  |
|  28   | total_amt_rice |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 米面粮油销售额  |
|  29   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  30   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_caterb2b_mobile_sales_bd_stat_with_3p">app_caterb2b_mobile_sales_bd_stat_with_3p</a>

**说明：** 快驴-销售管理移动版实时数据3P

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | date_scale |   varchar   | 32 |   0    |    N     |  N   |       | 生成日期,YYYYMMDD  |
|  3   | time_tag |   int   | 10 |   0    |    N     |  N   |       | 时间维度标记:1准实时,2每小时增量  |
|  4   | hour_time |   varchar   | 8 |   0    |    N     |  N   |       | 时间小时  |
|  5   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  6   | bu_name |   varchar   | 40 |   0    |    Y     |  N   |       | 事业部名称  |
|  7   | bd_name |   varchar   | 40 |   0    |    Y     |  N   |       | BD姓名  |
|  8   | bd_id |   int   | 10 |   0    |    N     |  N   |       | BD员工id  |
|  9   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  10   | city_name |   varchar   | 40 |   0    |    Y     |  N   |       | 城市名称  |
|  11   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 区ID  |
|  12   | area_name |   varchar   | 40 |   0    |    Y     |  N   |       | 区域名称  |
|  13   | org_id |   int   | 10 |   0    |    N     |  N   |       | 销售组id  |
|  14   | org_name |   varchar   | 40 |   0    |    Y     |  N   |       | 销售组名称  |
|  15   | total_sale_amt |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 总销售额  |
|  16   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期合作商户数  |
|  17   | total_amt_allmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 肉禽销售额  |
|  18   | total_amt_fresh |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 蔬果销售额  |
|  19   | total_amt_freshmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 鲜肉销售额  |
|  20   | total_amt_freezemeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻肉销售额  |
|  21   | total_amt_freezeother |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻半销售额  |
|  22   | total_amt_wine |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 酒饮销售额  |
|  23   | total_new_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期新客数  |
|  24   | total_spu_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期内每客户购买spu种类数之和  |
|  25   | total_cooper_cnt_daily_allmeat |   int   | 10 |   0    |    Y     |  N   |   0    | (肉禽)每日合作客户数于统计期内累加  |
|  26   | total_cooper_cnt_daily_fresh |   int   | 10 |   0    |    Y     |  N   |   0    | (蔬果)每日合作客户数于统计期内累加  |
|  27   | total_cooper_cnt_freshmeat |   int   | 10 |   0    |    Y     |  N   |   0    | 鲜肉合作客户数  |
|  28   | total_amt_rice |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 米面粮油销售额  |
|  29   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  30   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_caterb2b_mobile_sales_stat">app_caterb2b_mobile_sales_stat</a>

**说明：** 快驴-销售管理移动版实时数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_scale |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | time_tag |   int   | 10 |   0    |    N     |  Y   |       | 时间维度标记:1准实时,2每小时增量  |
|  3   | hour_time |   varchar   | 8 |   0    |    N     |  Y   |       | 时间小时  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  5   | bu_name |   varchar   | 40 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | bd_name |   varchar   | 40 |   0    |    Y     |  N   |       | BD姓名  |
|  7   | bd_id |   int   | 10 |   0    |    N     |  Y   |       | BD员工id  |
|  8   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  9   | city_name |   varchar   | 40 |   0    |    Y     |  N   |       | 城市名称  |
|  10   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 区ID  |
|  11   | area_name |   varchar   | 40 |   0    |    Y     |  N   |       | 区域名称  |
|  12   | org_id |   int   | 10 |   0    |    N     |  Y   |       | 销售组id  |
|  13   | org_name |   varchar   | 40 |   0    |    Y     |  N   |       | 销售组名称  |
|  14   | total_sale_amt |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 总销售额  |
|  15   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期合作商户数  |
|  16   | total_amt_allmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 肉禽销售额  |
|  17   | total_amt_fresh |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 蔬果销售额  |
|  18   | total_amt_freshmeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 鲜肉销售额  |
|  19   | total_amt_freezemeat |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻肉销售额  |
|  20   | total_amt_freezeother |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 冻半销售额  |
|  21   | total_amt_wine |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 酒饮销售额  |
|  22   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  23   | total_new_cooper_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 统计期新客数  |
|  24   | total_spu_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 统计期内每客户购买spu种类数之和  |
|  25   | total_cooper_cnt_daily_allmeat |   int   | 10 |   0    |    Y     |  N   |   0    | (肉禽)每日合作客户数于统计期内累加  |
|  26   | total_cooper_cnt_daily_fresh |   int   | 10 |   0    |    Y     |  N   |   0    | (蔬果)每日合作客户数于统计期内累加  |
|  27   | total_cooper_cnt_freshmeat |   int   | 10 |   0    |    Y     |  N   |   0    | 鲜肉合作客户数  |
|  28   | total_amt_rice |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 米面粮油销售额  |

**表名：** <a id="app_caterb2b_poc_rt_data">app_caterb2b_poc_rt_data</a>

**说明：** POC实时结果表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   varchar   | 32 |   0    |    N     |  Y   |       | 日期(YYYY-MM-DD)  |
|  2   | sku_id |   int   | 10 |   0    |    N     |  Y   |       | 商品SKUCode  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 仓库ID  |
|  4   | count |   bigint   | 20 |   0    |    Y     |  N   |   0    | 销量  |
|  5   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_purchase_inbound_wh_cat1_stat">app_caterb2b_purchase_inbound_wh_cat1_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | purchase_bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购单数量  |
|  3   | purchase_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  4   | purchase_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购sku数  |
|  5   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到数量  |
|  6   | late_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到sku数  |
|  7   | purchase_inbound_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成数量  |
|  8   | purchase_inbound_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成sku数  |
|  9   | arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货数量  |
|  10   | arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货sku数  |
|  11   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  13   | sku_category1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级类目id  |
|  14   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  15   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 监控日期  |
|  16   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  18   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_purchase_inbound_wh_cat2_stat">app_caterb2b_purchase_inbound_wh_cat2_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | purchase_bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购单数量  |
|  3   | purchase_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  4   | purchase_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购sku数  |
|  5   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到数量  |
|  6   | late_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到sku数  |
|  7   | late_disc_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸件数  |
|  8   | late_disc_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸sku数  |
|  9   | not_arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库数量  |
|  10   | not_arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库sku数  |
|  11   | out_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 缺货数量  |
|  12   | out_stock_sku_cn |   int   | 10 |   0    |    Y     |  N   |       | 缺货sku数  |
|  13   | purchase_inbound_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成数量  |
|  14   | purchase_inbound_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成sku数  |
|  15   | arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货数量  |
|  16   | arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货sku数  |
|  17   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  19   | supplier_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  21   | sku_category1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级类目id  |
|  22   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  23   | sku_category2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级类目id  |
|  24   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级类目名称  |
|  25   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 监控日期  |
|  26   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  27   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  28   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  29   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型：0-全部；1-自营；2-pop；3-代仓代配  |

**表名：** <a id="app_caterb2b_purchase_inbound_wh_stat">app_caterb2b_purchase_inbound_wh_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | purchase_bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购单数量  |
|  3   | purchase_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  4   | purchase_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购sku数  |
|  5   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到数量  |
|  6   | late_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到sku数  |
|  7   | late_disc_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸件数  |
|  8   | late_disc_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸sku数  |
|  9   | not_arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库数量  |
|  10   | not_arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库sku数  |
|  11   | out_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 缺货数量  |
|  12   | out_stock_sku_cn |   int   | 10 |   0    |    Y     |  N   |       | 缺货sku数  |
|  13   | purchase_inbound_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成数量  |
|  14   | purchase_inbound_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成sku数  |
|  15   | arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货数量  |
|  16   | arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货sku数  |
|  17   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  19   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 监控日期  |
|  20   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  21   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  22   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  23   | all_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总车次  |
|  24   | later_arrive_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚到车次  |
|  25   | later_discharge_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸车次  |
|  26   | sign_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总签到车次数  |
|  27   | unload_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总卸货车次数  |

**表名：** <a id="app_caterb2b_purchase_inbound_wh_supplier_stat">app_caterb2b_purchase_inbound_wh_supplier_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | purchase_bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购单数量  |
|  3   | purchase_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  4   | purchase_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 采购sku数  |
|  5   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到数量  |
|  6   | late_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 供应商晚到sku数  |
|  7   | late_disc_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸件数  |
|  8   | late_disc_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸sku数  |
|  9   | not_arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库数量  |
|  10   | not_arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库sku数  |
|  11   | out_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 缺货数量  |
|  12   | out_stock_sku_cn |   int   | 10 |   0    |    Y     |  N   |       | 缺货sku数  |
|  13   | purchase_inbound_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成数量  |
|  14   | purchase_inbound_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成sku数  |
|  15   | arrive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货数量  |
|  16   | arrive_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 实际到货sku数  |
|  17   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  19   | supplier_id |   int   | 10 |   0    |    Y     |  N   |       | 供应商id  |
|  20   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名称  |
|  21   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 监控日期  |
|  22   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  23   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  24   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  25   | all_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总车次  |
|  26   | later_arrive_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚到车次  |
|  27   | later_discharge_car_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚卸车次  |
|  28   | sign_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总签到车次数  |
|  29   | unload_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总卸货车次数  |
|  30   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型：0-全部；1-自营；2-pop；3-代仓代配  |

**表名：** <a id="app_caterb2b_rt_bd_ka_perf_detail">app_caterb2b_rt_bd_ka_perf_detail</a>

**说明：** 数据魔方-bdka销售明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  3   | bu_name |   varchar   | 80 |   0    |    Y     |  N   |       | 事业部名称  |
|  4   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  5   | org_name |   varchar   | 80 |   0    |    Y     |  N   |       | 小组名称  |
|  6   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bdid  |
|  7   | bd_name |   varchar   | 80 |   0    |    Y     |  N   |       | bd名称  |
|  8   | pos_code |   varchar   | 32 |   0    |    Y     |  N   |       | 岗位编码  |
|  9   | total_sale_amt |   decimal   | 21 |   4    |    Y     |  N   |       | 销售额  |
|  10   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  11   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 统计时间  |
|  12   | c_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_caterb2b_rt_bd_perf_category_detail">app_caterb2b_rt_bd_perf_category_detail</a>

**说明：** BD人效类目维度

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | order_item_id |   bigint   | 20 |   0    |    N     |  Y   |       | 订单明细id  |
|  3   | order_id |   bigint   | 20 |   0    |    Y     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    Y     |  N   |       | 订单号  |
|  5   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  6   | csu_id |   bigint   | 20 |   0    |    Y     |  N   |       | csuid  |
|  7   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 商品名称  |
|  8   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  9   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  10   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | BD的id  |
|  11   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | BD的姓名  |
|  12   | bd_info_id |   int   | 10 |   0    |    Y     |  N   |       | bdInfoId  |
|  13   | bd_mis_id |   varchar   | 64 |   0    |    Y     |  N   |       | BD的MisID  |
|  14   | bd_hire_date |   date   | 10 |   0    |    Y     |  N   |       | db入职时间  |
|  15   | bus_type |   int   | 10 |   0    |    N     |  Y   |   0    | 商户类型0:全部1:餐饮2:流通  |
|  16   | byr_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  17   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  18   | is_ka |   int   | 10 |   0    |    Y     |  N   |   0    | KA客户/非KA客户1:KA客户0:非KA客户  |
|  19   | active_tag_id |   int   | 10 |   0    |    Y     |  N   |       | 客户ABCD分层标签id  |
|  20   | active_tag_name |   varchar   | 60 |   0    |    Y     |  N   |       | 客户ABCD分层标签  |
|  21   | pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  22   | quantity |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  23   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级分类ID  |
|  24   | cat1_name |   varchar   | 128 |   0    |    Y     |  N   |       | 一级分类名称  |
|  25   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级分类ID  |
|  26   | cat2_name |   varchar   | 128 |   0    |    Y     |  N   |       | 二级分类名称  |
|  27   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | 三级分类ID  |
|  28   | cat3_name |   varchar   | 128 |   0    |    Y     |  N   |       | 三级分类名称  |
|  29   | ba_cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 商分一级分类id  |
|  30   | ba_cat1_name |   varchar   | 128 |   0    |    Y     |  N   |       | 商分一级分类名称  |
|  31   | ba_cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 商分二级分类id  |
|  32   | ba_cat2_name |   varchar   | 128 |   0    |    Y     |  N   |       | 商分二级分类名称  |
|  33   | old_byr_id |   int   | 10 |   0    |    Y     |  N   |       | 老客商户id  |
|  34   | cy_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 餐饮销售额  |
|  35   | fresh_byr_id |   int   | 10 |   0    |    Y     |  N   |       | 生鲜商户id  |
|  36   | fresh_byr_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 生鲜销售额  |
|  37   | old_fresh_byr_id |   int   | 10 |   0    |    Y     |  N   |       | 生鲜老客id  |
|  38   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  39   | bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 事业部名称  |
|  40   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  41   | city_name |   varchar   | 64 |   0    |    Y     |  N   |       | 城市名称  |
|  42   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  43   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  44   | org_bdm_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组bdm名称  |
|  45   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  46   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |       | 统计时间  |
|  47   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  48   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |

**表名：** <a id="app_caterb2b_rt_bd_perf_detail">app_caterb2b_rt_bd_perf_detail</a>

**说明：** BD人效详情实时表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | BD的id  |
|  3   | bd_info_id |   int   | 10 |   0    |    N     |  Y   |       | bdInfoId  |
|  4   | bd_mis_id |   varchar   | 64 |   0    |    Y     |  N   |       | BD的MisID  |
|  5   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | BD的姓名  |
|  6   | bd_hire_date |   date   | 10 |   0    |    Y     |  N   |       | db入职时间  |
|  7   | pos_code |   varchar   | 32 |   0    |    Y     |  N   |       | 岗位编码  |
|  8   | pos_name |   varchar   | 64 |   0    |    Y     |  N   |       | 岗位名称  |
|  9   | bus_type |   int   | 10 |   0    |    N     |  Y   |   0    | 商户类型0:全部1:餐饮2:流通  |
|  10   | yday_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 昨日同期销售额  |
|  11   | pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  12   | ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 订单量  |
|  13   | yday_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日同期合作商户数  |
|  14   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 合作商户数  |
|  15   | yday_new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日同期新客数  |
|  16   | new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 新客数  |
|  17   | yday_old_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日同期老客数  |
|  18   | old_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 老客数  |
|  19   | new_byr_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 新客销售额  |
|  20   | old_byr_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 老客销售额  |
|  21   | new_byr_ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 新客订单数  |
|  22   | old_byr_order_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 老客订单数  |
|  23   | fresh_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 生鲜商户数  |
|  24   | fresh_new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 生鲜新客数  |
|  25   | fresh_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 生鲜销售额  |
|  26   | cy_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 餐饮销售额  |
|  27   | org_sku_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 小组sku数  |
|  28   | yday_deal_sku_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日同期BD成交sku数  |
|  29   | deal_sku_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | BD成交sku数  |
|  30   | total_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | BD累计合作商户数  |
|  31   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  32   | bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 事业部名称  |
|  33   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  34   | city_name |   varchar   | 64 |   0    |    Y     |  N   |       | 城市名称  |
|  35   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  36   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  37   | org_bdm_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组bdm名称  |
|  38   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  39   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |       | 统计时间  |
|  40   | yday_meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 昨日同期肉禽销售额  |
|  41   | meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 肉禽销售额  |
|  42   | yday_meat_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日同期肉禽合作商户数  |
|  43   | meat_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 肉禽合作商户数  |
|  44   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  45   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |
|  46   | vegetable_fruit_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 蔬菜水果销售额  |
|  47   | frozen_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 冻肉销售额  |
|  48   | fresh_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 鲜肉销售额  |
|  49   | vegetable_fruit_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果合作客户数  |
|  50   | frozen_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 冻肉合作客户数  |
|  51   | fresh_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉合作客户数  |

**表名：** <a id="app_caterb2b_rt_bd_target_ext_new">app_caterb2b_rt_bd_target_ext_new</a>

**说明：** 目标系统实时的SKU、SPU指标

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | bd_id |   int   | 10 |   0    |    N     |  N   |   0    | 销售的id  |
|  3   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部id  |
|  4   | org_id |   int   | 10 |   0    |    N     |  N   |   0    | 小组id  |
|  5   | time_by_day |   varchar   | 60 |   0    |    N     |  N   |       | 以天为粒度的日期  |
|  6   | spu_sum |   int   | 10 |   0    |    N     |  N   |   0    | 单个客户SPU数去重，总计不去重的SPU在BD维度之和  |
|  7   | sku_sum |   int   | 10 |   0    |    N     |  N   |   0    | 单个客户SKU数去重，总计不去重的SKU在BD维度之和  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  9   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  10   | bd_info_id |   int   | 10 |   0    |    N     |  N   |   0    | bd_info_id  |
|  11   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  12   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |
|  13   | fresh_meat_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单鲜肉客户数  |
|  14   | vegetable_fruit_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单蔬菜水果客户数  |
|  15   | meat_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单肉禽客户数  |
|  16   | rice_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单米客户数  |
|  17   | visit_count |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  18   | visit_by_phone |   int   | 10 |   0    |    N     |  N   |   0    | 电话拜访客户数  |
|  19   | visit_on_site |   int   | 10 |   0    |    N     |  N   |   0    | 上门拜访客户数  |
|  20   | wake_up_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 唤醒客户数  |
|  21   | tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类客户数  |
|  22   | tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类客户数  |
|  23   | tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类客户数  |
|  24   | tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类客户数  |
|  25   | visit_cust_a_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 有效拜访A类客户数  |
|  26   | visit_cust_b_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 有效拜访B类客户数  |
|  27   | visit_cust_c_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 有效拜访C类客户数  |
|  28   | visit_cust_d_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 有效拜访D类客户数  |
|  29   | fresh_meat_tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉A类客户数  |
|  30   | fresh_meat_tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉B类客户数  |
|  31   | fresh_meat_tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉C类客户数  |
|  32   | fresh_meat_tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉D类客户数  |
|  33   | fruit_tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果A类客户数  |
|  34   | fruit_tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果B类客户数  |
|  35   | fruit_tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果C类客户数  |
|  36   | fruit_tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果D类客户数  |
|  37   | tag_a1_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果D类客户数  |
|  38   | tag_a2_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果D类客户数  |
|  39   | tag_a_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类客户总数  |
|  40   | tag_a1_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A1类客户总数  |
|  41   | tag_a2_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A2类客户总数  |
|  42   | tag_b_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类客户总数  |
|  43   | tag_c_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类客户总数  |
|  44   | tag_d_byr_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类客户总数  |

**表名：** <a id="app_caterb2b_rt_case_dtc_object">app_caterb2b_rt_case_dtc_object</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | dtc_object_key |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  3   | dtc_object_id |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  4   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_case_extend">app_caterb2b_rt_case_extend</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | skuname |   text   | 65535 |   0    |    Y     |  N   |       |   |
|  3   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  4   | field_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_case_main">app_caterb2b_rt_case_main</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | third_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | memo |   varchar   | 256 |   0    |    Y     |  N   |       |   |
|  4   | owner_name |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  5   | second_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  6   | creator_dept_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  7   | first_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  8   | lifecycle |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | question_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  10   | first_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | second_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  13   | third_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  14   | content |   text   | 65535 |   0    |    Y     |  N   |       |   |
|  15   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  16   | source |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | closer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | question_reason_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  19   | creator_Id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | owner_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  21   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  22   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  23   | creator_name |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  24   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  25   | question_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  26   | start_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  27   | mobile |   varchar   | 16 |   0    |    Y     |  N   |       |   |
|  28   | customer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  29   | customer_type |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_customer_biz_detail">app_caterb2b_rt_customer_biz_detail</a>

**说明：** 快驴事业部-营销活动数据记录表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | customer_id |   int   | 10 |   0    |    N     |  N   |       | 客户ID  |
|  3   | biz_id |   int   | 10 |   0    |    N     |  N   |       | 活动ID  |
|  4   | biz_type |   int   | 10 |   0    |    N     |  N   |       | 活动类型  |
|  5   | latest_item_rule_id |   varchar   | 128 |   0    |    N     |  N   |       | 最新的活动门槛ID  |
|  6   | received_coupon_count |   int   | 10 |   0    |    N     |  N   |   0    | 已领券的数量  |
|  7   | received_coupon_detail |   varchar   | 128 |   0    |    N     |  N   |   []    | 已领券的详情，couponBuyerId列表  |
|  8   | used_coupon_count |   int   | 10 |   0    |    N     |  N   |   0    | 已用券的数量  |
|  9   | used_coupon_detail |   varchar   | 128 |   0    |    N     |  N   |   []    | 已用券的详情,couponBuyerId列表  |
|  10   | remain_coupon_count |   int   | 10 |   0    |    N     |  N   |   0    | 可用券的数量  |
|  11   | remain_coupon_detail |   varchar   | 128 |   0    |    N     |  N   |   []    | 可用券的详情，couponBuyerId列表  |
|  12   | latest_coupon_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后一次发券时间  |
|  13   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 条目创建时间  |
|  14   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 条目更新时间  |

**表名：** <a id="app_caterb2b_rt_customer_business_type">app_caterb2b_rt_customer_business_type</a>

**说明：** 客户业务归属标签表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 关联客户id  |
|  3   | customer_business_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 1普通业务、2KA业务、3电销业务  |
|  4   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  5   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  6   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  7   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  8   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  9   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="app_caterb2b_rt_fact_grid_indicator_agg">app_caterb2b_rt_fact_grid_indicator_agg</a>

**说明：** 网格实时指标

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | grid_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 网格id  |
|  3   | time_by_day |   varchar   | 60 |   0    |    N     |  N   |       | 以天为粒度的日期  |
|  4   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |   0.000000    | 餐饮销售额（元）  |
|  5   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 餐饮合作客户数  |
|  6   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  7   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="app_caterb2b_rt_flink_case_dtc_object">app_caterb2b_rt_flink_case_dtc_object</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | dtc_object_key |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  3   | dtc_object_id |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  4   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_flink_case_dtc_object_new">app_caterb2b_rt_flink_case_dtc_object_new</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_dtc_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   bigint   | 20 |   0    |    N     |  N   |       |   |
|  3   | dtc_object_key |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  4   | dtc_object_id |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  5   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  8   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_flink_case_extend_info">app_caterb2b_rt_flink_case_extend_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | skuname |   text   | 65535 |   0    |    Y     |  N   |       |   |
|  3   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  4   | field_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_flink_case_main">app_caterb2b_rt_flink_case_main</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | third_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | memo |   varchar   | 256 |   0    |    Y     |  N   |       |   |
|  4   | owner_name |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  5   | second_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  6   | creator_dept_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  7   | first_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  8   | lifecycle |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | question_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  10   | first_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | second_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  13   | third_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  14   | content |   text   | 65535 |   0    |    Y     |  N   |       |   |
|  15   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  16   | source |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | closer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | question_reason_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  19   | creator_Id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | owner_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  21   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  22   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  23   | creator_name |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  24   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  25   | question_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  26   | start_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  27   | fourth_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  28   | fourth_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  29   | fifth_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  30   | fifth_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_flink_new_case_dtc_object">app_caterb2b_rt_flink_new_case_dtc_object</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_dtc_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   bigint   | 20 |   0    |    N     |  N   |       |   |
|  3   | dtc_object_key |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  4   | dtc_object_id |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  5   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  8   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_flink_new_case_extend_info">app_caterb2b_rt_flink_new_case_extend_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_extend_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   bigint   | 20 |   0    |    N     |  N   |       |   |
|  3   | skuname |   text   | 65535 |   0    |    Y     |  N   |       |   |
|  4   | add_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  5   | field_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  6   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | update_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  8   | add_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_labor_feature">app_caterb2b_rt_labor_feature</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | wh_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | date_time |   varchar   | 45 |   0    |    N     |  Y   |       |   |
|  4   | bigcat_type |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | promotion_cat_label |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | is_work_day |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | total_arranged_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | arranged_cnt_rate |   double   | 23 |   0    |    Y     |  N   |       |   |
|  9   | total_seckill_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | interval_seckill_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | seckill_sku_rate |   double   | 23 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_rt_order">app_caterb2b_rt_order</a>

**说明：** 同步线上实时订单数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | order_id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | byr_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  3   | byr_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  6   | ord_status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  7   | ctime |   int   | 10 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | utime |   int   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  9   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  11   | warehouse_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  13   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  14   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |

**表名：** <a id="app_caterb2b_rt_order_bak">app_caterb2b_rt_order_bak</a>

**说明：** 同步线上实时订单数据历史表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | order_id |   int   | 10 |   0    |    N     |  N   |       | 订单id  |
|  3   | byr_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  4   | byr_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  5   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  6   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  7   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事务部ID  |
|  8   | ord_status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  9   | ctime |   int   | 10 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | utime |   int   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  13   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  14   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  15   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |

**表名：** <a id="app_caterb2b_rt_order_detail">app_caterb2b_rt_order_detail</a>

**说明：** 同步线上订单详情数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单明细id  |
|  2   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  3   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  4   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  5   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  6   | csu_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  7   | csu_ord_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  8   | csu_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  9   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  10   | csu_ord_cnt |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  11   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | ctime |   int   | 10 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | utime |   int   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  15   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  16   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_rt_order_detail_bak">app_caterb2b_rt_order_detail_bak</a>

**说明：** 同步线上订单详情数据历史表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 主键id无意义  |
|  2   | detail_id |   int   | 10 |   0    |    Y     |  N   |       | 订单明细id  |
|  3   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  4   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  5   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  6   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  7   | csu_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  8   | csu_ord_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  9   | csu_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |   0.00    |   |
|  10   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  11   | csu_ord_cnt |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  12   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  14   | ctime |   int   | 10 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | utime |   int   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_rt_order_stat_csu_bu">app_caterb2b_rt_order_stat_csu_bu</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | csu_id |   int   | 10 |   0    |    N     |  Y   |       | csuid  |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部ID  |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       | 城市ID  |
|  4   | warehouse_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | arranged_csu_ord_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 单品折扣前价格  |
|  6   | arranged_csu_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 单品折扣后价格  |
|  7   | arranged_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 满减与优惠券抵扣金额  |
|  8   | arranged_csu_cnt |   int   | 10 |   0    |    Y     |  N   |       | 销量  |
|  9   | date_time |   datetime   | 19 |   0    |    N     |  Y   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_rt_order_stat_csu_bu_ch">app_caterb2b_rt_order_stat_csu_bu_ch</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | csu_id |   int   | 10 |   0    |    N     |  Y   |       | csuid  |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部ID  |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       | 城市ID  |
|  4   | warehouse_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | arranged_csu_ord_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 单品折扣前价格  |
|  6   | arranged_csu_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 单品折扣后价格  |
|  7   | arranged_coupon_amt |   decimal   | 13 |   2    |    Y     |  N   |       | 满减与优惠券抵扣金额  |
|  8   | arranged_csu_cnt |   int   | 10 |   0    |    Y     |  N   |       | 销量  |
|  9   | date_time |   datetime   | 19 |   0    |    N     |  Y   |   CURRENT_TIMESTAMP    |   |
|  10   | channel_id |   int   | 10 |   0    |    N     |  Y   |       | 渠道id  |
|  11   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 有价券分摊金额  |
|  12   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  13   | business_type |   int   | 10 |   0    |    N     |  Y   |   0    | 业务类型，1：KA，2：中B，3：小B  |
|  14   | gross_weight |   decimal   | 11 |   3    |    N     |  N   |   0.000    | 毛重  |

**表名：** <a id="app_caterb2b_rt_promotion_item_rule">app_caterb2b_rt_promotion_item_rule</a>

**说明：** 单品促销信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | sku_code |   int   | 10 |   0    |    N     |  N   |   0    | skuCode  |
|  3   | csu_code |   int   | 10 |   0    |    N     |  N   |   0    | csuCode  |
|  4   | csu_name |   varchar   | 255 |   0    |    N     |  N   |       | csu名称  |
|  5   | csu_brand_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu品牌ID  |
|  6   | cat1_id |   int   | 10 |   0    |    N     |  N   |   0    | 第一层分类  |
|  7   | cat2_id |   int   | 10 |   0    |    N     |  N   |   0    | 第二层分类  |
|  8   | cat3_id |   int   | 10 |   0    |    N     |  N   |   0    | 第三层分类  |
|  9   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部ID  |
|  10   | sales_grid_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 售卖区域ID  |
|  11   | discount_price |   int   | 10 |   0    |    N     |  N   |   999999    | 促销价  |
|  12   | display_type |   bit   | 1 |   0    |    N     |  N   |   1    | 展示类型1-划价2-标签  |
|  13   | restrict_remain_total_count |   int   | 10 |   0    |    N     |  N   |   0    | 剩余库存限购总数量，1~99999999，-1为不限  |
|  14   | restrict_total_count |   int   | 10 |   0    |    N     |  N   |   0    | 限购总数量，1~99999999，-1为不限  |
|  15   | restrict_day_count |   int   | 10 |   0    |    N     |  N   |   0    | 客户单日限购数量，1~999，-1为不限  |
|  16   | state |   tinyint   | 4 |   0    |    N     |  N   |   0    | 活动状态。0为待提报，1为未开始，2为活动中，3为已暂停，4为已结束，5为审批中  |
|  17   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 开始时间  |
|  18   | end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 结束时间  |
|  19   | deleted |   tinyint   | 4 |   0    |    N     |  N   |   1    | 删除标记1-正常2-删除  |
|  20   | ctime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  21   | create_acc |   varchar   | 100 |   0    |    N     |  N   |       | 创建人账号  |
|  22   | utime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  23   | update_acc |   varchar   | 100 |   0    |    N     |  N   |       | 更新人账号  |
|  24   | origin_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 起源ID，用于追溯修改过程  |
|  25   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |

**表名：** <a id="app_caterb2b_rt_sell_grid">app_caterb2b_rt_sell_grid</a>

**说明：** 售卖区域表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 售卖区域ID  |
|  2   | sell_grid_name |   varchar   | 64 |   0    |    N     |  N   |       | 分类名  |
|  3   | sell_grid_status |   smallint   | 5 |   0    |    N     |  N   |   1    | 售卖区域状态，1草稿2待开启3开启4废弃  |
|  4   | bu_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 事业部id  |
|  5   | coordinates |   text   | 65535 |   0    |    Y     |  N   |       | 坐标点集合  |
|  6   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 坐标点所属城市  |
|  7   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  8   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  9   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  10   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  11   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  12   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="app_caterb2b_rt_transport_feature">app_caterb2b_rt_transport_feature</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | wh_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | region_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | date_time |   varchar   | 45 |   0    |    N     |  Y   |       |   |
|  5   | total_arranged_amt |   double   | 23 |   0    |    Y     |  N   |       |   |
|  6   | interval_arranged_amt |   double   | 23 |   0    |    Y     |  N   |       |   |
|  7   | total_poi_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | interval_poi_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | amt_rate |   double   | 23 |   0    |    Y     |  N   |       |   |
|  10   | poi_rate |   double   | 23 |   0    |    Y     |  N   |       |   |
|  11   | promotion_cat_label |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | ord_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_seckill_byr_push">app_caterb2b_seckill_byr_push</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  2   | city_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | byr_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | csu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  5   | last_send_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | seckill_scene_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  7   | valid |   int   | 10 |   0    |    Y     |  N   |       | 秒杀状态0代表秒杀活动无效1代表秒杀活动有效  |
|  8   | seckill_stime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  9   | seckill_etime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  10   | type |   int   | 10 |   0    |    N     |  Y   |       | 0:常买，1:购物车  |
|  11   | is_send |   int   | 10 |   0    |    Y     |  N   |       | 0:未发送，1:发送  |

**表名：** <a id="app_caterb2b_storm_rt_order">app_caterb2b_storm_rt_order</a>

**说明：** storm同步线上实时订单数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | customer_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  3   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  7   | status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  12   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |
|  13   | poi_id |   bigint   | 20 |   0    |    N     |  N   |       | 门店ID  |
|  14   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  15   | poi_address_id |   bigint   | 20 |   0    |    N     |  N   |       | 配送（地址）信息ID  |
|  16   | payment_type |   tinyint   | 4 |   0    |    N     |  N   |       | 支付类型：1-货到付款，2-在线支付  |
|  17   | order_type |   tinyint   | 4 |   0    |    N     |  N   |       | 订单类型:1-自下单，2-BD代下单，3-补货订单，4-换货订单  |

**表名：** <a id="app_caterb2b_storm_rt_order_detail">app_caterb2b_storm_rt_order_detail</a>

**说明：** storm同步线上订单详情数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单明细id  |
|  2   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  3   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  4   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  5   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  6   | csu_order_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  7   | csu_origin_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  8   | item_coupon_amount |   decimal   | 13 |   2    |    Y     |  N   |   0.00    | 优惠金额  |
|  9   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  10   | quantity |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  11   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |

**表名：** <a id="app_caterb2b_storm_rt_order_detail_his">app_caterb2b_storm_rt_order_detail_his</a>

**说明：** storm同步线上订单详情数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单明细id  |
|  2   | order_id |   int   | 10 |   0    |    Y     |  N   |       | 订单id  |
|  3   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | csuid  |
|  4   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | skuid  |
|  5   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名  |
|  6   | csu_order_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖价格优惠价  |
|  7   | csu_origin_price |   int   | 10 |   0    |    Y     |  N   |       | csu售卖原价  |
|  8   | item_coupon_amount |   decimal   | 13 |   2    |    Y     |  N   |   0.00    | 优惠金额  |
|  9   | csu_price_detail |   varchar   | 1024 |   0    |    Y     |  N   |       |   |
|  10   | quantity |   int   | 10 |   0    |    Y     |  N   |       | csu售卖数量  |
|  11   | type |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    |   |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |

**表名：** <a id="app_caterb2b_storm_rt_order_his">app_caterb2b_storm_rt_order_his</a>

**说明：** storm同步线上实时订单数据表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 订单id  |
|  2   | customer_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  3   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  4   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | bd_id  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  7   | status |   smallint   | 6 |   0    |    Y     |  N   |       | 订单状态  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  10   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  11   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  12   | order_no |   varchar   | 60 |   0    |    Y     |  N   |   0    | 订单号  |
|  13   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店ID  |
|  14   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 经销商id  |
|  15   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  16   | payment_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 支付类型：1-货到付款，2-在线支付  |
|  17   | order_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 订单类型:1-自下单，2-BD代下单，3-补货订单，4-换货订单  |

**表名：** <a id="app_caterb2b_task_schedule">app_caterb2b_task_schedule</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | task_name |   varchar   | 45 |   0    |    Y     |  N   |       | 任务名称  |
|  3   | sql1 |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 对比的第一个SQL  |
|  4   | sql2 |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 对比的第二个SQL  |
|  5   | params |   varchar   | 45 |   0    |    Y     |  N   |       | 多个参数，逗号分隔  |
|  6   | clns |   varchar   | 45 |   0    |    Y     |  N   |       | SQL1和SQL2比较的列名，多个逗号分隔  |
|  7   | crontab |   varchar   | 45 |   0    |    Y     |  N   |       | crontab表达式  |
|  8   | valid |   int   | 10 |   0    |    Y     |  N   |   0    | 0:无效，1:有效  |
|  9   | is_push |   int   | 10 |   0    |    Y     |  N   |   0    | 0:不发送大象消息(验证一致)，1:发送大象消息  |
|  10   | mis_id |   int   | 10 |   0    |    Y     |  N   |   0    | misId号  |
|  11   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  12   | utime |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="app_caterb2b_wh_delivery_order_cat2_stat">app_caterb2b_wh_delivery_order_cat2_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 订单时间  |
|  5   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级类目id  |
|  6   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  7   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级类目id  |
|  8   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  9   | order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  10   | address_cnt |   int   | 10 |   0    |    Y     |  N   |       | 点位数  |
|  11   | sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 件数  |
|  12   | volume |   decimal   | 11 |   4    |    Y     |  N   |       | 体积  |
|  13   | gross_weight |   decimal   | 11 |   4    |    Y     |  N   |       | 毛重  |
|  14   | net_weight |   decimal   | 11 |   4    |    Y     |  N   |       | 净重  |
|  15   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  16   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_wh_delivery_order_hour_stat">app_caterb2b_wh_delivery_order_hour_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 订单时间  |
|  5   | order_hour |   varchar   | 8 |   0    |    Y     |  N   |       | 下单时间小时  |
|  6   | order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  7   | address_cnt |   int   | 10 |   0    |    Y     |  N   |       | 点位数  |
|  8   | sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 件数  |
|  9   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  10   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_wh_delivery_order_stat">app_caterb2b_wh_delivery_order_stat</a>

**说明：** 仓配监控仓库维度订单汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 订单时间  |
|  5   | order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  6   | address_cnt |   int   | 10 |   0    |    Y     |  N   |       | 点位数  |
|  7   | sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 件数  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_wh_delivery_pr_wh_cm_stat">app_caterb2b_wh_delivery_pr_wh_cm_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | cooperation_mode |   smallint   | 6 |   0    |    Y     |  N   |       | 签到司机数  |
|  6   | total_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总线路  |
|  7   | driver_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送单量  |
|  8   | delivery_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送商家数  |
|  9   | delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 送达单量  |
|  10   | customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总的客户履约次数  |
|  11   | ontime_cnt |   int   | 10 |   0    |    Y     |  N   |       | 准时单量  |
|  12   | early_cnt |   int   | 10 |   0    |    Y     |  N   |       | 早到当量  |
|  13   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚到单量  |
|  14   | late_customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签收晚点的配送客户履约次数  |
|  15   | error_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  16   | error_customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签收异常的配送客户履约次数  |
|  17   | earlier_cnt |   int   | 10 |   0    |    Y     |  N   |       | 一般早到  |
|  18   | earliest_cnt |   int   | 10 |   0    |    Y     |  N   |       | 严重早到  |
|  19   | extreme_early_cnt |   int   | 10 |   0    |    Y     |  N   |       | 极端早到  |
|  20   | later_cnt |   int   | 10 |   0    |    Y     |  N   |       | 一般晚到  |
|  21   | latest_cnt |   int   | 10 |   0    |    Y     |  N   |       | 严重晚到  |
|  22   | extreme_late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 极端晚到  |
|  23   | not_accept_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未使用app接单  |
|  24   | not_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未签收  |
|  25   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 地址异常  |
|  26   | reject_cnt |   int   | 10 |   0    |    Y     |  N   |       | 全部拒收  |
|  27   | not_all_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 部分拒收  |
|  28   | logistics_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 物流签收  |
|  29   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  30   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_wh_delivery_pr_wh_stat">app_caterb2b_wh_delivery_pr_wh_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | total_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总线路  |
|  6   | sign_driver_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签到司机数  |
|  7   | driver_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送单量  |
|  8   | delivery_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送商家数  |
|  9   | delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 送达单量  |
|  10   | customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总的客户履约次数  |
|  11   | ontime_cnt |   int   | 10 |   0    |    Y     |  N   |       | 准时单量  |
|  12   | early_cnt |   int   | 10 |   0    |    Y     |  N   |       | 早到当量  |
|  13   | late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 晚到单量  |
|  14   | late_customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签收晚点的配送客户履约次数  |
|  15   | error_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  16   | error_customer_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签收异常的配送客户履约次数  |
|  17   | earlier_cnt |   int   | 10 |   0    |    Y     |  N   |       | 一般早到  |
|  18   | earliest_cnt |   int   | 10 |   0    |    Y     |  N   |       | 严重早到  |
|  19   | extreme_early_cnt |   int   | 10 |   0    |    Y     |  N   |       | 极端早到  |
|  20   | later_cnt |   int   | 10 |   0    |    Y     |  N   |       | 一般晚到  |
|  21   | latest_cnt |   int   | 10 |   0    |    Y     |  N   |       | 严重晚到  |
|  22   | extreme_late_cnt |   int   | 10 |   0    |    Y     |  N   |       | 极端晚到  |
|  23   | not_accept_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未使用app接单  |
|  24   | not_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未签收  |
|  25   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 地址异常  |
|  26   | reject_cnt |   int   | 10 |   0    |    Y     |  N   |       | 全部拒收  |
|  27   | not_all_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 部分拒收  |
|  28   | logistics_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 物流签收  |
|  29   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  30   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  31   | route_transfer_type |   int   | 10 |   0    |    Y     |  N   |   0    | 单据转移类型0正常1被调单2调单3被救援4救援  |
|  32   | ontime_depart_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 及时发车数  |
|  33   | not_ontime_depart_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未及时发车数  |
|  34   | face_sign_ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 面签单量  |
|  35   | not_face_sign_ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 非面签单量  |

**表名：** <a id="app_caterb2b_wh_delivery_take_inbound_type_src">app_caterb2b_wh_delivery_take_inbound_type_src</a>

**说明：** 提货入库监控仓库汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | appoint_date |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 提货单类型1：退货；2：包装物；3：换货  |
|  6   | take_source |   smallint   | 6 |   0    |    Y     |  N   |       | 签到司机数  |
|  7   | in_store_cnt |   int   | 10 |   0    |    Y     |  N   |       | 入库单量  |
|  8   | out_store_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未入库单量  |
|  9   | overtime_in_store_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未及时单量  |
|  10   | ontime_in_store_cnt |   int   | 10 |   0    |    Y     |  N   |       | 入库及时单量  |
|  11   | incomplete_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未完成单量  |
|  12   | complete_in_store_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成单量  |
|  13   | cancelled_cnt |   int   | 10 |   0    |    Y     |  N   |       | 取消单量  |
|  14   | gen_task_cnt |   int   | 10 |   0    |    Y     |  N   |       | 生成任务单  |
|  15   | receiving_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送完成率  |
|  16   | complete_receive_cnt |   int   | 10 |   0    |    Y     |  N   |       | 收货完成  |
|  17   | on_shelf_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上架中  |
|  18   | complete_shelf_cnt |   int   | 10 |   0    |    Y     |  N   |       | 上架完成  |
|  19   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  20   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="app_caterb2b_wh_delivery_take_res_wh_dsp_type_src">app_caterb2b_wh_delivery_take_res_wh_dsp_type_src</a>

**说明：** 仓配运营监控-提货监控-仓库-服务商维度汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | appoint_date |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 提货单类型1：退货；2：包装物；3：换货  |
|  6   | take_source |   smallint   | 6 |   0    |    Y     |  N   |       | 渠道来源1：客服；2：司机APP  |
|  7   | lade_total_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货单总量  |
|  8   | unlade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未提货  |
|  9   | overtime_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货不及时单量  |
|  10   | succ_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货及时成功单量  |
|  11   | ontime_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货及时单量  |
|  12   | abnormal_pos_cnt |   int   | 10 |   0    |    Y     |  N   |       | 位置异常单量  |
|  13   | generated_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已生成  |
|  14   | lined_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已排线  |
|  15   | departed_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已发车  |
|  16   | laded_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已提货  |
|  17   | fail_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货失败  |
|  18   | returned_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已返仓  |
|  19   | cancelled_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已取消  |
|  20   | driver_take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 司机领取方式0:默认未领取10:司机APP20:排线  |
|  21   | ontime_return_cnt |   int   | 10 |   0    |    Y     |  N   |       | 返仓及时量  |
|  22   | overtime_return_cnt |   int   | 10 |   0    |    Y     |  N   |       | 返仓不及时量  |
|  23   | driver_service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 司机所属服务商ID  |
|  24   | driver_service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属服务商名称  |
|  25   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  26   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_wh_delivery_take_res_wh_type_src">app_caterb2b_wh_delivery_take_res_wh_type_src</a>

**说明：** 仓配运营监控-提货监控-仓库维度汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | appoint_date |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 提货单类型1：退货；2：包装物；3：换货  |
|  6   | take_source |   smallint   | 6 |   0    |    Y     |  N   |       | 渠道来源1：客服；2：司机APP  |
|  7   | lade_total_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货单总量  |
|  8   | unlade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未提货  |
|  9   | overtime_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货不及时单量  |
|  10   | succ_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货及时成功单量  |
|  11   | ontime_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货及时单量  |
|  12   | abnormal_pos_cnt |   int   | 10 |   0    |    Y     |  N   |       | 位置异常单量  |
|  13   | generated_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已生成  |
|  14   | lined_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已排线  |
|  15   | departed_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已发车  |
|  16   | laded_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已提货  |
|  17   | fail_lade_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货失败  |
|  18   | returned_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已返仓  |
|  19   | cancelled_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已取消  |
|  20   | driver_take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 司机领取方式0:默认未领取10:司机APP20:排线  |
|  21   | ontime_return_cnt |   int   | 10 |   0    |    Y     |  N   |       | 返仓及时量  |
|  22   | overtime_return_cnt |   int   | 10 |   0    |    Y     |  N   |       | 返仓不及时量  |
|  23   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  24   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_wh_delivery_take_stat">app_caterb2b_wh_delivery_take_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属履约服务商名称  |
|  6   | driver_service_provider_id |   int   | 10 |   0    |    Y     |  N   |       | 司机所属服务商ID  |
|  7   | driver_id |   int   | 10 |   0    |    Y     |  N   |       | 司机id  |
|  8   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机姓名  |
|  9   | route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  10   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 排线名称  |
|  11   | total_delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总配送单  |
|  12   | total_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总商家数  |
|  13   | deliver_delivery_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 配送完成率  |
|  14   | deliver_delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达单量  |
|  15   | deliver_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达商家数  |
|  16   | total_take_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货单量  |
|  17   | total_take_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货商家数  |
|  18   | takeed_order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已提货单量  |
|  19   | takeed_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已提货商家数  |
|  20   | takeed_order_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 提货完成率  |
|  21   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 排线生成时间  |
|  22   | route_accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  23   | route_depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  24   | route_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 正向完成时间  |
|  25   | route_take_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 逆向完成时间  |
|  26   | route_final_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最终完成时间  |
|  27   | route_status |   smallint   | 6 |   0    |    Y     |  N   |       | 配送单状态  |
|  28   | route_is_status |   smallint   | 6 |   0    |    Y     |  N   |       |   |
|  29   | order_label |   smallint   | 6 |   0    |    Y     |  N   |       | 是否大宗订单  |
|  30   | total_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 件数  |
|  31   | volume_total |   decimal   | 11 |   4    |    Y     |  N   |       | 体积  |
|  32   | weight_total |   decimal   | 11 |   4    |    Y     |  N   |       | 重量  |
|  33   | load_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 满载率  |
|  34   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 异常签收量  |
|  35   | warn30_min_cnt |   int   | 10 |   0    |    Y     |  N   |       | 超时预警  |
|  36   | timeout_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已超时  |
|  37   | incomplete_ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未送达单量  |
|  38   | region_id |   int   | 10 |   0    |    Y     |  N   |   0    | 区域ID  |
|  39   | region_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  40   | supervisor |   varchar   | 255 |   0    |    Y     |  N   |       | 责任主管  |
|  41   | audit_committed |   int   | 10 |   0    |    Y     |  N   |   0    | 是否审核1：是0：否  |
|  42   | route_status_new |   int   | 10 |   0    |    Y     |  N   |   0    | 排线状态。0：无意义老数据，10：初始态，20：已审核30：已绑定40：已下发50：已接线60：已核货70：已发车80：已完成  |
|  43   | delivery_bill_status |   int   | 10 |   0    |    Y     |  N   |   1    | 配送单状态1已生成2已发车3已送达  |
|  44   | sign_in_state |   int   | 10 |   0    |    Y     |  N   |   -1    | 报名状态，如：-1未知0未签到1已签到  |

**表名：** <a id="app_caterb2b_wh_delivery_take_wh_stat">app_caterb2b_wh_delivery_take_wh_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总单量  |
|  6   | driver_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 签到司机数  |
|  7   | route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总线路数  |
|  8   | driver_accept_cnt |   int   | 10 |   0    |    Y     |  N   |       | 接单司机数  |
|  9   | not_accept_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 待接线路数  |
|  10   | incomplete_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未完成线路数  |
|  11   | order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送单量  |
|  12   | order_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送商家数  |
|  13   | complete_order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达单量  |
|  14   | complete_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达商家数  |
|  15   | complete_order_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 配送完成率  |
|  16   | take_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货单量  |
|  17   | take_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 提货商家数  |
|  18   | complete_take_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已提货单量  |
|  19   | complete_take_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | complete_take_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 提货完成率  |
|  21   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 异常签收量  |
|  22   | warn30_min_cnt |   int   | 10 |   0    |    Y     |  N   |       | 超时预警  |
|  23   | timeout_incomplete_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已超时量  |
|  24   | not_appoint_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未指派线路数  |
|  25   | not_sign_driver_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未签到司机数  |
|  26   | not_check_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未核货线路数  |
|  27   | not_depart_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未发车线路数  |
|  28   | incomplete_positive_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未完成线路数（正向）  |

**表名：** <a id="app_caterb2b_wh_delivery_take_wh_times_stat">app_caterb2b_wh_delivery_take_wh_times_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | delivery_times |   varchar   | 32 |   0    |    Y     |  N   |       | 配送时段  |
|  6   | bill_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总单量  |
|  7   | route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总线路数  |
|  8   | driver_accept_cnt |   int   | 10 |   0    |    Y     |  N   |       | 接单司机数  |
|  9   | not_accept_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 待接线路数  |
|  10   | incomplete_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 未完成线路数  |
|  11   | order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送单量  |
|  12   | order_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 配送商家数  |
|  13   | complete_order_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达单量  |
|  14   | complete_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达商家数  |
|  15   | complete_order_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 配送完成率  |
|  16   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 异常签收量  |
|  17   | warn30_min_cnt |   int   | 10 |   0    |    Y     |  N   |       | 超时预警  |
|  18   | timeout_incomplete_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已超时量  |
|  19   | not_appoint_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未指派线路数  |
|  20   | not_check_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未核货线路数  |
|  21   | not_depart_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未发车线路数  |
|  22   | incomplete_positive_route_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未完成线路数（正向）  |

**表名：** <a id="app_caterb2b_wh_delivery_times_stat">app_caterb2b_wh_delivery_times_stat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | delivery_times |   varchar   | 16 |   0    |    Y     |  N   |       |   |
|  5   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  6   | service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属履约服务商名称  |
|  7   | driver_service_provider_id |   int   | 10 |   0    |    Y     |  N   |       | 司机所属服务商ID  |
|  8   | driver_id |   int   | 10 |   0    |    Y     |  N   |       | 司机id  |
|  9   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机姓名  |
|  10   | route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  11   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 排线名称  |
|  12   | total_delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总配送单  |
|  13   | total_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 总商家数  |
|  14   | deliver_delivery_rate |   decimal   | 11 |   4    |    Y     |  N   |       | 配送完成率  |
|  15   | deliver_delivery_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达单量  |
|  16   | deliver_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已送达商家数  |
|  17   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 排线生成时间  |
|  18   | route_accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  19   | route_depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  20   | route_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 正向完成时间  |
|  21   | route_final_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最终完成时间  |
|  22   | route_status |   smallint   | 6 |   0    |    Y     |  N   |       | 配送单状态  |
|  23   | route_is_status |   smallint   | 6 |   0    |    Y     |  N   |       |   |
|  24   | order_label |   smallint   | 6 |   0    |    Y     |  N   |       | 是否大宗订单  |
|  25   | total_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 件数  |
|  26   | volume_total |   decimal   | 11 |   4    |    Y     |  N   |       | 体积  |
|  27   | weight_total |   decimal   | 11 |   4    |    Y     |  N   |       | 重量  |
|  28   | abnormal_sign_cnt |   int   | 10 |   0    |    Y     |  N   |       | 异常签收量  |
|  29   | warn30_min_cnt |   int   | 10 |   0    |    Y     |  N   |       | 超时预警  |
|  30   | timeout_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已超时  |
|  31   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  32   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  33   | incomplete_ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 未送达单量  |
|  34   | region_id |   int   | 10 |   0    |    Y     |  N   |   0    | 区域ID  |
|  35   | region_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  36   | supervisor |   varchar   | 255 |   0    |    Y     |  N   |       | 责任主管  |
|  37   | audit_committed |   int   | 10 |   0    |    Y     |  N   |   0    | 是否审核1：是0：否  |
|  38   | route_status_new |   int   | 10 |   0    |    Y     |  N   |   0    | 排线状态。0：无意义老数据，10：初始态，20：已审核30：已绑定40：已下发50：已接线60：已核货70：已发车80：已完成  |
|  39   | delivery_bill_status |   int   | 10 |   0    |    Y     |  N   |   1    | 配送单状态1已生成2已发车3已送达  |
|  40   | sign_in_state |   int   | 10 |   0    |    Y     |  N   |   -1    | 报名状态，如：-1未知0未签到1已签到  |
|  41   | avg_delivery_time |   double   | 23 |   0    |    Y     |  N   |       | 单仓商户平均配送时长  |

**表名：** <a id="app_caterb2b_wh_outbound_statistics">app_caterb2b_wh_outbound_statistics</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | appoint_time |   datetime   | 19 |   0    |    N     |  Y   |       |   |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  3   | total_route_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | total_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | total_wrap_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | total_order_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | have_route_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | have_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | have_order_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | no_route_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | no_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | no_order_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  13   | depart_route_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  14   | depart_order_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  15   | depart_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  16   | deliver_route_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | deliver_order_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | deliver_customer_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  19   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  20   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_wh_pre_shortage_cat">app_caterb2b_wh_pre_shortage_cat</a>

**说明：** 仓配主题-预售缺货-仓库汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 点位数据  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | appoint_date |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | shortage_qty |   int   | 10 |   0    |    Y     |  N   |       | 缺货数量  |
|  6   | shortage_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 缺货sku数  |
|  7   | pre_cat |   int   | 10 |   0    |    Y     |  N   |       | 预售分类  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="app_caterb2b_wh_stock_check_task_ship_area_wh_stat">app_caterb2b_wh_stock_check_task_ship_area_wh_stat</a>

**说明：** 仓储主题-复核-发货区

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区编码  |
|  6   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  7   | total_qty |   int   | 10 |   0    |    Y     |  N   |       | 总件数  |
|  8   | checked_qty_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成件数  |
|  9   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_check_task_wh_stat">app_caterb2b_wh_stock_check_task_wh_stat</a>

**说明：** 仓储主题-核货-核货仓库汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | checkable_task_cnt |   int   | 10 |   0    |    Y     |  N   |       | 待核货任务  |
|  6   | checkable_qty |   int   | 10 |   0    |    Y     |  N   |       | 待核货数量  |
|  7   | checking_task_cnt |   int   | 10 |   0    |    Y     |  N   |       | 核货中任务  |
|  8   | checking_qty |   int   | 10 |   0    |    Y     |  N   |       | 核货中数量  |
|  9   | checked_task_cnt |   int   | 10 |   0    |    Y     |  N   |       | 核货完成任务  |
|  10   | checked_qty |   int   | 10 |   0    |    Y     |  N   |       | 核货完成数量  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_pre_cat_cross_wh_stat">app_caterb2b_wh_stock_pre_cat_cross_wh_stat</a>

**说明：** 仓储主题-投线任务-预售分类拣货汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | channel_id |   int   | 10 |   0    |    N     |  Y   |       | 渠道id  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  3   | appoint_time |   datetime   | 19 |   0    |    N     |  Y   |   1970-01-0100:00:00    | 履约时间  |
|  4   | cat |   int   | 10 |   0    |    N     |  Y   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  5   | total_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总件数  |
|  6   | done_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 已完成件数  |
|  7   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 订单件数  |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_pre_cat_pick_cross_wh_stat">app_caterb2b_wh_stock_pre_cat_pick_cross_wh_stat</a>

**说明：** 仓储主题-拣货投线任务-预售分类汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 履约时间  |
|  5   | task_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 任务类型:1拣货，2投线  |
|  6   | cat |   smallint   | 6 |   0    |    N     |  N   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  7   | total_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总件数  |
|  8   | done_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 已完成件数  |
|  9   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 订单件数  |
|  10   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  11   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_route_check_ship_area_wh_stat">app_caterb2b_wh_stock_route_check_ship_area_wh_stat</a>

**说明：** 仓储主题-复核-发货区

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区编码  |
|  6   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  7   | total_qty |   int   | 10 |   0    |    Y     |  N   |       | 总件数  |
|  8   | checked_qty_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成件数  |
|  9   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_route_check_task_ship_area_wh_stat">app_caterb2b_wh_stock_route_check_task_ship_area_wh_stat</a>

**说明：** 仓储主题-复核核货-发货区

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | task_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 任务类型:3复核，4核货  |
|  6   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区编码  |
|  7   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  8   | total_qty |   int   | 10 |   0    |    Y     |  N   |       | 总件数  |
|  9   | checked_qty_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成件数  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  11   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_route_check_wh_stat">app_caterb2b_wh_stock_route_check_wh_stat</a>

**说明：** 仓储主题-核货-核货仓库汇总

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | checkable_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 待核货线路  |
|  6   | checkable_qty |   int   | 10 |   0    |    Y     |  N   |       | 待核货数量  |
|  7   | checking_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 核货中线路  |
|  8   | checking_qty |   int   | 10 |   0    |    Y     |  N   |       | 核货中数量  |
|  9   | checked_route_cnt |   int   | 10 |   0    |    Y     |  N   |       | 核货完成线路  |
|  10   | checked_qty |   int   | 10 |   0    |    Y     |  N   |       | 核货完成数量  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_caterb2b_wh_stock_task_ship_area_wh_stat">app_caterb2b_wh_stock_task_ship_area_wh_stat</a>

**说明：** 仓储主题-复核核货-发货区

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  5   | task_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 任务类型:3复核，4核货  |
|  6   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区编码  |
|  7   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  8   | total_qty |   int   | 10 |   0    |    Y     |  N   |       | 总件数  |
|  9   | checked_qty_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已完成件数  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  11   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="app_customer_group_cat_tag_day">app_customer_group_cat_tag_day</a>

**说明：** 品类新客表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户ID  |
|  3   | cat_level |   int   | 10 |   0    |    Y     |  N   |       | 类目层级  |
|  4   | cat_id |   bigint   | 20 |   0    |    Y     |  N   |       | 类目ID  |
|  5   | first_arranged_ord_time |   varchar   | 64 |   0    |    Y     |  N   |       | 首单时间  |

**表名：** <a id="app_mobile_dashboard_rt_bu_city_area_sale">app_mobile_dashboard_rt_bu_city_area_sale</a>

**说明：** 快驴-城市大盘移动版数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部ID  |
|  2   | city_id |   int   | 10 |   0    |    N     |  Y   |       | 城市ID  |
|  3   | area_id |   int   | 10 |   0    |    N     |  Y   |       | 区ID  |
|  4   | date_scale |   datetime   | 19 |   0    |    N     |  Y   |       | 时间  |
|  5   | time_tag |   int   | 10 |   0    |    N     |  Y   |       | 时间维度标记:1.全量,2.增量  |
|  6   | hour_time |   varchar   | 12 |   0    |    N     |  Y   |       |   |
|  7   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（元）  |
|  8   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额（元）  |
|  9   | byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  10   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数  |
|  11   | catering_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮新客数  |
|  12   | flow_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 流通新客数  |
|  13   | acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 日合作客户数之和  |
|  14   | catering_acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮日合作客户数之和  |
|  15   | catering_pay_amt_poultry |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-肉禽（元）  |
|  16   | catering_pay_amt_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-鲜肉（元）  |
|  17   | catering_pay_amt_frozen_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冻肉（元）  |
|  18   | catering_pay_amt_frozen_semi |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冷冻半成品（元）  |
|  19   | catering_pay_amt_veg_fruit |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-蔬菜水果（元）  |
|  20   | catering_byrs_cnt_poultry |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-肉禽  |
|  21   | catering_byrs_cnt_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-鲜肉  |
|  22   | catering_byrs_cnt_frozen_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-冻肉  |
|  23   | catering_byrs_cnt_veg_fruit |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-蔬菜水果  |
|  24   | sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（补贴前）  |
|  25   | new_sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客销售额（补贴前）  |
|  26   | coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 补贴金额  |
|  27   | new_cpn_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客补贴金额  |
|  28   | origin_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 原价销售额  |
|  29   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  30   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  31   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名称  |
|  32   | area_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  33   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  34   | catering_new_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮新客销售额（元）  |
|  35   | catering_byrs_cnt_frozen_semi |   int   | 10 |   0    |    Y     |  N   |       | 餐饮冷冻半成品客户数  |
|  36   | catering_pay_amt_water_frozen |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮水产销售额（元）  |
|  37   | catering_byrs_cnt_water_frozen |   int   | 10 |   0    |    Y     |  N   |       | 餐饮水产客户数  |
|  38   | catering_pay_amt_grain_oil |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮米面粮油销售额（元）  |
|  39   | catering_byrs_cnt_grain_oil |   int   | 10 |   0    |    Y     |  N   |       | 餐饮米面粮油客户数  |
|  40   | catering_pay_amt_drinking |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮酒饮销售额（元）  |
|  41   | catering_byrs_cnt_drinking |   int   | 10 |   0    |    Y     |  N   |       | 餐饮酒饮客户数  |
|  42   | catering_pay_amt_egg_milk |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮蛋奶销售额（元）  |
|  43   | catering_byrs_cnt_egg_milk |   int   | 10 |   0    |    Y     |  N   |       | 餐饮蛋奶客户数  |
|  44   | catering_pay_amt_other |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮其他销售额（元）  |
|  45   | catering_byrs_cnt_other |   int   | 10 |   0    |    Y     |  N   |       | 餐饮其他客户数  |
|  46   | divide_amount |   decimal   | 17 |   6    |    Y     |  N   |       | 赠品金额  |

**表名：** <a id="app_mobile_dashboard_rt_region_bu_city_area_sale">app_mobile_dashboard_rt_region_bu_city_area_sale</a>

**说明：** 快驴-城市大盘移动版数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | region_id |   int   | 10 |   0    |    N     |  Y   |       | 大区ID  |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部ID  |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       | 城市ID  |
|  4   | area_id |   int   | 10 |   0    |    N     |  Y   |       | 区ID  |
|  5   | date_scale |   datetime   | 19 |   0    |    N     |  Y   |       | 时间  |
|  6   | time_tag |   int   | 10 |   0    |    N     |  Y   |       | 时间维度标记:1.全量,2.增量  |
|  7   | hour_time |   varchar   | 12 |   0    |    N     |  Y   |       |   |
|  8   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（元）  |
|  9   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额（元）  |
|  10   | byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  11   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数  |
|  12   | catering_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮新客数  |
|  13   | flow_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 流通新客数  |
|  14   | acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 日合作客户数之和  |
|  15   | catering_acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮日合作客户数之和  |
|  16   | catering_pay_amt_poultry |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-肉禽（元）  |
|  17   | catering_pay_amt_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-鲜肉（元）  |
|  18   | catering_pay_amt_frozen_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冻肉（元）  |
|  19   | catering_pay_amt_frozen_semi |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冷冻半成品（元）  |
|  20   | catering_pay_amt_veg_fruit |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-蔬菜水果（元）  |
|  21   | catering_byrs_cnt_poultry |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-肉禽  |
|  22   | catering_byrs_cnt_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-鲜肉  |
|  23   | catering_byrs_cnt_frozen_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-冻肉  |
|  24   | catering_byrs_cnt_veg_fruit |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-蔬菜水果  |
|  25   | sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（补贴前）  |
|  26   | new_sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客销售额（补贴前）  |
|  27   | coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 补贴金额  |
|  28   | new_cpn_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客补贴金额  |
|  29   | origin_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 原价销售额  |
|  30   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  31   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  32   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名称  |
|  33   | area_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  34   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  35   | catering_new_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮新客销售额（元）  |
|  36   | catering_byrs_cnt_frozen_semi |   int   | 10 |   0    |    Y     |  N   |       | 餐饮冷冻半成品客户数  |
|  37   | catering_pay_amt_water_frozen |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮水产销售额（元）  |
|  38   | catering_byrs_cnt_water_frozen |   int   | 10 |   0    |    Y     |  N   |       | 餐饮水产客户数  |
|  39   | catering_pay_amt_grain_oil |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮米面粮油销售额（元）  |
|  40   | catering_byrs_cnt_grain_oil |   int   | 10 |   0    |    Y     |  N   |       | 餐饮米面粮油客户数  |
|  41   | catering_pay_amt_drinking |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮酒饮销售额（元）  |
|  42   | catering_byrs_cnt_drinking |   int   | 10 |   0    |    Y     |  N   |       | 餐饮酒饮客户数  |
|  43   | catering_pay_amt_egg_milk |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮蛋奶销售额（元）  |
|  44   | catering_byrs_cnt_egg_milk |   int   | 10 |   0    |    Y     |  N   |       | 餐饮蛋奶客户数  |
|  45   | catering_pay_amt_other |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮其他销售额（元）  |
|  46   | catering_byrs_cnt_other |   int   | 10 |   0    |    Y     |  N   |       | 餐饮其他客户数  |
|  47   | divide_amount |   decimal   | 17 |   6    |    Y     |  N   |       | 赠品金额  |

**表名：** <a id="app_mobile_dashboard_rt_sale">app_mobile_dashboard_rt_sale</a>

**说明：** 快驴-星辰移动仪表盘数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | region_id |   int   | 10 |   0    |    N     |  Y   |       | 大区ID  |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部ID  |
|  3   | city_id |   int   | 10 |   0    |    N     |  Y   |       | 城市ID  |
|  4   | area_id |   int   | 10 |   0    |    N     |  Y   |       | 区ID  |
|  5   | date_scale |   datetime   | 19 |   0    |    N     |  Y   |       | 时间  |
|  6   | time_tag |   int   | 10 |   0    |    N     |  Y   |       | 时间维度标记:1.全量,2.增量  |
|  7   | hour_time |   varchar   | 12 |   0    |    N     |  Y   |       |   |
|  8   | cust_tag |   tinyint   | 4 |   0    |    N     |  Y   |   0    | 客户标签0:全部1:中B2:小B  |
|  9   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（元）  |
|  10   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额（元）  |
|  11   | byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  12   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数  |
|  13   | catering_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮新客数  |
|  14   | flow_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 流通新客数  |
|  15   | acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 日合作客户数之和  |
|  16   | catering_acc_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 餐饮日合作客户数之和  |
|  17   | catering_pay_amt_poultry |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-肉禽（元）  |
|  18   | catering_pay_amt_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-鲜肉（元）  |
|  19   | catering_pay_amt_frozen_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冻肉（元）  |
|  20   | catering_pay_amt_frozen_semi |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冷冻半成品（元）  |
|  21   | catering_pay_amt_veg_fruit |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-蔬菜水果（元）  |
|  22   | catering_byrs_cnt_poultry |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-肉禽  |
|  23   | catering_byrs_cnt_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-鲜肉  |
|  24   | catering_byrs_cnt_frozen_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-冻肉  |
|  25   | catering_byrs_cnt_veg_fruit |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-蔬菜水果  |
|  26   | sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（补贴前）  |
|  27   | new_sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客销售额（补贴前）  |
|  28   | coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 补贴金额  |
|  29   | new_cpn_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 新客补贴金额  |
|  30   | origin_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 原价销售额  |
|  31   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  32   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  33   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名称  |
|  34   | area_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  35   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  36   | catering_new_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮新客销售额（元）  |
|  37   | catering_byrs_cnt_frozen_semi |   int   | 10 |   0    |    Y     |  N   |       | 餐饮冷冻半成品客户数  |
|  38   | catering_pay_amt_water_frozen |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮水产销售额（元）  |
|  39   | catering_byrs_cnt_water_frozen |   int   | 10 |   0    |    Y     |  N   |       | 餐饮水产客户数  |
|  40   | catering_pay_amt_grain_oil |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮米面粮油销售额（元）  |
|  41   | catering_byrs_cnt_grain_oil |   int   | 10 |   0    |    Y     |  N   |       | 餐饮米面粮油客户数  |
|  42   | catering_pay_amt_drinking |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮酒饮销售额（元）  |
|  43   | catering_byrs_cnt_drinking |   int   | 10 |   0    |    Y     |  N   |       | 餐饮酒饮客户数  |
|  44   | catering_pay_amt_egg_milk |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮蛋奶销售额（元）  |
|  45   | catering_byrs_cnt_egg_milk |   int   | 10 |   0    |    Y     |  N   |       | 餐饮蛋奶客户数  |
|  46   | catering_pay_amt_other |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮其他销售额（元）  |
|  47   | catering_byrs_cnt_other |   int   | 10 |   0    |    Y     |  N   |       | 餐饮其他客户数  |
|  48   | divide_amount |   decimal   | 17 |   6    |    Y     |  N   |       | 赠品金额  |
|  49   | catering_sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额（补贴前）  |
|  50   | catering_new_sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮新客销售额（补贴前）  |
|  51   | catering_coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮补贴金额  |
|  52   | catering_new_cpn_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮新客补贴金额  |

**表名：** <a id="app_mobile_dashboard_rt_sale_3p">app_mobile_dashboard_rt_sale_3p</a>

**说明：** 快驴-星辰移动仪表盘数据3P

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | region_id |   int   | 10 |   0    |    N     |  N   |       | 大区ID  |
|  3   | bu_id |   int   | 10 |   0    |    N     |  N   |       | 事业部ID  |
|  4   | city_id |   int   | 10 |   0    |    N     |  N   |       | 城市ID  |
|  5   | area_id |   int   | 10 |   0    |    N     |  N   |       | 区ID  |
|  6   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  7   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名称  |
|  8   | area_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  9   | date_scale |   datetime   | 19 |   0    |    N     |  N   |       | 时间  |
|  10   | time_tag |   int   | 10 |   0    |    N     |  N   |       | 时间维度标记:1.全量,2.增量  |
|  11   | hour_time |   varchar   | 12 |   0    |    N     |  N   |       |   |
|  12   | manage_type |   tinyint   | 4 |   0    |    N     |  N   |   0    | 商业模式0:全部1:自营2:3P  |
|  13   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（元）  |
|  14   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  15   | catering_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  16   | catering_pay_amt_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-鲜肉（元）  |
|  17   | catering_pay_amt_frozen_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冻肉（元）  |
|  18   | catering_byrs_cnt_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-鲜肉  |
|  19   | catering_byrs_cnt_frozen_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-冻肉  |
|  20   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  21   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_mobile_dashboard_rt_sale_with_3p">app_mobile_dashboard_rt_sale_with_3p</a>

**说明：** 快驴-星辰移动仪表盘数据3P

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | region_id |   int   | 10 |   0    |    N     |  N   |       | 大区ID  |
|  3   | bu_id |   int   | 10 |   0    |    N     |  N   |       | 事业部ID  |
|  4   | city_id |   int   | 10 |   0    |    N     |  N   |       | 城市ID  |
|  5   | area_id |   int   | 10 |   0    |    N     |  N   |       | 区ID  |
|  6   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  7   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名称  |
|  8   | area_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  9   | date_scale |   datetime   | 19 |   0    |    N     |  N   |       | 时间  |
|  10   | time_tag |   int   | 10 |   0    |    N     |  N   |       | 时间维度标记:1.全量,2.增量  |
|  11   | hour_time |   varchar   | 12 |   0    |    N     |  N   |       |   |
|  12   | manage_type |   tinyint   | 4 |   0    |    N     |  N   |   0    | 商业模式0:全部1:自营2:3P  |
|  13   | catering_pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（元）  |
|  14   | catering_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  15   | catering_new_byrs_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  16   | catering_pay_amt_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-鲜肉（元）  |
|  17   | catering_pay_amt_frozen_meat |   decimal   | 17 |   6    |    Y     |  N   |       | 餐饮销售额-冻肉（元）  |
|  18   | catering_byrs_cnt_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-鲜肉  |
|  19   | catering_byrs_cnt_frozen_meat |   int   | 10 |   0    |    Y     |  N   |       | 餐饮合作客户数-冻肉  |
|  20   | origin_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 原价销售额  |
|  21   | sales_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额（补贴前）  |
|  22   | divide_amount |   decimal   | 17 |   6    |    Y     |  N   |       | 赠品金额  |
|  23   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  24   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_perf_crane_cat_sale_data_day">app_perf_crane_cat_sale_data_day</a>

**说明：** 实时品类维度销售数据统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | dt |   varchar   | 12 |   0    |    Y     |  N   |       | 日期  |
|  3   | cat1_id |   int   | 10 |   0    |    Y     |  N   |   -1    | 品类id全部品类为-1  |
|  4   | cat1_name |   varchar   | 60 |   0    |    Y     |  N   |       | 品类名称  |
|  5   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额  |
|  6   | pay_amt_self |   decimal   | 17 |   6    |    Y     |  N   |       | 自营销售额  |
|  7   | pay_amt_3p |   decimal   | 17 |   6    |    Y     |  N   |       | 3P销售额  |
|  8   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 客户数  |
|  9   | byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 自营客户数  |
|  10   | byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 3P客户数  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  13   | new_byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数  |
|  14   | new_byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 3P新客数  |
|  15   | new_byr_cnt_absolute |   int   | 10 |   0    |    Y     |  N   |       | 3P纯新客  |
|  16   | new_byr_cnt_from_self |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3P客户数  |
|  17   | new_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新增sku数  |
|  18   | new_sku_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 新增自营sku数据  |
|  19   | new_sku_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 新增3Psku数据  |
|  20   | coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 补贴金额  |
|  21   | coupon_amt_self |   decimal   | 17 |   6    |    Y     |  N   |       | 自营补贴金额  |
|  22   | coupon_amt_3p |   decimal   | 17 |   6    |    Y     |  N   |       | 3P补贴金额  |

**表名：** <a id="app_perf_crane_nrt_bd_perf_detail_3p">app_perf_crane_nrt_bd_perf_detail_3p</a>

**说明：** BD人效详情准实时表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | dt |   varchar   | 32 |   0    |    N     |  N   |       | 生成日期,YYYYMMDD  |
|  3   | bd_id |   int   | 10 |   0    |    N     |  N   |   0    | BD的id  |
|  4   | bd_info_id |   int   | 10 |   0    |    N     |  N   |   0    | bdInfoId  |
|  5   | bd_mis_id |   varchar   | 64 |   0    |    N     |  N   |       | BD的MisID  |
|  6   | bd_name |   varchar   | 64 |   0    |    N     |  N   |       | BD的姓名  |
|  7   | pos_code |   varchar   | 32 |   0    |    N     |  N   |       | 岗位编码  |
|  8   | pos_name |   varchar   | 64 |   0    |    N     |  N   |       | 岗位名称  |
|  9   | bus_type |   int   | 10 |   0    |    N     |  N   |   0    | 商户类型0:全部1:餐饮2:流通  |
|  10   | pym_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 销售额  |
|  11   | pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P销售额  |
|  12   | pym_amt_self |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 自营销售额  |
|  13   | byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 合作商户数  |
|  14   | byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P合作商户数  |
|  15   | byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营合作商户数  |
|  16   | new_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 新客数  |
|  17   | new_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P新客数  |
|  18   | new_byr_cnt_from_self |   int   | 10 |   0    |    N     |  N   |   0    | 存量首次转3p新客  |
|  19   | new_byr_cnt_absolute |   int   | 10 |   0    |    N     |  N   |   0    | 自营新客数  |
|  20   | new_byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营新客数  |
|  21   | meat_pym_amt_self |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 自营肉禽销售额  |
|  22   | meat_byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营肉禽合作客户数  |
|  23   | fresh_vegetable_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P蔬菜合作客户数  |
|  24   | frozen_meat_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P冻肉合作客户数  |
|  25   | fresh_vegetable_pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P蔬菜销售额  |
|  26   | frozen_meat_pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P冻肉销售额  |
|  27   | city_id |   int   | 10 |   0    |    N     |  N   |   0    | 城市ID  |
|  28   | city_name |   varchar   | 64 |   0    |    N     |  N   |       | 城市名称  |
|  29   | org_id |   int   | 10 |   0    |    N     |  N   |   0    | 小组id  |
|  30   | org_name |   varchar   | 64 |   0    |    N     |  N   |       | 小组name  |
|  31   | org_bdm_name |   varchar   | 64 |   0    |    N     |  N   |       | 小组bdm名称  |
|  32   | modified_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  33   | stat_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 统计时间  |
|  34   | area_id |   int   | 10 |   0    |    N     |  N   |   0    | 分区ID  |
|  35   | area_name |   varchar   | 128 |   0    |    N     |  N   |       | 分区名字  |
|  36   | cus_type |   int   | 10 |   0    |    N     |  N   |   0    | 用户类型0：中B，1：小B  |
|  37   | byr_cnt_not_3p |   int   | 10 |   0    |    Y     |  N   |   0    | 非3P客户数  |
|  38   | new_byr_cnt_not_3p |   int   | 10 |   0    |    Y     |  N   |   0    | 3P新客数  |
|  39   | receipt_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  40   | vegetable_fruit_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 蔬菜水果销售额  |
|  41   | fresh_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 鲜肉销售额  |
|  42   | frozen_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 冻肉销售额  |
|  43   | meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 肉禽销售额  |
|  44   | vegetable_fruit_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果合作客户数  |
|  45   | fresh_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉合作客户数  |
|  46   | frozen_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 冻肉合作客户数  |
|  47   | meat_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 肉禽合作商户数  |

**表名：** <a id="app_perf_crane_nrt_bd_perf_detail_3p_history">app_perf_crane_nrt_bd_perf_detail_3p_history</a>

**说明：** BD人效详情历史记录表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | time_string |   varchar   | 32 |   0    |    N     |  N   |       | 生成日期,YYYYMMDDHHMM  |
|  3   | bd_id |   int   | 10 |   0    |    N     |  N   |   0    | BD的id  |
|  4   | bd_info_id |   int   | 10 |   0    |    N     |  N   |   0    | bdInfoId  |
|  5   | pym_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 销售额  |
|  6   | pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P销售额  |
|  7   | pym_amt_self |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 自营销售额  |
|  8   | byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 合作商户数  |
|  9   | byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P合作商户数  |
|  10   | byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营合作商户数  |
|  11   | new_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 新客数  |
|  12   | new_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P新客数  |
|  13   | new_byr_cnt_from_self |   int   | 10 |   0    |    N     |  N   |   0    | 存量首次转3p新客  |
|  14   | new_byr_cnt_absolute |   int   | 10 |   0    |    N     |  N   |   0    | 自营新客数  |
|  15   | new_byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营新客数  |
|  16   | meat_pym_amt_self |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 自营肉禽销售额  |
|  17   | meat_byr_cnt_self |   int   | 10 |   0    |    N     |  N   |   0    | 自营肉禽合作客户数  |
|  18   | fresh_vegetable_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P蔬菜合作客户数  |
|  19   | frozen_meat_byr_cnt_3p |   int   | 10 |   0    |    N     |  N   |   0    | 3P冻肉合作客户数  |
|  20   | fresh_vegetable_pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P蔬菜销售额  |
|  21   | frozen_meat_pym_amt_3p |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 3P冻肉销售额  |
|  22   | city_id |   int   | 10 |   0    |    N     |  N   |   0    | 城市ID  |
|  23   | org_id |   int   | 10 |   0    |    N     |  N   |   0    | 小组id  |
|  24   | area_id |   int   | 10 |   0    |    N     |  N   |   0    | 分区ID  |
|  25   | receipt_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  26   | cus_type |   int   | 10 |   0    |    N     |  N   |   0    | 用户类型0：中B，1：小B  |
|  27   | byr_cnt_not_3p |   int   | 10 |   0    |    Y     |  N   |   0    | 非3P客户数  |
|  28   | new_byr_cnt_not_3p |   int   | 10 |   0    |    Y     |  N   |   0    | 3P新客数  |
|  29   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | BD的姓名  |
|  30   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  31   | org_bdm_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组bdm名称  |
|  32   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |
|  33   | vegetable_fruit_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 蔬菜水果销售额  |
|  34   | fresh_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 鲜肉销售额  |
|  35   | frozen_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 冻肉销售额  |
|  36   | meat_pym_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 肉禽销售额  |
|  37   | vegetable_fruit_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果合作客户数  |
|  38   | fresh_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉合作客户数  |
|  39   | frozen_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 冻肉合作客户数  |
|  40   | meat_byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 肉禽合作商户数  |
|  41   | tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类客户数  |
|  42   | tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类客户数  |
|  43   | tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类客户数  |
|  44   | tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类客户数  |

**表名：** <a id="app_perf_xt_off_cat_sale_data_day">app_perf_xt_off_cat_sale_data_day</a>

**说明：** 离线全国品类维度销售数据统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | dt |   varchar   | 12 |   0    |    Y     |  N   |       | 日期  |
|  3   | cat1_id |   int   | 10 |   0    |    Y     |  N   |   -1    | 品类id全部品类为-1  |
|  4   | cat1_name |   varchar   | 60 |   0    |    Y     |  N   |       | 品类名称  |
|  5   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额  |
|  6   | pay_amt_self |   decimal   | 17 |   6    |    Y     |  N   |       | 自营销售额  |
|  7   | pay_amt_3p |   decimal   | 17 |   6    |    Y     |  N   |       | 3P销售额  |
|  8   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 客户数  |
|  9   | byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 自营客户数  |
|  10   | byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 3P客户数  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | new_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  13   | new_byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数  |
|  14   | new_byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 3P新客数  |
|  15   | new_byr_cnt_absolute |   int   | 10 |   0    |    Y     |  N   |       | 3P纯新客  |
|  16   | new_byr_cnt_from_self |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3P客户数  |
|  17   | new_sku_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新增sku数  |
|  18   | new_sku_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 新增自营sku数据  |
|  19   | new_sku_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 新增3Psku数据  |
|  20   | coupon_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 补贴金额  |
|  21   | coupon_amt_self |   decimal   | 17 |   6    |    Y     |  N   |       | 自营补贴金额  |
|  22   | coupon_amt_3p |   decimal   | 17 |   6    |    Y     |  N   |       | 3P补贴金额  |

**表名：** <a id="app_poultry_attack_customer_pre_reactive">app_poultry_attack_customer_pre_reactive</a>

**说明：** 快驴事业部--肉禽攻坚战-预复活客户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | last_arranged_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 商家最后一次成交单的下单时间  |

**表名：** <a id="app_rt_bu_cat_sale_data">app_rt_bu_cat_sale_data</a>

**说明：** 实时事业部维度品类销售数据统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID,为0代表全国  |
|  3   | bu_name |   varchar   | 60 |   0    |    Y     |  N   |       | 事业部名称  |
|  4   | cat_id |   int   | 10 |   0    |    Y     |  N   |   0    | 品类id  |
|  5   | cat_name |   varchar   | 60 |   0    |    Y     |  N   |       | 品类名称  |
|  6   | dt |   varchar   | 12 |   0    |    Y     |  N   |       | 日期  |
|  7   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额  |
|  8   | pay_amt_last_day |   decimal   | 17 |   6    |    Y     |  N   |       | 昨日销售额(餐饮)  |
|  9   | pay_amt_last_week |   decimal   | 17 |   6    |    Y     |  N   |       | 上周同天销售额(餐饮)  |
|  10   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_rt_bu_sale_data">app_rt_bu_sale_data</a>

**说明：** 实时事业部维度销售数据统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID,为0代表全国  |
|  3   | bu_name |   varchar   | 60 |   0    |    Y     |  N   |       | 事业部名称  |
|  4   | dt |   varchar   | 12 |   0    |    Y     |  N   |       | 日期  |
|  5   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额(餐饮)  |
|  6   | pay_amt_last_day |   decimal   | 17 |   6    |    Y     |  N   |       | 昨日销售额(餐饮)  |
|  7   | pay_amt_last_week |   decimal   | 17 |   6    |    Y     |  N   |       | 上周同天销售额(餐饮)  |
|  8   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 合作客户数  |
|  9   | byr_cnt_last_day |   int   | 10 |   0    |    Y     |  N   |   0    | 昨日合作客户数(餐饮)  |
|  10   | byr_cnt_last_week |   int   | 10 |   0    |    Y     |  N   |   0    | 上周同天合作客户数(餐饮)  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_rt_wh_sale_data">app_rt_wh_sale_data</a>

**说明：** 实时仓库部维度销售数据统计表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | wh_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID,为0代表全国  |
|  3   | dt |   varchar   | 12 |   0    |    Y     |  N   |       | 日期  |
|  4   | hour |   varchar   | 12 |   0    |    Y     |  N   |       | 时间  |
|  5   | pay_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额  |
|  6   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 合作客户数  |
|  7   | ord_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 订单数  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_rt_wh_storage_location">app_rt_wh_storage_location</a>

**说明：** 温层库位使用统计

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | wh_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID,为0代表全国  |
|  3   | storage_type |   int   | 10 |   0    |    Y     |  N   |       | 温层  |
|  4   | enable_location_cnt |   int   | 10 |   0    |    Y     |  N   |       | 启用库区数  |
|  5   | used_location_cnt |   int   | 10 |   0    |    Y     |  N   |       | 使用库区是  |
|  6   | add_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  7   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_rt_wh_storage_volume">app_rt_wh_storage_volume</a>

**说明：** 仓库温层维度的容积

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  4   | job_storage_type |   bigint   | 20 |   0    |    Y     |  N   |       | 温层ID  |
|  5   | sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用库存件数/箱数  |
|  6   | sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用容量  |
|  7   | container_sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用箱数  |
|  8   | container_sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用箱体积  |
|  9   | by_piece_sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用件数  |
|  10   | by_piece_sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用件体积  |
|  11   | wh_volume |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库容积  |
|  12   | add_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 添加时间  |
|  13   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_rt_wh_storage_volume_flink">app_rt_wh_storage_volume_flink</a>

**说明：** 仓库温层维度的容积

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  4   | job_storage_type |   bigint   | 20 |   0    |    Y     |  N   |       | 温层ID  |
|  5   | sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用库存件数/箱数  |
|  6   | sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用容量  |
|  7   | container_sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用箱数  |
|  8   | container_sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用箱体积  |
|  9   | by_piece_sku_stock_cnt |   int   | 10 |   0    |    Y     |  N   |       | 已用件数  |
|  10   | by_piece_sku_stock_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 已用件体积  |
|  11   | wh_volume |   decimal   | 33 |   8    |    Y     |  N   |       | 仓库容积  |
|  12   | add_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 添加时间  |
|  13   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_sm_star_target_analysis">app_sm_star_target_analysis</a>

**说明：** 快驴事业部-销售目标信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | dt_mark |   varchar   | 40 |   0    |    Y     |  N   |       | 日期标记  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  4   | bu_name |   varchar   | 100 |   0    |    Y     |  N   |       | 事业部名称  |
|  5   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 城区ID  |
|  6   | area_name |   varchar   | 100 |   0    |    Y     |  N   |       | 城区名称  |
|  7   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 销售组ID  |
|  8   | org_name |   varchar   | 100 |   0    |    Y     |  N   |       | 销售组名称  |
|  9   | bdm_id |   int   | 10 |   0    |    Y     |  N   |       | BDM-ID  |
|  10   | bdm_mis_name |   varchar   | 100 |   0    |    Y     |  N   |       | BDM-MISName  |
|  11   | bdm_name |   varchar   | 100 |   0    |    Y     |  N   |       | BDM姓名  |
|  12   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | BD-ID  |
|  13   | mis_name |   varchar   | 100 |   0    |    Y     |  N   |       | BD-MISNAME  |
|  14   | bd_name |   varchar   | 100 |   0    |    Y     |  N   |       | BD姓名  |
|  15   | total_sale_amt |   decimal   | 17 |   6    |    Y     |  N   |       | 销售额  |
|  16   | total_cooper_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作客户数  |
|  17   | total_newbyr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  18   | real_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 有效新客数  |
|  19   | per_byr_sku |   decimal   | 17 |   6    |    Y     |  N   |       | 客均SKU数  |
|  20   | per_byr_spu |   decimal   | 17 |   6    |    Y     |  N   |       | 客均SPU数  |
|  21   | pre_byr_price |   decimal   | 17 |   6    |    Y     |  N   |       | 日客单价  |
|  22   | reward_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 奖励客户数  |
|  23   | type_a_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | A类客户数  |
|  24   | type_b_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | B类客户数  |
|  25   | type_p1_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | P1客户数  |
|  26   | type_p2_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | P2客户数  |
|  27   | type_p3_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | P3客户数  |
|  28   | type_p4_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | P4客户数  |
|  29   | type_p5_byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | P5客户数  |
|  30   | cat1_info |   json   | 1073741824 |   0    |    Y     |  N   |       | 后台一级类目指标  |
|  31   | cat2_info |   json   | 1073741824 |   0    |    Y     |  N   |       | 后台二级类目指标  |
|  32   | cat3_info |   json   | 1073741824 |   0    |    Y     |  N   |       | 后台三级类目指标  |
|  33   | data_type |   int   | 10 |   0    |    Y     |  N   |       | 数据分类：1：BD2：销售组  |
|  34   | dt_type |   int   | 10 |   0    |    Y     |  N   |       | 日期分类：1：日维度；4：月维度  |
|  35   | dt |   varchar   | 40 |   0    |    Y     |  N   |       | 计算日期分区  |
|  36   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="app_tgt_crane_nrt_bd_perf_category_detail_with_3p">app_tgt_crane_nrt_bd_perf_category_detail_with_3p</a>

**说明：** BD人效类目维度实时表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   varchar   | 32 |   0    |    N     |  Y   |       | 生成日期,YYYYMMDD  |
|  2   | bd_employee_id |   int   | 10 |   0    |    Y     |  N   |       | bdInfoId  |
|  3   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  4   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  5   | receipt_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 买家事业部id  |
|  6   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  7   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级品类ID  |
|  8   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级品类ID  |
|  9   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | 三级品类ID  |
|  10   | byr_id |   int   | 10 |   0    |    Y     |  N   |       | 商家id  |
|  11   | pay_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  12   | order_id |   bigint   | 20 |   0    |    Y     |  N   |       | 订单ID  |
|  13   | ord_no |   varchar   | 60 |   0    |    Y     |  N   |       | 订单号  |
|  14   | order_item_id |   bigint   | 20 |   0    |    N     |  Y   |       | 订单明细id  |
|  15   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  16   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  17   | csu_id |   bigint   | 20 |   0    |    Y     |  N   |       | csuid  |
|  18   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  19   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | is_3p |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否是3p订单  |
|  22   | is_self |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否是自营订单  |

**表名：** <a id="app_tgt_crane_nrt_bd_target_ext_with_3p">app_tgt_crane_nrt_bd_target_ext_with_3p</a>

**说明：** 数据播报额外数据指标表（包含3P数据）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键ID  |
|  2   | dt |   varchar   | 32 |   0    |    N     |  N   |       | 生成日期,YYYYMMDDHHMM  |
|  3   | bd_id |   int   | 10 |   0    |    N     |  N   |   0    | BD的id  |
|  4   | bd_employee_id |   int   | 10 |   0    |    N     |  N   |   0    | bdInfoId  |
|  5   | org_id |   int   | 10 |   0    |    N     |  N   |   0    | 小组id  |
|  6   | area_id |   int   | 10 |   0    |    N     |  N   |   0    | 分区ID  |
|  7   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |
|  8   | receipt_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  9   | sku_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 单个客户SPU数去重，总计不去重的SPU在BD维度之和  |
|  10   | spu_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 单个客户SKU数去重，总计不去重的SKU在BD维度之和  |
|  11   | fresh_meat_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单鲜肉客户数  |
|  12   | vegetable_fruit_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单蔬菜水果客户数  |
|  13   | meat_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单肉禽客户数  |
|  14   | rice_new_buyer_count |   int   | 10 |   0    |    N     |  N   |   0    | 首单米客户数  |
|  15   | wake_up_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 唤醒客户数  |
|  16   | tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类客户数  |
|  17   | tag_a1_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A1类客户数  |
|  18   | tag_a2_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A2类客户数  |
|  19   | tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类客户数  |
|  20   | tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类客户数  |
|  21   | tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类客户数  |
|  22   | fresh_meat_tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉A类客户数  |
|  23   | fresh_meat_tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉B类客户数  |
|  24   | fresh_meat_tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉C类客户数  |
|  25   | fresh_meat_tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉D类客户数  |
|  26   | fruit_tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果A类客户数  |
|  27   | fruit_tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果B类客户数  |
|  28   | fruit_tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果C类客户数  |
|  29   | fruit_tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果D类客户数  |
|  30   | tag_a_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类客户总数  |
|  31   | tag_a1_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A1类客户总数  |
|  32   | tag_a2_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A2类客户总数  |
|  33   | tag_b_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类客户总数  |
|  34   | tag_c_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类客户总数  |
|  35   | tag_d_total_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类客户总数  |
|  36   | byr_ytd_and_td_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 复购客户数（昨日下单今日也下单客户数）  |
|  37   | byr_ytd_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 昨日下单客户数  |
|  38   | new_byr_ytd_and_td_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 新客复购数（昨日下单新客今日也下单客户数）  |
|  39   | new_byr_ytd_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 昨日下单新客户数  |
|  40   | visit_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访客户数-有效拜访  |
|  41   | visit_tag_a_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类拜访客户数-有效拜访  |
|  42   | visit_tag_b_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类拜访客户数-有效拜访  |
|  43   | visit_tag_c_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类拜访客户数-有效拜访  |
|  44   | visit_tag_d_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类拜访客户数-有效拜访  |
|  45   | visit_on_site_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访客户数-有效上门  |
|  46   | visit_on_site_tag_a_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类拜访客户数-有效上门  |
|  47   | visit_on_site_tag_b_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类拜访客户数-有效上门  |
|  48   | visit_on_site_tag_c_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类拜访客户数-有效上门  |
|  49   | visit_on_site_tag_d_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类拜访客户数-有效上门  |
|  50   | visit_to_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访转化客户数-有效拜访  |
|  51   | visit_to_byr_tag_a_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类拜访转化客户数-有效拜访  |
|  52   | visit_to_byr_tag_b_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类拜访转化客户数-有效拜访  |
|  53   | visit_to_byr_tag_c_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类拜访转化客户数-有效拜访  |
|  54   | visit_to_byr_tag_d_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类拜访转化客户数-有效拜访  |
|  55   | visit_on_site_to_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访转化客户数-有效上门  |
|  56   | visit_on_site_to_byr_tag_a_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类拜访转化客户数-有效上门  |
|  57   | visit_on_site_to_byr_tag_b_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类拜访转化客户数-有效上门  |
|  58   | visit_on_site_to_byr_tag_c_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类拜访转化客户数-有效上门  |
|  59   | visit_on_site_to_byr_tag_d_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类拜访转化客户数-有效上门  |
|  60   | visit_to_new_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访转化新客数-有效拜访  |
|  61   | visit_on_site_to_new_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 拜访转化新客数-有效上门  |

**表名：** <a id="app_tl_pd_order_screen_day_withpop">app_tl_pd_order_screen_day_withpop</a>

**说明：** 快驴事业部-驼铃订单管理订单列表筛选(含3p)

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | fst_arranged_ord_time_own |   varchar   | 64 |   0    |    Y     |  N   |       | 自营首次成交单时间  |
|  3   | last_arranged_ord_time_own |   varchar   | 64 |   0    |    Y     |  N   |       | 自营末次成交单时间  |
|  4   | fst_arranged_ord_time_3p |   varchar   | 64 |   0    |    Y     |  N   |       | 3P首次成交单时间  |
|  5   | last_arranged_ord_time_3p |   varchar   | 64 |   0    |    Y     |  N   |       | 3P末次成交单时间  |
|  6   | arranged_ord_cnt_own |   bigint   | 20 |   0    |    Y     |  N   |       | 自营上月订单量  |
|  7   | arranged_ord_cnt_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 3P上月订单量  |

**表名：** <a id="app_transport_forecast_results">app_transport_forecast_results</a>

**说明：** 销量预测-预测结果

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增id  |
|  2   | fc_dt |   varchar   | 20 |   0    |    N     |  N   |       | 预测日期  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | region_id |   bigint   | 20 |   0    |    N     |  N   |       | regionID  |
|  5   | source |   int   | 10 |   0    |    N     |  N   |       | 数据来源，1：自测，2：业务  |
|  6   | model |   int   | 10 |   0    |    N     |  N   |       | 预测模型，0：xgb  |
|  7   | total_amt_fc_wk |   double   | 23 |   0    |    N     |  N   |       | 未来一周预测总销量  |
|  8   | daily_amt_fc_wk |   varchar   | 1024 |   0    |    N     |  N   |       | 未来一周预测每日销量  |
|  9   | create_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |

**表名：** <a id="app_wh_dbus_rt_parcel">app_wh_dbus_rt_parcel</a>

**说明：** 包裹表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | parcel_no |   varchar   | 128 |   0    |    Y     |  N   |       | 包裹号  |
|  4   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  5   | goods_owner_code |   varchar   | 255 |   0    |    Y     |  N   |       | 货主编码  |
|  6   | goods_owner_name |   varchar   | 255 |   0    |    Y     |  N   |       | 货主名称  |
|  7   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型:1自营、2POP、3代仓代配  |
|  8   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 订单号  |
|  9   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 商家ID  |
|  10   | customer_name |   varchar   | 128 |   0    |    Y     |  N   |       | 商家名称  |
|  11   | seller_id |   bigint   | 20 |   0    |    Y     |  N   |       | 卖家ID  |
|  12   | seller_name |   varchar   | 128 |   0    |    Y     |  N   |       | 卖家名称  |
|  13   | delivery_route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  14   | station_area_no |   varchar   | 32 |   0    |    Y     |  N   |       | 站区编码  |
|  15   | station_route_seq |   varchar   | 32 |   0    |    Y     |  N   |       | 站区线路  |
|  16   | poi_serial_code |   varchar   | 32 |   0    |    Y     |  N   |       | 点位码  |
|  17   | fulfill_date |   timestamp   | 19 |   0    |    Y     |  N   |       | 履约日期格式yyyy-mm-dd  |
|  18   | parcel_status |   smallint   | 6 |   0    |    Y     |  N   |       | 包裹状态:1已生成、2已收货、3已交接、4已取消  |
|  19   | parcel_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 包裹重量  |
|  20   | print_status |   smallint   | 6 |   0    |    Y     |  N   |       | 打印状态:1已生成、2待打印、3已打印  |
|  21   | print_count |   int   | 10 |   0    |    Y     |  N   |       | 打印次数  |
|  22   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | SKU编码  |
|  23   | sku_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  24   | extend_attributes |   varchar   | 4096 |   0    |    Y     |  N   |       | 扩展信息,JSON格式  |
|  25   | version |   bigint   | 20 |   0    |    Y     |  N   |       | 版本号  |
|  26   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除1：有效0：删除  |
|  27   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  28   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  29   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  30   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |

**表名：** <a id="app_wh_dbus_rt_parcel_item">app_wh_dbus_rt_parcel_item</a>

**说明：** 包裹明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | parcel_no |   varchar   | 128 |   0    |    Y     |  N   |       | 包裹号  |
|  4   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  5   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | SKU编码  |
|  6   | sku_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  7   | sku_name |   varchar   | 255 |   0    |    Y     |  N   |       | 名称  |
|  8   | sku_unit |   varchar   | 64 |   0    |    Y     |  N   |       | 单位  |
|  9   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 单位描述  |
|  10   | sku_image_url |   varchar   | 1024 |   0    |    Y     |  N   |       | 商品图片url  |
|  11   | sku_qty |   int   | 10 |   0    |    Y     |  N   |       | 数量  |
|  12   | extend_attributes |   varchar   | 1024 |   0    |    Y     |  N   |       | 扩展信息,JSON格式  |
|  13   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除1：有效0：删除  |
|  14   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  15   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  16   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  17   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |

**表名：** <a id="app_wh_dbus_rt_seller_info">app_wh_dbus_rt_seller_info</a>

**说明：** 卖家送货模式映射表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | seller_id |   bigint   | 20 |   0    |    Y     |  N   |       | 卖家ID  |
|  4   | seller_name |   varchar   | 255 |   0    |    Y     |  N   |       | 卖家名称  |
|  5   | deliver_mode |   varchar   | 16 |   0    |    Y     |  N   |       | 卖家送货模式01:卖家直接送货至发货仓02:KL短驳至发货仓03:KL自提  |
|  6   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  8   | create_by |   varchar   | 64 |   0    |    Y     |  N   |       | 创建人名称  |
|  9   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |
|  10   | last_modify_by |   varchar   | 64 |   0    |    Y     |  N   |       | 最后修改人  |

**表名：** <a id="app_wh_operator_task_effect">app_wh_operator_task_effect</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   date   | 10 |   0    |    Y     |  N   |       | 日期  |
|  2   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  3   | operator_id |   bigint   | 20 |   0    |    Y     |  N   |       | 操作员ID  |
|  4   | start_time |   varchar   | 512 |   0    |    Y     |  N   |       | 开始时长  |
|  5   | area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 大区id  |
|  6   | area_name |   varchar   | 20 |   0    |    Y     |  N   |       | 大区名称  |
|  7   | wh_name |   varchar   | 512 |   0    |    Y     |  N   |       | 仓库名称  |
|  8   | operator_name |   varchar   | 512 |   0    |    Y     |  N   |       | 操作员名称  |
|  9   | temporary_status |   int   | 10 |   0    |    Y     |  N   |       | 员工类型:0:长工1:临时工  |
|  10   | rf_type |   bigint   | 20 |   0    |    Y     |  N   |       | rf类型：1入库，2库内，3加工，4出库，5其他  |
|  11   | operate_type |   bigint   | 20 |   0    |    Y     |  N   |       | 作业类型:1收货，2上架，3投线，4拣货，5加工，6复核，7移库，8补货，9盘点，10异常，11其他  |
|  12   | operate_duration |   bigint   | 20 |   0    |    Y     |  N   |       | 作业时长(秒)  |
|  13   | end_time |   varchar   | 512 |   0    |    Y     |  N   |       | 结束时长  |

**表名：** <a id="bd_perf_detail_history">bd_perf_detail_history</a>

**说明：** BD人效实时历史记录表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | time_string |   varchar   | 32 |   0    |    N     |  N   |       | 日期，YYYYMMDDHHMM  |
|  3   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | BD的id  |
|  4   | bd_info_id |   int   | 10 |   0    |    N     |  N   |       | bdInfoId  |
|  5   | pay_amt |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 销售额  |
|  6   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 合作商户数  |
|  7   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  8   | bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 事业部名称  |
|  9   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  10   | city_name |   varchar   | 64 |   0    |    Y     |  N   |       | 城市名称  |
|  11   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 小组id  |
|  12   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组name  |
|  13   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  14   | stat_time |   datetime   | 19 |   0    |    Y     |  N   |       | 统计时间  |
|  15   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  16   | area_name |   varchar   | 64 |   0    |    Y     |  N   |       | 分区名称  |
|  17   | vegetable_fruit_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 蔬菜水果销售额  |
|  18   | frozen_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 冻肉销售额  |
|  19   | fresh_meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 鲜肉销售额  |
|  20   | meat_pay_amt |   decimal   | 15 |   2    |    N     |  N   |   0.00    | 肉禽销售额  |
|  21   | vegetable_fruit_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 蔬菜水果合作客户数  |
|  22   | frozen_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 冻肉合作客户数  |
|  23   | fresh_meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 鲜肉合作客户数  |
|  24   | meat_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | 肉禽合作客户数  |
|  25   | tag_a_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | A类合作客户数  |
|  26   | tag_b_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | B类合作客户数  |
|  27   | tag_c_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | C类合作客户数  |
|  28   | tag_d_byr_cnt |   int   | 10 |   0    |    N     |  N   |   0    | D类合作客户数  |

**表名：** <a id="caterb2b_customer_tag_day">caterb2b_customer_tag_day</a>

**说明：** 快驴事业部-客户维度指标标签数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 商户id  |
|  2   | customer_name |   varchar   | 64 |   0    |    Y     |  N   |       | 商户名称  |
|  3   | active_tag_id |   int   | 10 |   0    |    Y     |  N   |       | 商户ABCD分层标签id  |
|  4   | active_tag_name |   varchar   | 64 |   0    |    Y     |  N   |       | 商户ABCD分层标签  |

**表名：** <a id="dbus_driver_schedule">dbus_driver_schedule</a>

**说明：** 参与排班司机表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | schedule_id |   bigint   | 20 |   0    |    N     |  N   |       | 排班id  |
|  5   | shift_id |   bigint   | 20 |   0    |    N     |  N   |       | 班次ID  |
|  6   | schedule_date |   datetime   | 19 |   0    |    N     |  N   |       | 排班日期  |
|  7   | driver_id |   bigint   | 20 |   0    |    N     |  N   |       | 司机ID  |
|  8   | leave_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 请假状态  |
|  9   | route_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 排线ID  |
|  10   | supervisor |   varchar   | 50 |   0    |    N     |  N   |       | 责任调度  |
|  11   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 注册时间  |
|  13   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  15   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="dbus_fact_centralized_pick_bill">dbus_fact_centralized_pick_bill</a>

**说明：** 总拣任务主表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | centralized_pick_no |   varchar   | 50 |   0    |    Y     |  N   |       | 总拣任务单号  |
|  3   | centralized_pick_status |   smallint   | 6 |   0    |    Y     |  N   |   10    | 总拣任务单状态：10新建20拣货中30拣货完成  |
|  4   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  5   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 完成时间  |
|  6   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人  |
|  7   | handler_name |   varchar   | 50 |   0    |    Y     |  N   |       | 任务领取人名  |
|  8   | logic_name |   varchar   | 50 |   0    |    Y     |  N   |       | 逻辑区  |
|  9   | logic_area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 逻辑区id  |
|  10   | order_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣sku数  |
|  11   | actual_sku_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣sku数  |
|  12   | order_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  13   | actual_unit_total_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  14   | print_times |   int   | 10 |   0    |    Y     |  N   |   0    | 打印次数  |
|  15   | diff |   smallint   | 6 |   0    |    Y     |  N   |       | 是否有差异  |
|  16   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  17   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  18   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1有效，0删除  |
|  19   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  20   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  21   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  22   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  23   | priority_rank |   smallint   | 6 |   0    |    Y     |  N   |   5    | 拣货任务的优先级1一级，2二级，3三级，4四级，5五级  |
|  24   | receptacle_code |   varchar   | 20 |   0    |    Y     |  N   |       | 容器编码  |
|  25   | full_receptacle |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否满板0:否1:是  |

**表名：** <a id="dbus_rt_order_outbound_bill">dbus_rt_order_outbound_bill</a>

**说明：** 订单出库单

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id(原ware_house_id)  |
|  4   | warehouse_name |   varchar   | 32 |   0    |    N     |  N   |       | 仓库name(原ware_house_name)  |
|  5   | outbound_bill_no |   varchar   | 64 |   0    |    N     |  Y   |       | 出库单号  |
|  6   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 订单号  |
|  7   | origin_order_no |   varchar   | 64 |   0    |    N     |  N   |       | 原订单号  |
|  8   | outbound_bill_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 1订单出库13换货出库14补货出库  |
|  9   | outbound_bill_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 出库单状态10已生成20已生成拣货任务30拣货中40拣货完成90出库完成  |
|  10   | first_order |   bit   | 1 |   0    |    N     |  N   |   0    | 是否首单(原is_first_order)  |
|  11   | order_shortage |   bit   | 1 |   0    |    Y     |  N   |   1    | 0缺货1不缺货  |
|  12   | exchange_type |   smallint   | 6 |   0    |    Y     |  N   |       | 换补货类型  |
|  13   | excuse |   varchar   | 1024 |   0    |    N     |  N   |       | 换补货原因(原exchange_reason)  |
|  14   | order_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 下单时间  |
|  15   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 完成时间  |
|  16   | cancel_status |   bit   | 1 |   0    |    N     |  N   |   0    | 是否取消1：取消0：未取消  |
|  17   | cancel_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 取消时间  |
|  18   | bd_name |   varchar   | 32 |   0    |    Y     |  N   |       | bd名  |
|  19   | bd_phone_encrypt |   varchar   | 64 |   0    |    Y     |  N   |       | BD手机号密文  |
|  20   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店Id  |
|  21   | poi_type |   smallint   | 6 |   0    |    Y     |  N   |   1    | 门店类型1门店2总部仓库  |
|  22   | poi_name |   varchar   | 256 |   0    |    Y     |  N   |       | 门店名称  |
|  23   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店地址id（原addressId）  |
|  24   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 商家id（原businessId）  |
|  25   | customer_group_level |   smallint   | 6 |   0    |    Y     |  N   |       | 客户级别和客户规模聚合值,20：重点/40：小V/60：中B  |
|  26   | customer_name |   varchar   | 128 |   0    |    N     |  N   |       | 商家名称（原businessName）  |
|  27   | recipient_name |   varchar   | 255 |   0    |    N     |  N   |       | 收货人姓名（原businessContacts）  |
|  28   | recipient_tel_token |   varchar   | 256 |   0    |    N     |  N   |       | 收货人电话token（原businessPhoneEncrypt）  |
|  29   | recipient_addr |   varchar   | 855 |   0    |    Y     |  N   |       | 收货人地址（原businessAddress）  |
|  30   | longitude |   varchar   | 32 |   0    |    N     |  N   |       | 经度  |
|  31   | latitude |   varchar   | 32 |   0    |    N     |  N   |       | 纬度  |
|  32   | station_name |   varchar   | 32 |   0    |    Y     |  N   |       | 站点名  |
|  33   | shift_no |   int   | 10 |   0    |    Y     |  N   |       | 订单班次序号  |
|  34   | tms_msg_version |   bigint   | 20 |   0    |    N     |  N   |   0    | TMS消息版本号  |
|  35   | delivery_route_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 排线id  |
|  36   | delivery_route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  37   | delivery_route_name |   varchar   | 20 |   0    |    N     |  N   |       | 排线名称  |
|  38   | delivery_bill_type |   smallint   | 6 |   0    |    N     |  N   |   2    | 配送单类型1:电子配送单2:纸质配送单  |
|  39   | delivery_times |   varchar   | 256 |   0    |    Y     |  N   |       | 配送时间段  |
|  40   | delivery_product |   int   | 10 |   0    |    Y     |  N   |       | 配送产品  |
|  41   | scheduled_delivery_date |   timestamp   | 19 |   0    |    Y     |  N   |       | 预计配送履约时间格式yyyy-mm-dd  |
|  42   | remark |   varchar   | 512 |   0    |    Y     |  N   |       |   |
|  43   | order_mark |   varchar   | 50 |   0    |    Y     |  N   |       | 订单扩展标识  |
|  44   | version |   int   | 10 |   0    |    Y     |  N   |       | 版本号  |
|  45   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  46   | create_account |   varchar   | 64 |   0    |    N     |  N   |       | 创建账号  |
|  47   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  48   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  49   | last_modify_account |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改账号  |
|  50   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  51   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |

**表名：** <a id="dbus_rt_replenish_task_bill">dbus_rt_replenish_task_bill</a>

**说明：** 补货任务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库Id  |
|  4   | task_bill_no |   varchar   | 64 |   0    |    N     |  N   |       | 补货任务单  |
|  5   | task_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 补货任务类型日常补货:1，紧急补货:2  |
|  6   | task_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 补货任务状态1：已生成，2：已领取，3：已下架，4：已完成，5:已取消  |
|  7   | wave_no |   varchar   | 64 |   0    |    N     |  N   |       | 波次编号  |
|  8   | wave_name |   varchar   | 64 |   0    |    N     |  N   |   -    | 波次名称  |
|  9   | replenish_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 补货类型0:默认,1:波次紧急补货,2:波次增补任务  |
|  10   | offshelf_area_code |   varchar   | 32 |   0    |    N     |  N   |       | 下架库区编码  |
|  11   | offshelf_location_code |   varchar   | 32 |   0    |    N     |  N   |       | 下架库位编码  |
|  12   | offshelf_plan_qty |   int   | 10 |   0    |    N     |  N   |   0    | 下架计划数  |
|  13   | offshelf_actual_qty |   int   | 10 |   0    |    N     |  N   |   0    | 下架实际数  |
|  14   | task_receiver_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 补货任务领取人id  |
|  15   | task_receiver |   varchar   | 64 |   0    |    N     |  N   |       | 补货任务领取人  |
|  16   | task_receive_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 补货任务领取时间  |
|  17   | task_finish_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 补货任务完成时间  |
|  18   | operate_platform |   smallint   | 6 |   0    |    N     |  N   |   0    | 操作平台1：WEB2：RF  |
|  19   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |       | 最小规格sku编码  |
|  20   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格sku编码  |
|  21   | outer_packing_factor |   int   | 10 |   0    |    N     |  N   |   0    | 箱规(规格代码外包装转化率)  |
|  22   | sku_pack_spec |   int   | 10 |   0    |    Y     |  N   |       | 商品转换率  |
|  23   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  24   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  25   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  26   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |
|  27   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后更新人  |

**表名：** <a id="dbus_shift">dbus_shift</a>

**说明：** 班次配置表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 255 |   0    |    N     |  N   |       | 排班名称  |
|  3   | start_time |   datetime   | 19 |   0    |    N     |  N   |       | 生效开始时间  |
|  4   | end_time |   datetime   | 19 |   0    |    N     |  N   |       | 生效截止时间  |
|  5   | arrive_warehouse_time |   time   | 8 |   0    |    N     |  N   |       | 到仓时间  |
|  6   | sign_in_start_time |   time   | 8 |   0    |    N     |  N   |       | 签到开始时间  |
|  7   | sign_in_end_time |   time   | 8 |   0    |    N     |  N   |       | 签到结束时间  |
|  8   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 所属仓库id  |
|  9   | enabled_status |   bit   | 1 |   0    |    N     |  N   |   0    | 启用状态，1：启用，0：未启用  |
|  10   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  11   | istatus |   smallint   | 6 |   0    |    N     |  N   |       | 逻辑删除正常1,删除0  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  13   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  15   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="dim_caterb2b_ba_category_details">dim_caterb2b_ba_category_details</a>

**说明：** 商分自定义类目与后台类目关联关系

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | cat1_id |   bigint   | 20 |   0    |    N     |  Y   |       | 后台一级类目ID  |
|  2   | cat1_name |   varchar   | 50 |   0    |    N     |  N   |       | 后台一级类目名称  |
|  3   | cat2_id |   bigint   | 20 |   0    |    N     |  Y   |       | 后台二级类目ID  |
|  4   | cat2_name |   varchar   | 50 |   0    |    N     |  N   |       | 后台二级类目名称  |
|  5   | cat3_id |   bigint   | 20 |   0    |    N     |  Y   |       | 后台三级类目ID  |
|  6   | cat3_name |   varchar   | 50 |   0    |    N     |  N   |       | 后台三级类目名称  |
|  7   | ba_cat1_id |   bigint   | 20 |   0    |    N     |  N   |       | 商分一级类目ID  |
|  8   | ba_cat1_name |   varchar   | 50 |   0    |    N     |  N   |       | 商分一级类目名称  |
|  9   | ba_cat2_id |   bigint   | 20 |   0    |    N     |  N   |       | 商分二级类目ID  |
|  10   | ba_cat2_name |   varchar   | 50 |   0    |    N     |  N   |       | 商分二级类目名称  |

**表名：** <a id="dim_caterb2b_bd_detail">dim_caterb2b_bd_detail</a>

**说明：** 快驴事业部-RAC组织结构人员实时信息数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | region_id |   int   | 10 |   0    |    Y     |  N   |       | 战区ID  |
|  3   | region_name |   varchar   | 128 |   0    |    Y     |  N   |       | 战区名称  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-BMS事业部ID  |
|  5   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-BMS事业部名称  |
|  6   | rac_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-RAC事业部ID  |
|  7   | rac_bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-RAC事业部名称  |
|  8   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-BMS城市ID  |
|  9   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-BMS城市名称  |
|  10   | rac_city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-RAC城市ID  |
|  11   | rac_city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-RAC城市名称  |
|  12   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  13   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名称  |
|  14   | group_id |   int   | 10 |   0    |    Y     |  N   |       | 销售组ID  |
|  15   | group_name |   varchar   | 128 |   0    |    Y     |  N   |       | 销售组名称  |
|  16   | bdm_id |   int   | 10 |   0    |    Y     |  N   |       | BDMID  |
|  17   | bdm_employee_id |   int   | 10 |   0    |    Y     |  N   |       | BDM-EmployeeID原名bd_info_id  |
|  18   | bdm_mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-MISNAME  |
|  19   | bdm_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-姓名  |
|  20   | bd_id |   int   | 10 |   0    |    N     |  N   |   0    | BDID  |
|  21   | bd_employee_id |   int   | 10 |   0    |    Y     |  N   |       | BD-EmployeeID原名bd_info_id  |
|  22   | mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD-MISNAME  |
|  23   | bd_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD姓名  |
|  24   | pos_code |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位ID  |
|  25   | pos_name |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位名称  |
|  26   | process_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="dim_caterb2b_bd_organization">dim_caterb2b_bd_organization</a>

**说明：** 快驴事业部-快驴BD组织结构信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bd_id |   int   | 10 |   0    |    N     |  Y   |   0    | BD的id  |
|  2   | bd_info_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | bd_mis_id |   varchar   | 64 |   0    |    Y     |  N   |       | BD的MisID  |
|  4   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | BD的姓名  |
|  5   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | city_name |   varchar   | 64 |   0    |    Y     |  N   |       | 城市名称  |
|  7   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 组织机构节点ID  |
|  8   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 组织机构节点名称  |
|  9   | org_type |   int   | 10 |   0    |    Y     |  N   |       | 节点类型：1总部，2城市，3蜂窝  |
|  10   | parent_org_id |   int   | 10 |   0    |    Y     |  N   |       | 父节点ID  |
|  11   | pos_code |   varchar   | 32 |   0    |    Y     |  N   |       | 岗位编码  |
|  12   | pos_name |   varchar   | 64 |   0    |    Y     |  N   |       | 岗位名称，如BD/BDM/CM  |
|  13   | join_date |   varchar   | 64 |   0    |    Y     |  N   |       | 加入小组的日期  |
|  14   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  15   | bu_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  16   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | epassport_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | epassport_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  19   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  20   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名字  |

**表名：** <a id="dim_caterb2b_bi_cat_mapping_details">dim_caterb2b_bi_cat_mapping_details</a>

**说明：** B2B业务部--后台类目表-商分组织类目-kpi类目

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | cat1_id |   bigint   | 20 |   0    |    N     |  Y   |       | 一级分类ID  |
|  2   | cat1_name |   varchar   | 100 |   0    |    N     |  N   |       | 一级分类名  |
|  3   | cat2_id |   bigint   | 20 |   0    |    N     |  Y   |       | 二级分类ID  |
|  4   | cat2_name |   varchar   | 100 |   0    |    N     |  N   |       | 二级分类名  |
|  5   | org_cat1_id |   bigint   | 20 |   0    |    N     |  N   |       | 组织一级分类ID  |
|  6   | org_cat1_name |   varchar   | 100 |   0    |    N     |  N   |       | 组织一级分类名  |
|  7   | org_cat2_id |   bigint   | 20 |   0    |    N     |  N   |       | 组织二级分类ID  |
|  8   | org_cat2_name |   varchar   | 100 |   0    |    N     |  N   |       | 组织二级分类名  |
|  9   | org_cat3_id |   bigint   | 20 |   0    |    N     |  N   |       | 组织三级分类ID  |
|  10   | org_cat3_name |   varchar   | 100 |   0    |    N     |  N   |       | 组织三级分类名  |
|  11   | kpi_id |   bigint   | 20 |   0    |    N     |  N   |       | kpi分类ID  |
|  12   | kpi_cat_name |   varchar   | 100 |   0    |    N     |  N   |       | kpi分类名  |

**表名：** <a id="dim_caterb2b_business_unit">dim_caterb2b_business_unit</a>

**说明：** 快驴-事业部维表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部id  |
|  2   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  4   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       | 经销商ID  |
|  5   | seq |   int   | 10 |   0    |    Y     |  N   |       | 事业部排序用（按开城日期升序）  |

**表名：** <a id="dim_caterb2b_city">dim_caterb2b_city</a>

**说明：** B2B业务部开站城市

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | ID  |
|  2   | city_id |   int   | 10 |   0    |    N     |  N   |       | 城市id  |
|  3   | city_name |   varchar   | 128 |   0    |    N     |  N   |       | 城市名称  |
|  4   | city_pinyin |   varchar   | 128 |   0    |    N     |  N   |       | 城市拼音  |
|  5   | city_alpha |   varchar   | 128 |   0    |    N     |  N   |       | 城市拼音缩写  |
|  6   | province_id |   int   | 10 |   0    |    N     |  N   |       | 所属省份id  |
|  7   | province_name |   varchar   | 128 |   0    |    N     |  N   |       | 所属省份名称  |
|  8   | city_pic |   varchar   | 1024 |   0    |    Y     |  N   |       | 城市图景  |
|  9   | opentime |   int   | 10 |   0    |    Y     |  N   |       | 城市开站时间  |
|  10   | area_code |   varchar   | 4 |   0    |    Y     |  N   |       | 城市所对应区号  |
|  11   | online_status |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 状态0下线1上线  |
|  12   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 有效性0删除，1有效  |
|  13   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  14   | utime |   int   | 10 |   0    |    Y     |  N   |   0    | 更新时间  |
|  15   | seq |   int   | 10 |   0    |    Y     |  N   |       | 事业部排序用（按开城日期升序）  |

**表名：** <a id="dim_caterb2b_city_business_unit">dim_caterb2b_city_business_unit</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | bu_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  3   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  4   | city_id |   int   | 10 |   0    |    N     |  N   |       |   |
|  5   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  6   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | biz_mode |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | seq |   int   | 10 |   0    |    Y     |  N   |   9999    | 事业部排序用（按开城日期升序）  |

**表名：** <a id="dim_caterb2b_customer">dim_caterb2b_customer</a>

**说明：** 快驴事业部-快驴客户信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | customer_name |   varchar   | 512 |   0    |    Y     |  N   |       | 客户名称  |
|  3   | customer_short_name |   varchar   | 512 |   0    |    Y     |  N   |       | 客户简称  |
|  4   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部ID  |
|  5   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | province_id |   bigint   | 20 |   0    |    Y     |  N   |       | 省份ID  |
|  7   | province_name |   varchar   | 255 |   0    |    Y     |  N   |       | 省份名称  |
|  8   | county_id |   bigint   | 20 |   0    |    Y     |  N   |       | 区县ID  |
|  9   | county_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区县名称  |
|  10   | address |   varchar   | 1024 |   0    |    Y     |  N   |       | 地址  |
|  11   | poi_source |   int   | 10 |   0    |    Y     |  N   |       | 门店来源:1.BD创建2.外卖商家  |
|  12   | poi_source_remark |   varchar   | 255 |   0    |    Y     |  N   |       | 门店来源:1.BD创建2.外卖商家  |
|  13   | parent_customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 父客户ID  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道ID  |
|  15   | contact_name |   varchar   | 255 |   0    |    Y     |  N   |       | 联系人姓名  |
|  16   | contact_tel |   varchar   | 255 |   0    |    Y     |  N   |       | 联系人电话  |
|  17   | spare_contact_name |   varchar   | 255 |   0    |    Y     |  N   |       | 备用联系人姓名  |
|  18   | spare_contact_tel |   varchar   | 255 |   0    |    Y     |  N   |       | 备用联系人电话  |
|  19   | platform_bd_name |   varchar   | 255 |   0    |    Y     |  N   |       | 平台业务员  |
|  20   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | 负责BD的ID  |
|  21   | bd_info_id |   bigint   | 20 |   0    |    Y     |  N   |       | 快驴为BD的mis_id,亚食联为BD的ep_id  |
|  22   | bd_name |   varchar   | 255 |   0    |    Y     |  N   |       | 负责BD的姓名  |
|  23   | bd_tel |   varchar   | 255 |   0    |    Y     |  N   |       | 负责BD的电话  |
|  24   | customer_type |   int   | 10 |   0    |    Y     |  N   |       | 客户类型1:普通2:连锁总店3:连锁分店  |
|  25   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  26   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名  |
|  27   | delivery_time |   varchar   | 2048 |   0    |    Y     |  N   |       | 配送时间配置  |
|  28   | customer_status |   int   | 10 |   0    |    Y     |  N   |       | 上下线状态1:上线,2:下线,3:待上线  |
|  29   | online_time |   varchar   | 255 |   0    |    Y     |  N   |       | 上线时间  |
|  30   | offline_time |   varchar   | 255 |   0    |    Y     |  N   |       | 下线时间  |
|  31   | offline_reason |   varchar   | 1024 |   0    |    Y     |  N   |       | 下线原因  |
|  32   | source |   int   | 10 |   0    |    Y     |  N   |       | 客户注册来源0：默认,1：管理平台,2：自营&经销商&亚食联,3：外卖  |
|  33   | source_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户注册来源ID，若source=2,该字段存的值是dealer_id  |
|  34   | istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除,1:正常，0:删除  |
|  35   | first_cat_id |   bigint   | 20 |   0    |    Y     |  N   |       | 商家一级分类id  |
|  36   | second_cat_id |   bigint   | 20 |   0    |    Y     |  N   |       | 商家二级分类id  |
|  37   | first_cat_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家一级分类名称  |
|  38   | second_cat_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家二级分类名称  |
|  39   | cat_type |   int   | 10 |   0    |    Y     |  N   |       | 流通-餐饮标签1:餐饮，2:流通  |
|  40   | create_time |   varchar   | 255 |   0    |    Y     |  N   |       | 创建时间  |
|  41   | update_time |   varchar   | 255 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="dim_caterb2b_customer_his">dim_caterb2b_customer_his</a>

**说明：** B2B业务部-快驴商家客户历史信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | customer_name |   varchar   | 512 |   0    |    Y     |  N   |       | 客户名称  |
|  3   | is_zhongb |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 是否中B客户1:是0:否  |

**表名：** <a id="dim_caterb2b_customer_ord_time_his">dim_caterb2b_customer_ord_time_his</a>

**说明：** B2B业务部-商户交易时间维表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | byr_id |   bigint   | 20 |   0    |    N     |  Y   |       | 商家id  |
|  2   | byr_first_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 商家首次下单时间  |
|  3   | byr_last_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 商家最后下单时间  |
|  4   | fst_arranged_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 商家首次成交单的下单时间  |
|  5   | last_arranged_ord_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 商家最后一次成交单的下单时间  |

**表名：** <a id="dim_caterb2b_customer_tag">dim_caterb2b_customer_tag</a>

**说明：** 快驴事业部-客户所对应的标签

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   int   | 10 |   0    |    N     |  Y   |   0    | 客户ID  |
|  2   | active_tag_name |   varchar   | 30 |   0    |    Y     |  N   |       | 客户ABCD分层标签  |
|  3   | latest_30_sm_tag |   varchar   | 30 |   0    |    Y     |  N   |       | 近30天的sm标签  |
|  4   | mtd_sm_tag |   varchar   | 30 |   0    |    Y     |  N   |       | mtd的sm标签  |

**表名：** <a id="dim_caterb2b_dbus_delivery_times">dim_caterb2b_dbus_delivery_times</a>

**说明：** 配送时间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | ware_house_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库id  |
|  4   | ensure_time |   bit   | 1 |   0    |    Y     |  N   |   1    | 是否保证时效性0不保证1保证  |
|  5   | seq_no |   int   | 10 |   0    |    Y     |  N   |   0    | 顺序号  |
|  6   | type |   int   | 10 |   0    |    Y     |  N   |   0    | 配送时段类型1:wms；2:mall  |
|  7   | start_time |   varchar   | 5 |   0    |    Y     |  N   |   00:00    | 开始时间点  |
|  8   | end_time |   varchar   | 5 |   0    |    Y     |  N   |   00:00    | 结束时间点  |
|  9   | istatus |   int   | 10 |   0    |    Y     |  N   |   1    | 逻辑删除  |
|  10   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  11   | create_by |   varchar   | 64 |   0    |    Y     |  N   |       | 创建人名称  |
|  12   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  13   | last_modify_by |   varchar   | 64 |   0    |    Y     |  N   |       | 最后修改人  |

**表名：** <a id="dim_caterb2b_dbus_rt_abnormal_indicator">dim_caterb2b_dbus_rt_abnormal_indicator</a>

**说明：** 非异指标表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | parent_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 父指标ID  |
|  3   | parent_name |   varchar   | 64 |   0    |    N     |  N   |       | 指标名称  |
|  4   | indicators_name |   varchar   | 64 |   0    |    N     |  N   |       | 指标名称  |
|  5   | indicators_level |   tinyint   | 4 |   0    |    N     |  N   |       | 指标级别  |
|  6   | indicators_desc |   varchar   | 255 |   0    |    N     |  N   |       | 指标描述  |
|  7   | priority_level |   tinyint   | 4 |   0    |    N     |  N   |       | 指标优先级  |
|  8   | istatus |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效，0无效，1有效  |
|  9   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  10   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最新更新时间  |
|  11   | create_by |   varchar   | 255 |   0    |    N     |  N   |       | 创建人名称  |
|  12   | last_modify_by |   varchar   | 255 |   0    |    N     |  N   |       | 最新操作人名称  |

**表名：** <a id="dim_caterb2b_dbus_rt_activity_seckill_scene">dim_caterb2b_dbus_rt_activity_seckill_scene</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |       | 秒杀活动外键  |
|  3   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部ID  |
|  4   | start_time |   datetime   | 23 |   0    |    N     |  N   |       | 开始时间，毫秒数  |
|  5   | end_time |   datetime   | 23 |   0    |    N     |  N   |       | 结束时间，毫秒数  |
|  6   | state |   tinyint   | 3 |   0    |    N     |  N   |   0    | 约束状态，1:未开始，2:活动中，3:已暂停，4:已结束，5:已取消，6:待提审，7:操作冻结  |
|  7   | seq_no |   tinyint   | 4 |   0    |    N     |  N   |   0    | 秒杀场次号  |
|  8   | ctime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  9   | create_acc |   varchar   | 100 |   0    |    N     |  N   |       | 创建人账号  |
|  10   | utime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  11   | update_acc |   varchar   | 100 |   0    |    N     |  N   |       | 更新人账号  |
|  12   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | dealer_id  |
|  13   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channel_id  |

**表名：** <a id="dim_caterb2b_dbus_rt_activity_seckill_scene_goods">dim_caterb2b_dbus_rt_activity_seckill_scene_goods</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |       | 秒杀活动外键  |
|  3   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |       | 秒杀活动场次外键  |
|  4   | csu_code |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  5   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | 事业部ID  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |   0    | skuCode  |
|  7   | ssu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 秒杀商品名称  |
|  8   | discount_price |   int   | 10 |   0    |    Y     |  N   |   0    | 折扣价格  |
|  9   | price_version |   tinyint   | 3 |   0    |    Y     |  N   |   1    | 价格版本  |
|  10   | poi_top |   int   | 10 |   0    |    Y     |  N   |   0    | 门店限购数量  |
|  11   | total_top |   int   | 10 |   0    |    Y     |  N   |   0    | 总限购数量  |
|  12   | remain_top |   int   | 10 |   0    |    Y     |  N   |   0    | 剩余限购数  |
|  13   | sort_num |   int   | 10 |   0    |    N     |  N   |   0    | 商品排序号  |
|  14   | version |   smallint   | 5 |   0    |    N     |  N   |   1    | 商品列表快照版本号  |
|  15   | price_type |   int   | 10 |   0    |    N     |  N   |   1    | 用户类型1-不区分；2-区分、新客价；3-区分、老客价  |
|  16   | lock_version |   int   | 10 |   0    |    N     |  N   |   1    | 秒杀商品锁版本  |
|  17   | deleted |   bit   | 1 |   0    |    N     |  N   |   1    | 删除标记1-正常2-删除  |
|  18   | ctime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  19   | utime |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_caterb2b_dbus_rt_category">dim_caterb2b_dbus_rt_category</a>

**说明：** SKU分类表,支持1/2/3级分类

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 分类ID  |
|  2   | parent_id |   int   | 10 |   0    |    N     |  N   |   0    | 父分类ID,根分类时为0  |
|  3   | name |   varchar   | 64 |   0    |    N     |  N   |       | 分类名  |
|  4   | level |   tinyint   | 3 |   0    |    N     |  N   |   0    | 层级，0为根分类  |
|  5   | leaf |   tinyint   | 3 |   0    |    N     |  N   |   0    | 是否是叶子分类，0=非叶子分类1=叶子分类  |
|  6   | sort |   smallint   | 5 |   0    |    N     |  N   |   0    | 排序值，值越小，排序越靠前  |
|  7   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  8   | test |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 0为正式数据，1为测试数据  |
|  9   | path |   varchar   | 64 |   0    |    N     |  N   |       | 菜单路径  |
|  10   | removed |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 1=删除，0=有效  |
|  11   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  12   | utime |   int   | 10 |   0    |    Y     |  N   |   0    | 更新时间  |

**表名：** <a id="dim_caterb2b_dbus_rt_cg_prices">dim_caterb2b_dbus_rt_cg_prices</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | city_id |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  3   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名  |
|  4   | county_id |   int   | 10 |   0    |    Y     |  N   |   0    | 区域ID  |
|  5   | county_name |   varchar   | 128 |   0    |    Y     |  N   |       | 区县名称  |
|  6   | csu_id |   int   | 10 |   0    |    N     |  N   |   0    | 商品的csuId  |
|  7   | sku_id |   int   | 10 |   0    |    N     |  N   |   0    | 商品的sku_id  |
|  8   | sales_price |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  9   | seckill_price |   int   | 10 |   0    |    Y     |  N   |   0    | 秒杀价,精确到分  |
|  10   | stime |   bigint   | 20 |   0    |    Y     |  N   |   0    | 秒杀开始时间,毫秒  |
|  11   | etime |   bigint   | 20 |   0    |    Y     |  N   |   0    | 秒杀结束时间,毫秒  |
|  12   | seckill_status |   tinyint   | 3 |   0    |    Y     |  N   |   1    | 秒杀状态0代表秒杀活动无效1代表秒杀活动有效  |
|  13   | promotion_price |   int   | 10 |   0    |    Y     |  N   |   0    | 促销价格精确到分  |
|  14   | promotion_id |   int   | 10 |   0    |    Y     |  N   |   0    | PromotionID,无促销时为0  |
|  15   | valid |   tinyint   | 3 |   0    |    N     |  N   |   1    | 0代表删除，1代表存在  |
|  16   | test |   tinyint   | 3 |   0    |    N     |  N   |   0    | 是否是测试数据。1表示是测试数据，0表示不是测试数据。默认是0  |
|  17   | ctime |   int   | 10 |   0    |    N     |  N   |   0    | 创建时间  |
|  18   | utime |   int   | 10 |   0    |    N     |  N   |   0    | 修改时间  |
|  19   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  20   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  21   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  22   | p_price |   int   | 10 |   0    |    N     |  N   |   0    |   |
|  23   | on_promotion |   tinyint   | 3 |   0    |    N     |  N   |   0    | 1促销中0不在促销中  |

**表名：** <a id="dim_caterb2b_dbus_rt_csu_info">dim_caterb2b_dbus_rt_csu_info</a>

**说明：** 销售单元

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | csu_code |   int   | 10 |   0    |    N     |  N   |       | csuCode  |
|  3   | sku_code |   int   | 10 |   0    |    N     |  N   |       | skuCode  |
|  4   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | baseSkuCode  |
|  5   | spu_code |   varchar   | 30 |   0    |    N     |  N   |       | spuCode  |
|  6   | spu_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 商品类型  |
|  7   | csu_unit |   varchar   | 32 |   0    |    N     |  N   |       | CSU单位  |
|  8   | csu_unit_id |   int   | 10 |   0    |    Y     |  N   |   0    | CSU单位ID  |
|  9   | csu_unit_desc |   varchar   | 128 |   0    |    N     |  N   |       | CSU规格说明  |
|  10   | sku_amt |   int   | 10 |   0    |    N     |  N   |   0    | 对应的SKU数量  |
|  11   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | dealerId  |
|  12   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  13   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1:正常0:删除  |
|  14   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  15   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |

**表名：** <a id="dim_caterb2b_dbus_rt_csu_sales_info">dim_caterb2b_dbus_rt_csu_sales_info</a>

**说明：** CSU售卖模式

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | csu_code |   int   | 10 |   0    |    N     |  N   |       | csuCode  |
|  3   | sku_code |   int   | 10 |   0    |    N     |  N   |       | skuCode  |
|  4   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | baseSkuCode  |
|  5   | spu_code |   varchar   | 30 |   0    |    N     |  N   |       | spuCode  |
|  6   | spu_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 商品类型  |
|  7   | bu_id |   int   | 10 |   0    |    N     |  N   |   0    | buId  |
|  8   | on_shelf |   bit   | 1 |   0    |    Y     |  N   |   3    | 运营上下架,1上架,0下架,3待上架  |
|  9   | sales_model_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 售卖模式：0:普通商品售卖1:赠品售卖  |
|  10   | order_quantity |   int   | 10 |   0    |    Y     |  N   |   0    | 起订量  |
|  11   | multi_order |   bit   | 1 |   0    |    Y     |  N   |   0    | 整数倍下单1:是0:否  |
|  12   | tags |   varchar   | 128 |   0    |    Y     |  N   |       | 标签,逗号分割  |
|  13   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | dealerId  |
|  14   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  15   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1:正常0:删除  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  17   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |

**表名：** <a id="dim_caterb2b_dbus_rt_dam_org">dim_caterb2b_dbus_rt_dam_org</a>

**说明：** 组织机构节点信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 50 |   0    |    Y     |  N   |       | 组织机构节点名称  |
|  3   | parent_id |   int   | 10 |   0    |    Y     |  N   |   0    | 父组织机构，0表示父节点  |
|  4   | org_type |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  5   | off_line_date |   int   | 10 |   0    |    Y     |  N   |   0    | 组织机构下线日期  |
|  6   | removed |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否删除：1是，0否  |
|  7   | ctime |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | utime |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  10   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |

**表名：** <a id="dim_caterb2b_dbus_rt_dam_user">dim_caterb2b_dbus_rt_dam_user</a>

**说明：** 用户信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | mtid |   varchar   | 64 |   0    |    N     |  N   |       | mtid(login)  |
|  3   | name |   varchar   | 64 |   0    |    Y     |  N   |       | 姓名  |
|  4   | entityType |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 用户类型  |
|  5   | valid |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 1:有效；0:无效  |
|  6   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  7   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  8   | ep_id |   int   | 10 |   0    |    Y     |  N   |   0    | epassportid  |
|  9   | ep_acc |   varchar   | 64 |   0    |    Y     |  N   |       | epassportname  |
|  10   | mis_id |   int   | 10 |   0    |    Y     |  N   |   0    | mis账号id  |
|  11   | portal_id |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |
|  12   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    |   |

**表名：** <a id="dim_caterb2b_dbus_rt_dam_user_account">dim_caterb2b_dbus_rt_dam_user_account</a>

**说明：** 用户账号表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | user_id |   int   | 10 |   0    |    Y     |  N   |       | 用户id  |
|  3   | account_id |   bigint   | 20 |   0    |    Y     |  N   |       | 账号id  |
|  4   | account_type |   int   | 10 |   0    |    Y     |  N   |       | 账号类型：1代表：mis2代表：passport3代表：epassport  |
|  5   | account_name |   varchar   | 50 |   0    |    Y     |  N   |       | 账号名称  |
|  6   | account_status |   int   | 10 |   0    |    Y     |  N   |       | 账号的状态  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 账号的创建时间  |
|  8   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 账号修改时间  |
|  9   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 1001正式渠道账号1003虚拟渠道账号  |

**表名：** <a id="dim_caterb2b_dbus_rt_dam_user_pos">dim_caterb2b_dbus_rt_dam_user_pos</a>

**说明：** 用户岗位信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | user_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  3   | org_id |   int   | 10 |   0    |    N     |  N   |       | 用户岗位所在组织机构  |
|  4   | pos_code |   varchar   | 30 |   0    |    N     |  N   |       | 岗位  |
|  5   | org_pos_id |   int   | 10 |   0    |    Y     |  N   |       | 组织结构节点岗位id  |
|  6   | join_date |   int   | 10 |   0    |    Y     |  N   |       | 加入日期  |
|  7   | removed |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否删除：1是，0否  |
|  8   | ctime |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | utime |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  11   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |

**表名：** <a id="dim_caterb2b_dbus_rt_item_promo_detail">dim_caterb2b_dbus_rt_item_promo_detail</a>

**说明：** 商品级别促销信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | order_item_id |   bigint   | 20 |   0    |    Y     |  N   |       | 订单ID  |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | csu_id |   int   | 10 |   0    |    Y     |  N   |       | 商品CSUCode  |
|  5   | promo_id |   int   | 10 |   0    |    N     |  N   |       | 优惠促销ID  |
|  6   | promo_name |   varchar   | 255 |   0    |    N     |  N   |       | 优惠名称  |
|  7   | promo_amount |   decimal   | 13 |   2    |    N     |  N   |   0.00    | 优惠金额  |
|  8   | promo_type |   tinyint   | 3 |   0    |    N     |  N   |       | 促销类型:1-促销，2-优惠券，3-赠品，4-折扣，5-满减，6-秒杀  |
|  9   | promo_scope |   tinyint   | 3 |   0    |    Y     |  N   |       | 促销影响范围:1-平台单品，2-平台订单，3-经销商订单  |
|  10   | promo_content |   text   | 65535 |   0    |    Y     |  N   |       | 优惠信息（mbc获取的obj的jsonstring）  |
|  11   | returned |   tinyint   | 4 |   0    |    Y     |  N   |   0    | 是否已归还:1-是，0-否  |
|  12   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  13   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_caterb2b_dbus_rt_poi">dim_caterb2b_dbus_rt_poi</a>

**说明：** 门店信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | poi_name |   varchar   | 255 |   0    |    N     |  N   |       | 门店名称  |
|  3   | bus_area |   varchar   | 60 |   0    |    N     |  N   |       | 所在商圈  |
|  4   | first_cat_id |   int   | 10 |   0    |    N     |  N   |   0    | 一级分类id  |
|  5   | second_cat_id |   int   | 10 |   0    |    N     |  N   |   0    | 二级分类id  |
|  6   | first_cat_name |   varchar   | 60 |   0    |    N     |  N   |       | 一级分类name  |
|  7   | second_cat_name |   varchar   | 60 |   0    |    N     |  N   |       | 二级分类name  |
|  8   | province_id |   int   | 10 |   0    |    N     |  N   |   0    | 省份id  |
|  9   | province_name |   varchar   | 128 |   0    |    N     |  N   |       | 省份名称  |
|  10   | city_id |   int   | 10 |   0    |    N     |  N   |   0    | 市id  |
|  11   | county_id |   int   | 10 |   0    |    N     |  N   |   0    | 区id  |
|  12   | city_name |   varchar   | 60 |   0    |    N     |  N   |       | 市名  |
|  13   | county_name |   varchar   | 60 |   0    |    N     |  N   |       | 区名  |
|  14   | street |   varchar   | 255 |   0    |    N     |  N   |       | 街道  |
|  15   | house_no |   varchar   | 255 |   0    |    N     |  N   |       | 门牌号  |
|  16   | map_poi_name |   varchar   | 255 |   0    |    N     |  N   |       | 地图Poi名称  |
|  17   | address |   varchar   | 512 |   0    |    N     |  N   |       |   |
|  18   | longitude |   double   | 10 |   6    |    N     |  N   |   0.000000    | 商家位置经度  |
|  19   | latitude |   double   | 10 |   6    |    N     |  N   |   0.000000    | 商家位置纬度  |
|  20   | distance |   int   | 10 |   0    |    N     |  N   |   0    | 地址与坐标之间距离  |
|  21   | poi_source |   smallint   | 6 |   0    |    N     |  N   |   1    | 客户来源1:BD创建,2:外卖商家,3:自注册  |
|  22   | poi_status |   smallint   | 6 |   0    |    N     |  N   |   2    | 门店状态1.未绑定、2已绑定、3无效  |
|  23   | waimai_poi_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 外卖门店id  |
|  24   | mdc_id |   bigint   | 20 |   0    |    N     |  N   |   0    | MDCid  |
|  25   | guide_desc |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  26   | guide_url |   varchar   | 1024 |   0    |    N     |  N   |       |   |
|  27   | wm_poi_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 外卖ID  |
|  28   | wm_bind |   smallint   | 6 |   0    |    N     |  N   |   1    | 是否关联外卖门店：1未关联，2关联  |
|  29   | poi_type |   smallint   | 6 |   0    |    N     |  N   |   1    | poi类型，1-门店；2-仓库  |
|  30   | poi_tag |   smallint   | 6 |   0    |    N     |  N   |   0    | 门店标签  |
|  31   | business_type_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 商户分类，对应mccpoi.business.type配置  |
|  32   | business_pattern |   smallint   | 6 |   0    |    N     |  N   |   0    | 经营模式0未选择1:单店2:加盟连锁店3:直营连锁店  |
|  33   | business_start_time |   time   | 8 |   0    |    Y     |  N   |       | 经营开始时间  |
|  34   | business_end_time |   time   | 8 |   0    |    Y     |  N   |       | 经营结束时间  |
|  35   | poi_position_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 店面类型,0,未选择1,沿街店2,美食城店3,商场店  |
|  36   | poi_state |   smallint   | 6 |   0    |    N     |  N   |   0    | 门店状态0正常1关闭  |
|  37   | close_reason |   varchar   | 255 |   0    |    N     |  N   |       | 关闭原因  |
|  38   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  39   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  40   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  41   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  42   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  43   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="dim_caterb2b_dbus_rt_poi_delivery_guide">dim_caterb2b_dbus_rt_poi_delivery_guide</a>

**说明：** 门店配送引导表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | poi_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 关联门店id  |
|  3   | climb_stairs |   bit   | 1 |   0    |    N     |  N   |   0    | 是否爬梯送货0：不爬梯1：爬梯送货  |
|  4   | floor |   int   | 10 |   0    |    Y     |  N   |       | 楼层  |
|  5   | expect_delivery_time_start |   time   | 8 |   0    |    Y     |  N   |       | 期望收货时间开始  |
|  6   | expect_delivery_time_end |   time   | 8 |   0    |    Y     |  N   |       | 期望收货时间结束  |
|  7   | sub_expect_delivery_time_start |   time   | 8 |   0    |    Y     |  N   |       | 备选收货时间开始  |
|  8   | sub_expect_delivery_time_end |   time   | 8 |   0    |    Y     |  N   |       | 备选收货时间结束  |
|  9   | delivery_remark |   varchar   | 255 |   0    |    N     |  N   |       | 配送备注  |
|  10   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  11   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  13   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  15   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="dim_caterb2b_dbus_rt_rac_org_node">dim_caterb2b_dbus_rt_rac_org_node</a>

**说明：** 具体机构节点信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | org_name |   varchar   | 50 |   0    |    Y     |  N   |       | 机构名  |
|  3   | org_type_code |   varchar   | 30 |   0    |    N     |  N   |       | 节点类型编码  |
|  4   | org_entity_type |   int   | 10 |   0    |    Y     |  N   |   0    | 机构人员类型  |
|  5   | parent_id |   int   | 10 |   0    |    Y     |  N   |   0    | 父组织机构，0表示根父节点  |
|  6   | org_path |   varchar   | 256 |   0    |    N     |  N   |       | 路径  |
|  7   | org_tree_code |   varchar   | 30 |   0    |    N     |  N   |       | 组织编码  |
|  8   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  9   | update_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  10   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  11   | valid |   int   | 10 |   0    |    Y     |  N   |   1    |   |
|  12   | sp_id |   int   | 10 |   0    |    Y     |  N   |       | 服务商id（三方公司id）  |
|  13   | is_virtual |   int   | 10 |   0    |    Y     |  N   |   0    | 是否虚拟节点  |
|  14   | actual_org_id |   int   | 10 |   0    |    Y     |  N   |       | 虚拟节点实际对应的真实节点  |

**表名：** <a id="dim_caterb2b_dbus_rt_rac_org_pos_user">dim_caterb2b_dbus_rt_rac_org_pos_user</a>

**说明：** 机构-岗位-人员关联表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | user_id |   int   | 10 |   0    |    N     |  N   |       | 用户id  |
|  3   | org_id |   int   | 10 |   0    |    N     |  N   |       | 机构id  |
|  4   | pos_code |   varchar   | 30 |   0    |    N     |  N   |       | 岗位编码  |
|  5   | pos_duty_type |   int   | 10 |   0    |    Y     |  N   |   1    | 职务类型  |
|  6   | org_tree_code |   varchar   | 30 |   0    |    N     |  N   |       | 组织编码  |
|  7   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  8   | update_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  9   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  10   | valid |   int   | 10 |   0    |    Y     |  N   |   1    |   |

**表名：** <a id="dim_caterb2b_dbus_rt_rac_org_type_meta">dim_caterb2b_dbus_rt_rac_org_type_meta</a>

**说明：** 节点类型表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | org_type_name |   varchar   | 50 |   0    |    Y     |  N   |       | 节点类型名  |
|  3   | org_type_code |   varchar   | 30 |   0    |    Y     |  N   |       | 节点类型编码  |
|  4   | org_type_level |   int   | 10 |   0    |    Y     |  N   |       | 节点级别  |
|  5   | is_bind_city |   bit   | 1 |   0    |    Y     |  N   |   b'0'    | 是否绑定城市  |
|  6   | org_tree_code |   varchar   | 30 |   0    |    Y     |  N   |       | 组织编码  |
|  7   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  8   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  9   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 更新时间  |
|  10   | valid |   int   | 10 |   0    |    Y     |  N   |   1    |   |
|  11   | is_bind_third_corp |   bit   | 1 |   0    |    Y     |  N   |   b'0'    | 是否包含外部三方公司  |

**表名：** <a id="dim_caterb2b_dbus_rt_service_provider">dim_caterb2b_dbus_rt_service_provider</a>

**说明：** 服务商表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 服务商名称  |
|  4   | contact_name |   varchar   | 45 |   0    |    Y     |  N   |       | 联系人  |
|  5   | contact_phone |   varchar   | 64 |   0    |    Y     |  N   |       | 联系电话  |
|  6   | address |   varchar   | 512 |   0    |    Y     |  N   |       | 地址  |
|  7   | short_name |   varchar   | 32 |   0    |    N     |  N   |       | 简称  |
|  8   | service_provider_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 承运商类型0：类型未执行，1:服务商，2:承运商  |
|  9   | remark |   varchar   | 512 |   0    |    Y     |  N   |       | 备注  |
|  10   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除0.删除1正常  |
|  11   | istest |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否测试1：测试仓库0：正式仓库  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    |   |
|  13   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    |   |
|  15   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  16   | cooperation_mode |   smallint   | 6 |   0    |    N     |  N   |   0    |   |

**表名：** <a id="dim_caterb2b_dbus_rt_sku">dim_caterb2b_dbus_rt_sku</a>

**说明：** SKU表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | sku_code |   int   | 10 |   0    |    N     |  Y   |       | SKUcode  |
|  2   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | cat1_id  |
|  3   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | cat2_id  |
|  4   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | cat3_id  |
|  5   | spu_code |   varchar   | 30 |   0    |    Y     |  N   |       | spuCode  |
|  6   | spu_type |   int   | 10 |   0    |    Y     |  N   |   100    | 商品类型  |
|  7   | name |   varchar   | 255 |   0    |    Y     |  N   |       | SPU名称  |
|  8   | brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  9   | brand_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 品牌ID  |
|  10   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | SKU单位  |
|  11   | sku_unit_id |   int   | 10 |   0    |    Y     |  N   |   0    | sku规格ID  |
|  12   | sku_unit_type |   int   | 10 |   0    |    Y     |  N   |   100    | 整散整100散200  |
|  13   | sku_unit_desc |   varchar   | 128 |   0    |    Y     |  N   |       | SKU规格说明  |
|  14   | base_unit |   varchar   | 128 |   0    |    Y     |  N   |       | 基本规格说明  |
|  15   | conversion_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 转换率  |
|  16   | sku_barcode |   varchar   | 320 |   0    |    Y     |  N   |       | sku条形码  |
|  17   | sku_description |   varchar   | 255 |   0    |    Y     |  N   |       | SKU详情  |
|  18   | pic_urls |   varchar   | 4096 |   0    |    Y     |  N   |       | 图片地址列表,以逗号分割  |
|  19   | video_url |   varchar   | 1024 |   0    |    Y     |  N   |       | 视频地址  |
|  20   | test |   int   | 10 |   0    |    Y     |  N   |   0    | 0为正式数据，1为测试数据  |
|  21   | removed |   int   | 10 |   0    |    Y     |  N   |   0    | 1=删除，0=有效  |
|  22   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  23   | utime |   int   | 10 |   0    |    Y     |  N   |   0    | 更新时间  |
|  24   | creator_id |   varchar   | 32 |   0    |    Y     |  N   |       | 创建人  |
|  25   | updater_id |   varchar   | 32 |   0    |    Y     |  N   |       | 更新人  |
|  26   | creator_name |   varchar   | 32 |   0    |    Y     |  N   |       | 创建者姓名  |
|  27   | updater_name |   varchar   | 32 |   0    |    Y     |  N   |       | 更新者姓名  |
|  28   | gross_weight |   int   | 10 |   0    |    Y     |  N   |   0    | 毛重,单位:克  |
|  29   | stack_quantity |   int   | 10 |   0    |    Y     |  N   |   0    | 码板标准  |
|  30   | net_weight |   int   | 10 |   0    |    Y     |  N   |   0    | 净重,单位克  |
|  31   | length |   int   | 10 |   0    |    Y     |  N   |   0    | 长单位毫米  |
|  32   | width |   int   | 10 |   0    |    Y     |  N   |   0    | 宽单位毫米  |
|  33   | height |   int   | 10 |   0    |    Y     |  N   |   0    | 高单位毫米  |
|  34   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | 转换率为1的skuId  |
|  35   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  36   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 经销商Id  |

**表名：** <a id="dim_caterb2b_dbus_rt_sku_info">dim_caterb2b_dbus_rt_sku_info</a>

**说明：** SKU信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | sku_code |   int   | 10 |   0    |    N     |  N   |   0    | SKU编码  |
|  3   | spu_code |   varchar   | 30 |   0    |    N     |  N   |       | 商品编码  |
|  4   | seller_id |   int   | 10 |   0    |    N     |  N   |   0    | 卖家ID，自营默认为0  |
|  5   | sku_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 商品类别:100成品,200包装物,300原材料  |
|  6   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 主包装规格编码  |
|  7   | conversion_factor |   int   | 10 |   0    |    N     |  N   |   0    | 转换率  |
|  8   | base_unit |   varchar   | 128 |   0    |    N     |  N   |       | 基本规格说明  |
|  9   | sku_unit |   varchar   | 32 |   0    |    N     |  N   |       | SKU单位  |
|  10   | sku_unit_id |   int   | 10 |   0    |    N     |  N   |   0    | SKU单位ID  |
|  11   | sku_unit_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 整散类型整100散200  |
|  12   | sku_unit_desc |   varchar   | 128 |   0    |    N     |  N   |       | SKU规格说明  |
|  13   | gross_weight |   int   | 10 |   0    |    N     |  N   |   0    | 毛重,单位:克  |
|  14   | net_weight |   int   | 10 |   0    |    N     |  N   |   0    | 净重,单位克  |
|  15   | sku_net_weight |   decimal   | 17 |   5    |    N     |  N   |   0.00000    | sku净重  |
|  16   | sku_status |   smallint   | 6 |   0    |    N     |  N   |   100    | 状态:100正常,200已废弃  |
|  17   | sort |   int   | 10 |   0    |    N     |  N   |   0    | 序号  |
|  18   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  19   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 经销商Id  |
|  20   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除:0删除,1有效  |
|  21   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  22   | create_by |   varchar   | 45 |   0    |    N     |  N   |       | 创建者  |
|  23   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  24   | last_modify_by |   varchar   | 45 |   0    |    N     |  N   |       | 修改者  |
|  25   | version |   int   | 10 |   0    |    N     |  N   |   0    | 版本号  |
|  26   | sku_name |   varchar   | 500 |   0    |    N     |  N   |       | SKU名称  |

**表名：** <a id="dim_caterb2b_dbus_rt_spu">dim_caterb2b_dbus_rt_spu</a>

**说明：** SPU表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | spu_code |   varchar   | 30 |   0    |    N     |  Y   |       | spuCode  |
|  2   | spu_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 商品类型  |
|  3   | cat1_id |   int   | 10 |   0    |    N     |  N   |       | cat1_id  |
|  4   | cat2_id |   int   | 10 |   0    |    N     |  N   |       | cat2_id  |
|  5   | cat3_id |   int   | 10 |   0    |    N     |  N   |       | cat3_id  |
|  6   | name |   varchar   | 255 |   0    |    N     |  N   |       | SPU名称  |
|  7   | alias_name |   varchar   | 255 |   0    |    Y     |  N   |       | SPU别名  |
|  8   | brand |   varchar   | 64 |   0    |    N     |  N   |       | 品牌  |
|  9   | brand_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 品牌ID  |
|  10   | ingredient |   text   | 65535 |   0    |    Y     |  N   |       | 配料  |
|  11   | produce_place |   varchar   | 64 |   0    |    Y     |  N   |       | 产地  |
|  12   | storage |   varchar   | 64 |   0    |    N     |  N   |       | 1常温，2冷冻，3冷藏或冷冻  |
|  13   | transport |   varchar   | 64 |   0    |    Y     |  N   |       | 运输方式  |
|  14   | shelf_life |   varchar   | 255 |   0    |    N     |  N   |       | 保质期  |
|  15   | shelf_life_unit |   smallint   | 6 |   0    |    N     |  N   |   100    | 保质期单位  |
|  16   | shelf_life_number |   int   | 10 |   0    |    N     |  N   |   0    | 保质期数字  |
|  17   | storage_condition |   varchar   | 255 |   0    |    Y     |  N   |       | 贮存条件  |
|  18   | cooking_method |   text   | 65535 |   0    |    Y     |  N   |       | 烹饪方法  |
|  19   | video_url |   varchar   | 1024 |   0    |    Y     |  N   |       | 烹饪视频URL  |
|  20   | quality_standard |   text   | 65535 |   0    |    Y     |  N   |       | 质量标准  |
|  21   | product_licence_code |   varchar   | 50 |   0    |    Y     |  N   |       | 生产许可证编码  |
|  22   | product_standard_code |   varchar   | 50 |   0    |    Y     |  N   |       | 产品标准号  |
|  23   | manufacturer |   varchar   | 50 |   0    |    Y     |  N   |       | 生产厂商  |
|  24   | dealer_spu_code |   varchar   | 30 |   0    |    N     |  N   |       | 经销商商品编码  |
|  25   | tax_rate |   decimal   | 3 |   2    |    N     |  N   |   -0.10    | 税率  |
|  26   | pic_urls |   varchar   | 1024 |   0    |    N     |  N   |       | 图片URL  |
|  27   | desc_pic_urls |   varchar   | 4096 |   0    |    N     |  N   |       | 详情图  |
|  28   | nutrient_pic_urls |   varchar   | 1024 |   0    |    Y     |  N   |       | 营养成分表图片URL  |
|  29   | quality_pic_urls |   varchar   | 1024 |   0    |    Y     |  N   |       | 质检报告图片URL  |
|  30   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  31   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 经销商Id  |
|  32   | test |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 0为正式数据，1为测试数据  |
|  33   | removed |   tinyint   | 3 |   0    |    Y     |  N   |   0    | 1=删除，0=有效  |
|  34   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  35   | utime |   int   | 10 |   0    |    Y     |  N   |   0    | 更新时间  |
|  36   | creator_id |   varchar   | 32 |   0    |    Y     |  N   |       | 创建人  |
|  37   | updater_id |   varchar   | 32 |   0    |    Y     |  N   |       | 更新人  |
|  38   | creator_name |   varchar   | 32 |   0    |    N     |  N   |       | 创建者姓名  |
|  39   | updater_name |   varchar   | 32 |   0    |    N     |  N   |       | 更新者姓名  |
|  40   | unify_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 统一品类型：0正常商品100重复品  |

**表名：** <a id="dim_caterb2b_dbus_rt_spu_info">dim_caterb2b_dbus_rt_spu_info</a>

**说明：** 商品信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | spu_code |   varchar   | 30 |   0    |    N     |  N   |       | 商品编码  |
|  3   | seller_id |   int   | 10 |   0    |    N     |  N   |   0    | 卖家ID，自营默认为0  |
|  4   | name |   varchar   | 255 |   0    |    N     |  N   |       | 商品名称  |
|  5   | spu_type |   smallint   | 6 |   0    |    N     |  N   |   100    | 商品类型  |
|  6   | cat1_id |   int   | 10 |   0    |    N     |  N   |       | 一级类目ID  |
|  7   | cat2_id |   int   | 10 |   0    |    N     |  N   |       | 二级类目ID  |
|  8   | cat3_id |   int   | 10 |   0    |    N     |  N   |       | 三级类目ID  |
|  9   | cat_id |   int   | 10 |   0    |    N     |  N   |   0    | 所属类目ID  |
|  10   | cat_path |   varchar   | 64 |   0    |    N     |  N   |       | 后台类目路径  |
|  11   | brand |   varchar   | 64 |   0    |    N     |  N   |       | 品牌  |
|  12   | brand_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 品牌ID  |
|  13   | produce_place |   varchar   | 64 |   0    |    N     |  N   |       | 产地  |
|  14   | storage_condition |   varchar   | 255 |   0    |    Y     |  N   |       | 贮存条件  |
|  15   | storage |   varchar   | 64 |   0    |    N     |  N   |       | 存储方式  |
|  16   | transport |   varchar   | 64 |   0    |    N     |  N   |       | 运输方式  |
|  17   | shelf_life_unit |   smallint   | 6 |   0    |    N     |  N   |   100    | 保质期单位  |
|  18   | shelf_life_number |   int   | 10 |   0    |    N     |  N   |   0    | 保质期数字  |
|  19   | unify_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 统一品类型:0正常商品,100重复品  |
|  20   | spu_status |   smallint   | 6 |   0    |    N     |  N   |   100    | 废弃状态:100正常,200已废弃  |
|  21   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | channelId  |
|  22   | dealer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 经销商Id  |
|  23   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除:0删除,1有效  |
|  24   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  25   | create_by |   varchar   | 45 |   0    |    N     |  N   |       | 创建者  |
|  26   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  27   | last_modify_by |   varchar   | 45 |   0    |    N     |  N   |       | 修改者  |
|  28   | version |   int   | 10 |   0    |    N     |  N   |   0    | 版本号  |

**表名：** <a id="dim_caterb2b_dbus_rt_warehouse_sku_info">dim_caterb2b_dbus_rt_warehouse_sku_info</a>

**说明：** sku基本信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库Id  |
|  4   | warehouse_code |   varchar   | 64 |   0    |    N     |  N   |       | 仓库编码  |
|  5   | warehouse_name |   varchar   | 64 |   0    |    N     |  N   |       | 仓库名称  |
|  6   | origin_sku_code |   int   | 10 |   0    |    N     |  N   |       | 原规格sku编码  |
|  7   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  8   | outer_packing_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 外包装转化率（箱规）  |
|  9   | sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 销售模式现货销售：0，无库存销售(预售)：1  |
|  10   | sale_mode_time_stamp |   bigint   | 20 |   0    |    N     |  N   |   0    | 销售模式最后更新时间戳  |
|  11   | sku_pack_spec |   int   | 10 |   0    |    N     |  N   |       | 包装规格  |
|  12   | account_spec_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 结算转化率类型：0系统结算转化率、1本仓结算转化率  |
|  13   | sku_category1_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 一级分类ID  |
|  14   | sku_category2_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 二级分类ID  |
|  15   | sku_category3_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 三级分类ID  |
|  16   | sku_category1_name |   varchar   | 64 |   0    |    N     |  N   |       | 一级分类名称  |
|  17   | sku_category2_name |   varchar   | 64 |   0    |    N     |  N   |       | 二级分类名称  |
|  18   | sku_category3_name |   varchar   | 64 |   0    |    N     |  N   |       | 三级分类名称  |
|  19   | sku_brand_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 品牌ID  |
|  20   | sku_brand |   varchar   | 64 |   0    |    N     |  N   |       | 品牌  |
|  21   | sku_name |   varchar   | 64 |   0    |    N     |  N   |       | 名称  |
|  22   | sku_properties |   varchar   | 512 |   0    |    N     |  N   |       | 属性信息  |
|  23   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 单位  |
|  24   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 单位描述  |
|  25   | sku_gross_weight |   decimal   | 11 |   3    |    N     |  N   |   0.000    | 毛重  |
|  26   | sku_net_weight |   decimal   | 11 |   3    |    N     |  N   |   0.000    | 净重  |
|  27   | sku_length |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 长：cm  |
|  28   | sku_width |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 宽：cm  |
|  29   | sku_height |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 高：cm  |
|  30   | sku_stack_qty |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 码板标准  |
|  31   | remedy_model |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否多退少补：0否，1是  |
|  32   | sku_barcode |   varchar   | 320 |   0    |    N     |  N   |       | 条形码  |
|  33   | storage_type |   smallint   | 6 |   0    |    N     |  N   |       | 贮存方式  |
|  34   | job_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 作业温层（计费）常温：1、冷藏：2、冷冻：3  |
|  35   | warehouse_category |   smallint   | 6 |   0    |    Y     |  N   |       | 仓储品类：1标品，2蔬菜  |
|  36   | transport_category |   smallint   | 6 |   0    |    Y     |  N   |       | 商品运输品类：1标品、2蔬菜、3鲜肉  |
|  37   | transport_type |   varchar   | 64 |   0    |    N     |  N   |       | 运输方式  |
|  38   | sku_shelf_life |   int   | 10 |   0    |    N     |  N   |   0    | 保质期  |
|  39   | sku_production_place |   varchar   | 64 |   0    |    N     |  N   |       | 产地  |
|  40   | receive_change_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 接收到商品信息变更时间:SSC发送MQ,手动触发同步  |
|  41   | warehouse_process_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否库内加工0:否1:是  |
|  42   | product_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 商品类型0:成品1:原料  |
|  43   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  44   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  45   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建人  |
|  46   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |
|  47   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 最后更新人  |
|  48   | sku_volume |   decimal   | 11 |   6    |    Y     |  N   |       | 体积:立方米(小数点保留6位)  |
|  49   | sku_type |   int   | 10 |   0    |    Y     |  N   |       | 商品类型,100:正常商品，200：包装物，300：原材料  |
|  50   | sku_status |   int   | 10 |   0    |    Y     |  N   |       | 商品状态,100：正常200：已废弃  |
|  51   | sale_status |   int   | 10 |   0    |    Y     |  N   |       | 售卖状态,100:待上架，200：售卖中，300：已下架  |
|  52   | unify_type |   int   | 10 |   0    |    Y     |  N   |       | 统一品标识：200重复品100标准品0正常商品  |

**表名：** <a id="dim_caterb2b_delivery_region">dim_caterb2b_delivery_region</a>

**说明：** 快驴-配送区域表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 区域名称  |
|  4   | region_code |   varchar   | 32 |   0    |    Y     |  N   |       | 区域编码  |
|  5   | service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 履约服务商  |
|  6   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  7   | enable_status |   int   | 10 |   0    |    Y     |  N   |       | 是否开启0未启用1启用  |
|  8   | ensure_time |   int   | 10 |   0    |    Y     |  N   |       | 是否保证时效性0不保证1保证  |
|  9   | start_price |   bigint   | 20 |   0    |    Y     |  N   |       | 起送价  |
|  10   | priority_level |   int   | 10 |   0    |    Y     |  N   |       | 区域优先级  |
|  11   | supervisor |   varchar   | 16 |   0    |    Y     |  N   |       | 责任主管  |
|  12   | account_name |   varchar   | 64 |   0    |    Y     |  N   |       | 责任主管mis号  |
|  13   | sign_mode |   int   | 10 |   0    |    Y     |  N   |       | 区域签收方式0:未知1:面签2:非面签3:面签、非面签  |
|  14   | remark |   varchar   | 128 |   0    |    Y     |  N   |       | 备注  |
|  15   | istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | create_by |   varchar   | 64 |   0    |    Y     |  N   |       | 创建人名称  |
|  18   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |
|  19   | update_by |   varchar   | 64 |   0    |    Y     |  N   |       | 最后修改人  |

**表名：** <a id="dim_caterb2b_delivery_warehouse_times">dim_caterb2b_delivery_warehouse_times</a>

**说明：** 仓履约时段表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | istatus |   int   | 10 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  4   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库ID  |
|  5   | start_time |   varchar   | 16 |   0    |    N     |  N   |   00:00    | 履约开始时间，24时制  |
|  6   | end_time |   varchar   | 16 |   0    |    N     |  N   |   01:00    | 履约终止时间，24时制  |
|  7   | type |   int   | 10 |   0    |    N     |  N   |   0    | 履约时段适用范围1：普通订单：2：大宗订单：3：补货单；4：换货单  |
|  8   | common_label |   bit   | 1 |   0    |    N     |  N   |   0    | 是否为通用时段，默认为否  |
|  9   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  10   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  11   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 最后修改时间  |
|  12   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="dim_caterb2b_fresh_authority">dim_caterb2b_fresh_authority</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | employee_id |   bigint   | 20 |   0    |    N     |  N   |       | 人员id  |
|  3   | mis_id |   varchar   | 50 |   0    |    Y     |  N   |       | mis_id  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |

**表名：** <a id="dim_caterb2b_organization_level">dim_caterb2b_organization_level</a>

**说明：** B2B组织机构节点关系平铺表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | org_id |   bigint   | 20 |   0    |    N     |  Y   |       | 小组节点ID  |
|  2   | org_name |   varchar   | 64 |   0    |    Y     |  N   |       | 小组节点名称  |
|  3   | zone_id |   bigint   | 20 |   0    |    Y     |  N   |       | 分区节点ID  |
|  4   | zone_name |   varchar   | 64 |   0    |    Y     |  N   |       | 分区节点名称  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市节点ID  |
|  6   | city_name |   varchar   | 64 |   0    |    Y     |  N   |       | 城市节点名称  |
|  7   | region_id |   bigint   | 20 |   0    |    Y     |  N   |       | 大区节点ID  |
|  8   | region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 大区节点名称  |

**表名：** <a id="dim_caterb2b_region_bu">dim_caterb2b_region_bu</a>

**说明：** 快驴-事业部和大区映射维表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增id  |
|  2   | region_id |   int   | 10 |   0    |    N     |  N   |       | 大区id  |
|  3   | region_name |   varchar   | 128 |   0    |    Y     |  N   |       | 大区名称  |
|  4   | bu_id |   int   | 10 |   0    |    N     |  N   |       | 事业部id  |
|  5   | bu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 事业部名称  |
|  6   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 添加时间  |
|  7   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_caterb2b_rt_bd_detail">dim_caterb2b_rt_bd_detail</a>

**说明：** 快驴事业部-RAC组织结构人员实时信息数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | region_id |   int   | 10 |   0    |    Y     |  N   |       | 战区ID  |
|  2   | region_name |   varchar   | 128 |   0    |    Y     |  N   |       | 战区名称  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-BMS事业部ID  |
|  4   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-BMS事业部名称  |
|  5   | rac_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-RAC事业部ID  |
|  6   | rac_bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-RAC事业部名称  |
|  7   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-BMS城市ID  |
|  8   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-BMS城市名称  |
|  9   | rac_city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-RAC城市ID  |
|  10   | rac_city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-RAC城市名称  |
|  11   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 分区ID  |
|  12   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 分区名称  |
|  13   | group_id |   int   | 10 |   0    |    Y     |  N   |       | 销售组ID  |
|  14   | group_name |   varchar   | 128 |   0    |    Y     |  N   |       | 销售组名称  |
|  15   | bdm_id |   int   | 10 |   0    |    Y     |  N   |       | BDMID  |
|  16   | bdm_employee_id |   int   | 10 |   0    |    Y     |  N   |       | BDM-EmployeeID原名bd_info_id  |
|  17   | bdm_mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-MISNAME  |
|  18   | bdm_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-姓名  |
|  19   | bd_id |   int   | 10 |   0    |    N     |  Y   |   0    | BDID  |
|  20   | bd_employee_id |   int   | 10 |   0    |    Y     |  N   |       | BD-EmployeeID原名bd_info_id  |
|  21   | mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD-MISNAME  |
|  22   | bd_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD姓名  |
|  23   | pos_code |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位ID  |
|  24   | pos_name |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位名称  |
|  25   | process_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  26   | is_incumbency |   int   | 10 |   0    |    N     |  N   |   0    | 是否在职  |
|  27   | state_maintain |   int   | 10 |   0    |    N     |  N   |   0    | 是否继续维护  |

**表名：** <a id="dim_caterb2b_rt_category_level3">dim_caterb2b_rt_category_level3</a>

**说明：** B2B业务部,后台3级分类表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级分类ID  |
|  2   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级分类名  |
|  3   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级分类ID  |
|  4   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级分类名  |
|  5   | cat3_id |   int   | 10 |   0    |    N     |  Y   |   0    | 三级分类ID  |
|  6   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级分类名  |
|  7   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |

**表名：** <a id="dim_caterb2b_rt_csu">dim_caterb2b_rt_csu</a>

**说明：** 快驴csu信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | csu_id  |
|  2   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级分类id  |
|  3   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级分类名称  |
|  4   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级分类id  |
|  5   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级分类名称  |
|  6   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | 三级分类id  |
|  7   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级分类名称  |
|  8   | csu_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu名称  |
|  9   | csu_alias_name |   varchar   | 64 |   0    |    Y     |  N   |       | csu别名  |
|  10   | sku_id |   int   | 10 |   0    |    Y     |  N   |       | sku_id  |
|  11   | csu_produce_place |   varchar   | 64 |   0    |    Y     |  N   |       | 产地  |
|  12   | csu_storage |   varchar   | 64 |   0    |    Y     |  N   |       | 存储方式  |
|  13   | csu_transport |   varchar   | 64 |   0    |    Y     |  N   |       | 运输方式  |
|  14   | csu_shelf_life |   varchar   | 64 |   0    |    Y     |  N   |       | 保质期  |
|  15   | brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  16   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | sku规格  |
|  17   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  18   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       | 经销商id  |
|  19   | sku_amt |   int   | 10 |   0    |    N     |  N   |   0    | 对应的SKU数量  |
|  20   | sku_conversion_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 转换率  |
|  21   | create_time |   varchar   | 64 |   0    |    Y     |  N   |       | 创建时间  |
|  22   | update_time |   varchar   | 64 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="dim_caterb2b_rt_customer">dim_caterb2b_rt_customer</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | customer_id |   bigint   | 20 |   0    |    N     |  Y   |       | 客户ID  |
|  2   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 客户名称  |
|  3   | parent_customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 父客户ID  |
|  4   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  5   | customer_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 上下线状态1:上线,2:下线,3:待合作  |
|  6   | customer_origin |   smallint   | 6 |   0    |    Y     |  N   |   0    | 客户来源  |
|  7   | cat_type |   smallint   | 6 |   0    |    Y     |  N   |   1    | 流通-餐饮标签1:餐饮2:流通  |
|  8   | is_ka |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否是KA客户标签1:是0:否  |
|  9   | belong_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 1:私海，2:公海  |
|  10   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除  |
|  11   | grid_id |   int   | 10 |   0    |    Y     |  N   |   0    | 网格id  |
|  12   | sales_grid_id |   int   | 10 |   0    |    Y     |  N   |   0    | 销售网格id  |
|  13   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  14   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称  |
|  15   | city_id |   int   | 10 |   0    |    Y     |  N   |   0    | 城市id  |
|  16   | city_name |   varchar   | 255 |   0    |    Y     |  N   |       | 城市名  |
|  17   | bd_info_id |   int   | 10 |   0    |    Y     |  N   |   0    | 负责BD的id  |
|  18   | bd_name |   varchar   | 128 |   0    |    Y     |  N   |       | 负责BD的姓名  |
|  19   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  20   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 最后修改时间  |

**表名：** <a id="dim_caterb2b_rt_delivery_vehicle_type">dim_caterb2b_rt_delivery_vehicle_type</a>

**说明：** 配送车型表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道ID  |
|  3   | vehicle_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 车辆类型1:面包,2:金杯,3:依维柯,4:三轮车,5:4.2米厢货,6:6.8米厢货,7:7.6米厢货,8:9.6米厢货  |
|  4   | energy_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 能源类型1:燃油2:新能源  |
|  5   | vehicle_property |   smallint   | 6 |   0    |    N     |  N   |   0    | 车型属性1:常温2:冷藏  |
|  6   | name |   varchar   | 64 |   0    |    N     |  N   |       | 名称  |
|  7   | load_weight |   decimal   | 6 |   2    |    N     |  N   |   0.00    | 载重  |
|  8   | volume |   decimal   | 8 |   2    |    N     |  N   |   0.00    | 容积  |
|  9   | points |   smallint   | 6 |   0    |    N     |  N   |   0    | 点数  |
|  10   | default_type |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否为默认车型1:默认车型，0:非默认车型  |
|  11   | remark |   varchar   | 256 |   0    |    N     |  N   |       | 描述  |
|  12   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除  |
|  13   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  14   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  15   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后修改时间  |
|  16   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 最后修改人  |

**表名：** <a id="dim_caterb2b_rt_sku_cat">dim_caterb2b_rt_sku_cat</a>

**说明：** 快驴sku分类信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | sku_code |   int   | 10 |   0    |    N     |  Y   |       | sku_code  |
|  2   | cat |   int   | 10 |   0    |    N     |  N   |       | 分类标识：1-生鲜，2-冻品，3-标品  |
|  3   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  4   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="dim_caterb2b_rt_sku_sale_mode_cat">dim_caterb2b_rt_sku_sale_mode_cat</a>

**说明：** sku预售分类

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库Id  |
|  4   | wh_name |   varchar   | 64 |   0    |    N     |  N   |       | 仓库名称  |
|  5   | origin_sku_code |   int   | 10 |   0    |    N     |  N   |       | 原规格sku编码  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  7   | sale_mode_cat |   smallint   | 6 |   0    |    N     |  N   |   0    | 预售分类预售:1,非预售(冷冻):2,非预售(标品):3  |
|  8   | sku_category1_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 一级分类ID  |
|  9   | sku_category2_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 二级分类ID  |
|  10   | sku_category3_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 三级分类ID  |
|  11   | sku_category1_name |   varchar   | 64 |   0    |    N     |  N   |       | 一级分类名称  |
|  12   | sku_category2_name |   varchar   | 64 |   0    |    N     |  N   |       | 二级分类名称  |
|  13   | sku_category3_name |   varchar   | 64 |   0    |    N     |  N   |       | 三级分类名称  |
|  14   | sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 销售模式现货销售：0预售：1  |
|  15   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  16   | ctime |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  17   | utime |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |

**表名：** <a id="dim_caterb2b_supplier_arrive_time">dim_caterb2b_supplier_arrive_time</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增ID  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  3   | supplier_id |   int   | 10 |   0    |    N     |  N   |       | supplier_id  |
|  4   | arrive_time |   varchar   | 100 |   0    |    Y     |  N   |       | 时间  |
|  5   | arrive_time_min |   int   | 10 |   0    |    Y     |  N   |       | 标准到货时间分钟  |

**表名：** <a id="dim_caterb2b_target_amt_per_car">dim_caterb2b_target_amt_per_car</a>

**说明：** 目标单车货值--预测用

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键ID  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  3   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  4   | target_amt_per_car |   double   | 23 |   0    |    Y     |  N   |       | 目标单车货值  |

**表名：** <a id="dim_caterb2b_transport_depart_time_standard">dim_caterb2b_transport_depart_time_standard</a>

**说明：** 快驴-发车及时率标准上传表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增id  |
|  2   | dt |   varchar   | 255 |   0    |    Y     |  N   |       | 快照日期  |
|  3   | begin_date |   varchar   | 255 |   0    |    Y     |  N   |       | 规则开始日期  |
|  4   | end_date |   varchar   | 255 |   0    |    Y     |  N   |       | 规则结束日期  |
|  5   | wh_id |   int   | 10 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  6   | wh_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名称  |
|  7   | region_id |   int   | 10 |   0    |    Y     |  N   |   0    | 网格ID  |
|  8   | region_name |   varchar   | 255 |   0    |    Y     |  N   |       | 网格名称  |
|  9   | delivery_times |   varchar   | 255 |   0    |    Y     |  N   |       | 配送时段  |
|  10   | gap_time |   int   | 10 |   0    |    Y     |  N   |   0    | 时间差  |
|  11   | feedback_times |   varchar   | 255 |   0    |    Y     |  N   |       | 城市反馈时间  |
|  12   | remarks |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_caterb2b_warehouse">dim_caterb2b_warehouse</a>

**说明：** 快驴事业部-仓库维表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库ID，同id字段  |
|  2   | wh_code |   varchar   | 50 |   0    |    N     |  N   |       | 仓库code  |
|  3   | wh_name |   varchar   | 50 |   0    |    N     |  N   |       | 仓库名称  |
|  4   | wh_linkman |   varchar   | 20 |   0    |    N     |  N   |       | 仓库联系人  |
|  5   | wh_phone |   varchar   | 20 |   0    |    N     |  N   |       | 仓库电话  |
|  6   | wh_remark |   varchar   | 100 |   0    |    Y     |  N   |       | 备注  |
|  7   | wh_address |   varchar   | 200 |   0    |    N     |  N   |       | 地址  |
|  8   | wh_latlng |   varchar   | 100 |   0    |    N     |  N   |       | 经纬度  |
|  9   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       | 经销商ID  |
|  10   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部id  |
|  11   | bu_name |   varchar   | 50 |   0    |    Y     |  N   |       | 事业部  |
|  12   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 大区ID  |
|  13   | area_name |   varchar   | 50 |   0    |    Y     |  N   |       | 大区  |
|  14   | ctime |   int   | 10 |   0    |    Y     |  N   |   0    | 创建时间  |
|  15   | utime |   int   | 10 |   0    |    Y     |  N   |   0    | 修改时间  |

**表名：** <a id="dim_caterb2b_warehouse_his">dim_caterb2b_warehouse_his</a>

**说明：** B2B业务部-快驴仓库信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  2   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部ID  |
|  4   | bu_name |   varchar   | 100 |   0    |    Y     |  N   |       | 事业部名称  |
|  5   | wh_code |   varchar   | 100 |   0    |    Y     |  N   |       | 仓库code  |
|  6   | wh_name |   varchar   | 100 |   0    |    Y     |  N   |       | 仓库名称  |
|  7   | wh_linkman |   varchar   | 100 |   0    |    Y     |  N   |       | 仓库联系人  |
|  8   | wh_phone |   varchar   | 100 |   0    |    Y     |  N   |       | 仓库电话  |
|  9   | wh_remark |   varchar   | 100 |   0    |    Y     |  N   |       | 备注  |
|  10   | wh_address |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  11   | wh_latlng |   varchar   | 100 |   0    |    Y     |  N   |       | 经纬度  |
|  12   | wh_istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除1：有效0：删除  |
|  13   | wh_valid |   bigint   | 20 |   0    |    Y     |  N   |       | 有效性1:是0:否  |
|  14   | wh_istest |   bigint   | 20 |   0    |    Y     |  N   |       | 是否测试1：测试仓库0：正式仓库  |
|  15   | wh_enable_status |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库是否开启1开启0关闭  |
|  16   | create_time |   varchar   | 100 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | create_by |   varchar   | 100 |   0    |    Y     |  N   |       | 创建者  |
|  18   | last_modify_time |   varchar   | 100 |   0    |    Y     |  N   |       | 修改时间  |
|  19   | last_modify_by |   varchar   | 100 |   0    |    Y     |  N   |       | 修改者  |
|  20   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  21   | area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 大区ID  |
|  22   | area_name |   varchar   | 100 |   0    |    Y     |  N   |       | 大区名称  |
|  23   | bu_open_date |   varchar   | 100 |   0    |    Y     |  N   |       | bu开城日期  |
|  24   | warehouse_type |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库类型,1:城市仓,2:RDC仓  |
|  25   | wh_job_type |   varchar   | 100 |   0    |    Y     |  N   |       | 仓库作业类型：V1V2  |
|  26   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市id  |
|  27   | city_name |   varchar   | 100 |   0    |    Y     |  N   |       | 城市名称  |
|  28   | county_id |   bigint   | 20 |   0    |    Y     |  N   |       | 区id  |
|  29   | county_name |   varchar   | 100 |   0    |    Y     |  N   |       | 区名称  |
|  30   | province_id |   bigint   | 20 |   0    |    Y     |  N   |       | 省市id  |
|  31   | province_name |   varchar   | 100 |   0    |    Y     |  N   |       | 省市名称  |
|  32   | management_city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 管理城市id  |
|  33   | management_city_name |   varchar   | 100 |   0    |    Y     |  N   |       | 管理城市名称  |

**表名：** <a id="dim_caterb2b_wh_advance_minutes">dim_caterb2b_wh_advance_minutes</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | zone |   varchar   | 45 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | wh_name |   varchar   | 45 |   0    |    Y     |  N   |       |   |
|  5   | ago_minutes |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="dim_caterb2b_wh_delivery_time">dim_caterb2b_wh_delivery_time</a>

**说明：** 仓库-该仓单商户配送时长对应表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库ID  |
|  2   | avg_delivery_time |   double   | 11 |   4    |    Y     |  N   |       | 单仓配送时长  |
|  3   | ctime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  4   | utime |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_customer_cat_ord_time_his">dim_customer_cat_ord_time_his</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID  |
|  4   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  5   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 一级品类类目id  |
|  6   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 二级品类类目id  |
|  7   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | 三级品类类目id  |

**表名：** <a id="dim_cust_zhongb_label">dim_cust_zhongb_label</a>

**说明：** 快驴-中B客户表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | poi_id |   int   | 10 |   0    |    N     |  N   |       | 门店ID  |
|  3   | customer_id |   int   | 10 |   0    |    N     |  N   |       | 客户ID  |
|  4   | source |   varchar   | 100 |   0    |    N     |  N   |       | 客户标签  |
|  5   | new_source |   varchar   | 100 |   0    |    Y     |  N   |       | 中B标签  |

**表名：** <a id="dim_date">dim_date</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | is_work_day |   int   | 10 |   0    |    Y     |  N   |       | 是否工作日  |

**表名：** <a id="dim_dbus_rt_warehouse_area">dim_dbus_rt_warehouse_area</a>

**说明：** 库区

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道Id  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库Id  |
|  4   | area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 库区编码  |
|  5   | area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 库区名称  |
|  6   | area_type |   smallint   | 6 |   0    |    Y     |  N   |       | 销售类型：0全部、1可销售存储、2可销售拣货、3残损、4采退、5可销售存拣  |
|  7   | area_set_id |   bigint   | 20 |   0    |    Y     |  N   |       | 区域Id  |
|  8   | storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 贮存方式：1常温、2冷藏、3冷冻  |
|  9   | enable_status |   smallint   | 6 |   0    |    Y     |  N   |       | 状态：1已开启；0已禁用  |
|  10   | area_remark |   varchar   | 32 |   0    |    Y     |  N   |       | 备注  |
|  11   | can_pick |   smallint   | 6 |   0    |    Y     |  N   |       | 0.不可拣货1.可拣货  |
|  12   | presell_type |   smallint   | 6 |   0    |    Y     |  N   |       | 虚拟类型：0正常，1虚拟，2暂存  |
|  13   | shelf_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货架类型(0-无,1-地堆托盘,2-横梁货架,3-隔板货架,4-虚拟货架)  |
|  14   | add_type |   smallint   | 6 |   0    |    Y     |  N   |       | 库区新增方式(1-手动,2-自动)  |
|  15   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除1：有效0：删除  |
|  16   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  17   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  18   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  19   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  20   | logic_area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 逻辑区Id  |

**表名：** <a id="dim_dbus_rt_warehouse_capacity">dim_dbus_rt_warehouse_capacity</a>

**说明：** 仓容信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 仓库Id  |
|  4   | storage_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 温层:1常温2冷藏3冷冻  |
|  5   | shelf_type |   smallint   | 6 |   0    |    N     |  N   |       | 货架类型:1地堆托盘2横梁货架3隔板货架4虚拟货架  |
|  6   | container_code |   varchar   | 64 |   0    |    N     |  N   |       | 设备编码  |
|  7   | container_num |   int   | 10 |   0    |    N     |  N   |   0    | 设备数量  |
|  8   | container_group_num |   int   | 10 |   0    |    N     |  N   |   0    | 设备组数  |
|  9   | remark |   varchar   | 512 |   0    |    N     |  N   |       | 备注  |
|  10   | capacity_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 仓容状态:0失效1有效  |
|  11   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1正常0删除  |
|  12   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  13   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  15   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="dim_dbus_rt_warehouse_container">dim_dbus_rt_warehouse_container</a>

**说明：** 设备信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | container_code |   varchar   | 64 |   0    |    N     |  N   |       | 设备编码  |
|  4   | container_name |   varchar   | 200 |   0    |    N     |  N   |       | 设备名称  |
|  5   | length |   int   | 10 |   0    |    N     |  N   |   0    | 长度（cm）  |
|  6   | width |   int   | 10 |   0    |    N     |  N   |   0    | 宽度（cm）  |
|  7   | height |   int   | 10 |   0    |    N     |  N   |   0    | 高度（cm）  |
|  8   | max_load_weight |   decimal   | 9 |   2    |    N     |  N   |   0.00    | 最大承重（kg）  |
|  9   | volume |   decimal   | 9 |   2    |    N     |  N   |   0.00    | 单位容积（m³）  |
|  10   | remark |   varchar   | 512 |   0    |    N     |  N   |       | 备注  |
|  11   | container_name_status |   bigint   | 20 |   0    |    N     |  N   |   1    | 设备名称的状态:1正常其他值为删除时间戳,  |
|  12   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1正常0删除  |
|  13   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  14   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  15   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  16   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="dim_dbus_rt_warehouse_location">dim_dbus_rt_warehouse_location</a>

**说明：** 库位

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道Id  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | location_code |   varchar   | 32 |   0    |    Y     |  N   |       | 库位编码  |
|  5   | area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 库区Id  |
|  6   | enable_status |   smallint   | 6 |   0    |    Y     |  N   |       | 状态：1已开启；0已禁用  |
|  7   | isfreeze |   smallint   | 6 |   0    |    Y     |  N   |       | 冻结标记0：否1：是  |
|  8   | seq_number |   smallint   | 6 |   0    |    Y     |  N   |       | 排序，大于0的正整数，允许重复  |
|  9   | location_remark |   varchar   | 64 |   0    |    Y     |  N   |       | 注释  |
|  10   | location_can_pick |   smallint   | 6 |   0    |    Y     |  N   |       | 0.不可拣货,1.可拣货  |
|  11   | presell_type |   smallint   | 6 |   0    |    Y     |  N   |       | 虚拟类型：0正常，1虚拟，2暂存  |
|  12   | shelf_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货架类型(0-无,1-地堆托盘,2-横梁货架,3-隔板货架,4-虚拟货架)  |
|  13   | container_code |   varchar   | 64 |   0    |    Y     |  N   |       | 设备编码  |
|  14   | container_num |   int   | 10 |   0    |    Y     |  N   |       | 设备数量  |
|  15   | add_type |   smallint   | 6 |   0    |    Y     |  N   |       | 库位新增方式(1-手动,2-自动)  |
|  16   | storage_buz_type |   smallint   | 6 |   0    |    Y     |  N   |       | 存储业务类型：1-商品存储,2-容器存储  |
|  17   | istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 逻辑删除1：有效0：删除  |
|  18   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  19   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |
|  20   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  21   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |

**表名：** <a id="dim_dts_rt_customer_group_relation">dim_dts_rt_customer_group_relation</a>

**说明：** 客户组关联客户详情表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增id主键  |
|  2   | customer_group_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 客户组id  |
|  3   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 客户id  |
|  4   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  5   | create_by |   varchar   | 60 |   0    |    N     |  N   |       | 创建者  |
|  6   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 最后修改时间  |
|  7   | last_modify_by |   varchar   | 60 |   0    |    N     |  N   |       | 最后修改者  |

**表名：** <a id="dim_dts_schedule_class">dim_dts_schedule_class</a>

**说明：** 班次信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 班次id  |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  3   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | warehouse_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名字  |
|  5   | name |   varchar   | 64 |   0    |    Y     |  N   |       | 名称  |
|  6   | job_start_time |   time   | 8 |   0    |    Y     |  N   |       | 值班开始时间  |
|  7   | job_end_time |   time   | 8 |   0    |    Y     |  N   |       | 值班结束时间  |
|  8   | job_cross_day |   tinyint   | 4 |   0    |    Y     |  N   |       | 班次时间是否跨天，0-不跨天，1-跨天  |
|  9   | class_start_date |   date   | 10 |   0    |    Y     |  N   |       | 班次开始日期  |
|  10   | class_end_date |   date   | 10 |   0    |    Y     |  N   |       | 班次结束日期  |
|  11   | status |   tinyint   | 4 |   0    |    Y     |  N   |       | 班次状态1创建2启用3停用  |
|  12   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  13   | create_by |   varchar   | 128 |   0    |    Y     |  N   |       | 创建者  |
|  14   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  15   | last_modify_by |   varchar   | 128 |   0    |    Y     |  N   |       | 修改者  |

**表名：** <a id="dim_purchase_asn_reservation_strategy">dim_purchase_asn_reservation_strategy</a>

**说明：** 仓配预约配额维度数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | dt |   bigint   | 20 |   0    |    N     |  N   |       | 日期  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  4   | temperature_storage_type |   int   | 10 |   0    |    Y     |  N   |       | 温层  |
|  5   | maxreserveqty |   bigint   | 20 |   0    |    Y     |  N   |       | 最大预约配送  |
|  6   | add_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  7   | update_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |

**表名：** <a id="dim_rt_sku_sale_mode_storage_cat">dim_rt_sku_sale_mode_storage_cat</a>

**说明：** sku预售贮存分类

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库Id  |
|  4   | wh_name |   varchar   | 64 |   0    |    N     |  N   |       | 仓库名称  |
|  5   | origin_sku_code |   int   | 10 |   0    |    N     |  N   |       | 原规格sku编码  |
|  6   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  7   | mode_storage_cat |   smallint   | 6 |   0    |    N     |  N   |   0    | 预售分类标品:1冻品:2生鲜:3肉禽4  |
|  8   | sku_category1_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 一级分类ID  |
|  9   | sku_category2_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 二级分类ID  |
|  10   | sku_category3_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 三级分类ID  |
|  11   | sku_category1_name |   varchar   | 64 |   0    |    N     |  N   |       | 一级分类名称  |
|  12   | sku_category2_name |   varchar   | 64 |   0    |    N     |  N   |       | 二级分类名称  |
|  13   | sku_category3_name |   varchar   | 64 |   0    |    N     |  N   |       | 三级分类名称  |
|  14   | sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 销售模式现货销售：0预售：1  |
|  15   | warehouse_process_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否库内加工0:否1:是  |
|  16   | volume |   decimal   | 21 |   6    |    Y     |  N   |   0.000000    | 体积：cm^3  |
|  17   | sku_gross_weight |   decimal   | 11 |   2    |    Y     |  N   |   0.00    | 毛重kg  |
|  18   | sku_net_weight |   decimal   | 11 |   2    |    Y     |  N   |   0.00    | 净重kg  |
|  19   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  20   | ctime |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  21   | utime |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 最后更新时间  |

**表名：** <a id="dim_sm_racorg_bd_info">dim_sm_racorg_bd_info</a>

**说明：** 快驴事业部快驴事业部-RAC组织结构人员信息数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bd_employee_id |   bigint   | 20 |   0    |    N     |  Y   |       | BD-EmployeeID原名bd_info_id  |
|  2   | region_id |   int   | 10 |   0    |    Y     |  N   |       | 战区ID  |
|  3   | region_name |   varchar   | 128 |   0    |    Y     |  N   |       | 战区名称  |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-BMS事业部ID  |
|  5   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-BMS事业部名称  |
|  6   | rac_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 事业部ID-RAC事业部ID  |
|  7   | rac_bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名称-RAC事业部名称  |
|  8   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-BMS城市ID  |
|  9   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-BMS城市名称  |
|  10   | rac_city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市ID-RAC城市ID  |
|  11   | rac_city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称-RAC城市名称  |
|  12   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 城区ID  |
|  13   | area_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城区名称  |
|  14   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 销售组ID  |
|  15   | org_name |   varchar   | 128 |   0    |    Y     |  N   |       | 销售组名称  |
|  16   | bdm_id |   int   | 10 |   0    |    Y     |  N   |       | BDMID  |
|  17   | bdm_employee_id |   int   | 10 |   0    |    Y     |  N   |       | BDM-EmployeeID原名bd_info_id  |
|  18   | bdm_mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-MISNAME  |
|  19   | bdm_name |   varchar   | 128 |   0    |    Y     |  N   |       | BDM-姓名  |
|  20   | bd_id |   int   | 10 |   0    |    Y     |  N   |       | BDID  |
|  21   | mis_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD-MISNAME  |
|  22   | bd_name |   varchar   | 128 |   0    |    Y     |  N   |       | BD姓名  |
|  23   | pos_code |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位ID  |
|  24   | pos_name |   varchar   | 128 |   0    |    Y     |  N   |       | 岗位名称  |
|  25   | entry_date |   varchar   | 128 |   0    |    Y     |  N   |       | 入职日期  |
|  26   | leave_date |   varchar   | 128 |   0    |    Y     |  N   |       | 离职日期  |
|  27   | is_bd |   int   | 10 |   0    |    Y     |  N   |       | 是否为BD：1是，0否  |
|  28   | is_preformance_staff |   int   | 10 |   0    |    Y     |  N   |       | 是否参加绩效考核：1是，0否  |
|  29   | is_incumbency |   int   | 10 |   0    |    Y     |  N   |       | 是否在职：1在职，0离职  |
|  30   | onjob_days |   int   | 10 |   0    |    Y     |  N   |       | 快驴事业部供职天数  |
|  31   | onjob_days_this_month |   int   | 10 |   0    |    Y     |  N   |       | 本月在职天数  |
|  32   | is_entry_this_month |   int   | 10 |   0    |    Y     |  N   |       | 是否本月入职：1是，0否  |
|  33   | is_departure_this_month |   int   | 10 |   0    |    Y     |  N   |       | 是否本月离职：1是，0否  |

**表名：** <a id="dim_xt_off_caterb2b_customer_tag_day">dim_xt_off_caterb2b_customer_tag_day</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | byr_id |   bigint   | 20 |   0    |    N     |  Y   |       | 商家id  |
|  2   | byr_first_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家首次下单时间  |
|  3   | byr_last_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家最后下单时间  |
|  4   | fst_arranged_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家首次成交单的下单时间  |
|  5   | last_arranged_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家最后一次成交单的下单时间  |
|  6   | byr_first_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营首次下单时间  |
|  7   | byr_last_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营最后下单时间  |
|  8   | fst_arranged_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营首次成交单的下单时间  |
|  9   | last_arranged_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营最后一次成交单的下单时间  |
|  10   | byr_first_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P首次下单时间  |
|  11   | byr_last_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P最后下单时间  |
|  12   | fst_arranged_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3p首次成交单的下单时间  |
|  13   | last_arranged_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P最后一次成交单的下单时间  |

**表名：** <a id="dim_xt_off_caterb2b_customer_tag_day_history">dim_xt_off_caterb2b_customer_tag_day_history</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | byr_id |   bigint   | 20 |   0    |    N     |  Y   |       | 商家id  |
|  2   | byr_first_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家首次下单时间  |
|  3   | byr_last_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家最后下单时间  |
|  4   | fst_arranged_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家首次成交单的下单时间  |
|  5   | last_arranged_ord_time |   bigint   | 20 |   0    |    Y     |  N   |       | 商家最后一次成交单的下单时间  |
|  6   | byr_first_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营首次下单时间  |
|  7   | byr_last_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营最后下单时间  |
|  8   | fst_arranged_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营首次成交单的下单时间  |
|  9   | last_arranged_ord_time_own |   bigint   | 20 |   0    |    Y     |  N   |       | 商家自营最后一次成交单的下单时间  |
|  10   | byr_first_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P首次下单时间  |
|  11   | byr_last_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P最后下单时间  |
|  12   | fst_arranged_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3p首次成交单的下单时间  |
|  13   | last_arranged_ord_time_3p |   bigint   | 20 |   0    |    Y     |  N   |       | 商家3P最后一次成交单的下单时间  |

**表名：** <a id="dim_xt_off_caterb2b_vendor">dim_xt_off_caterb2b_vendor</a>

**说明：** 供应商维表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | vendor_id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | vendor_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名称  |
|  3   | vendor_code |   varchar   | 64 |   0    |    Y     |  N   |       | 供应商编号  |
|  4   | vendor_type |   int   | 10 |   0    |    Y     |  N   |       | 供应商类型,1:企业，2：个人  |
|  5   | company_type |   int   | 10 |   0    |    Y     |  N   |       | 企业类型，1.厂商、2.经销商、3.进口经销商、4.其他  |
|  6   | org_code |   varchar   | 64 |   0    |    Y     |  N   |       | 组织机构代码  |
|  7   | vendor_auth_status |   int   | 10 |   0    |    Y     |  N   |       | 供应商认证状态1.未认证，2.认证成功，3.认证失败  |
|  8   | province_id |   int   | 10 |   0    |    Y     |  N   |       | 省份id  |
|  9   | province_name |   varchar   | 128 |   0    |    Y     |  N   |       | 省份名称  |
|  10   | city_id |   int   | 10 |   0    |    Y     |  N   |       | 城市id  |
|  11   | city_name |   varchar   | 128 |   0    |    Y     |  N   |       | 城市名称  |
|  12   | detail_address |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商地址  |
|  13   | card_record_id |   bigint   | 20 |   0    |    Y     |  N   |       | 验卡记录表的主id  |
|  14   | establishment_date |   varchar   | 100 |   0    |    Y     |  N   |       | 公司成立日期  |
|  15   | enterprise_type |   int   | 10 |   0    |    Y     |  N   |       | 公司类型1国企2合资企业3股份制企业4上市公司5民营企业  |
|  16   | registered_capital |   double   | 23 |   0    |    Y     |  N   |       | 注册资金(万元)  |
|  17   | currency_type |   int   | 10 |   0    |    Y     |  N   |       | 注册资金货币种类，1.人民币，2.美金  |
|  18   | taxpayer_type |   int   | 10 |   0    |    Y     |  N   |       | 纳税人类别1一般纳税人2小规模纳税人  |
|  19   | poultry_duty_free |   int   | 10 |   0    |    Y     |  N   |       | 肉蛋禽免税资质,1有,0无  |
|  20   | vegetable_fruit_duty_free |   int   | 10 |   0    |    Y     |  N   |       | 蔬菜水果免税资质,1有,0无  |
|  21   | taxpayer_no |   varchar   | 64 |   0    |    Y     |  N   |       | 纳税人识别号  |
|  22   | supply_mode |   int   | 10 |   0    |    Y     |  N   |       | 供货方式1入仓2直送  |
|  23   | bg |   int   | 10 |   0    |    Y     |  N   |       | 租户类型1快驴2小象  |
|  24   | contact_name |   varchar   | 50 |   0    |    Y     |  N   |       | 联系人  |
|  25   | contact_tel |   varchar   | 64 |   0    |    Y     |  N   |       | 联系电话  |
|  26   | contact_tel_token |   varchar   | 64 |   0    |    Y     |  N   |       | 联系电话Token  |
|  27   | contact_email |   varchar   | 64 |   0    |    Y     |  N   |       | 联系人邮箱  |
|  28   | business_licence |   varchar   | 100 |   0    |    Y     |  N   |       | 营业执照url  |
|  29   | due_date |   varchar   | 100 |   0    |    Y     |  N   |       | 营业执照到期日  |
|  30   | qualification |   varchar   | 3000 |   0    |    Y     |  N   |       | 资质图片url,按照，分开  |
|  31   | business_scope |   varchar   | 3000 |   0    |    Y     |  N   |       | 经营范围  |
|  32   | legal_person_name |   varchar   | 50 |   0    |    Y     |  N   |       | 法定代表人  |
|  33   | paid_in_capital |   decimal   | 39 |   6    |    Y     |  N   |       | 实缴资本(万元)  |
|  34   | vendor_status |   int   | 10 |   0    |    Y     |  N   |       | 启用状态，1.启用，2.停用  |
|  35   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  36   | sign_status |   int   | 10 |   0    |    Y     |  N   |       | 签约状态，1.已签约，2.未签约  |
|  37   | vendor_bu_cnt |   int   | 10 |   0    |    Y     |  N   |       | 合作事业部个数  |
|  38   | vendor_cat1_id |   varchar   | 100 |   0    |    Y     |  N   |       | 供给的一级品类id组合  |
|  39   | vendor_cat1_name |   varchar   | 100 |   0    |    Y     |  N   |       | 供给的一级品类组合  |
|  40   | create_time |   varchar   | 255 |   0    |    Y     |  N   |       | 创建时间  |
|  41   | create_by |   varchar   | 255 |   0    |    Y     |  N   |       | 创建者  |
|  42   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  43   | last_modify_by |   varchar   | 255 |   0    |    Y     |  N   |       | 修改者  |
|  44   | istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除,1正常,0已删除  |
|  45   | version |   int   | 10 |   0    |    Y     |  N   |       | 版本  |

**表名：** <a id="dwd_rt_topic_pacific_case_lifecycle">dwd_rt_topic_pacific_case_lifecycle</a>

**说明：** 工单实时宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单ID  |
|  3   | lifecycle |   int   | 10 |   0    |    Y     |  N   |       | 生命周期  |
|  4   | start_datekey |   int   | 10 |   0    |    Y     |  N   |       | 生命周期开始时间-datekey日期键（开始时间）  |
|  5   | datekey |   int   | 10 |   0    |    Y     |  N   |       | 关单日期  |
|  6   | is_close |   int   | 10 |   0    |    Y     |  N   |       | 是否关单（1表示关单，0或null表示未关单）  |
|  7   | bu_name |   varchar   | 30 |   0    |    Y     |  N   |       | 业务名称  |
|  8   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 工单创建时间  |
|  9   | case_creator_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单创建人id  |
|  10   | case_creator_real_name |   varchar   | 30 |   0    |    Y     |  N   |       | 工单创建人姓名  |
|  11   | case_creator_login_name |   varchar   | 30 |   0    |    Y     |  N   |       | 工单创建人登录名  |
|  12   | case_creator_dep_id |   varchar   | 20 |   0    |    Y     |  N   |       | 工单创建人部门ID  |
|  13   | case_creator_dep_name |   varchar   | 80 |   0    |    Y     |  N   |       | 工单创建人部门名称  |
|  14   | reopen_staff_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前生命周期重开人  |
|  15   | reopen_staff_login_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期重开人登录名  |
|  16   | reopen_staff_real_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期重开人姓名  |
|  17   | reopen_staff_dep_id |   varchar   | 20 |   0    |    Y     |  N   |       | 当前生命周期重开人部门ID  |
|  18   | reopen_staff_dep_name |   varchar   | 80 |   0    |    Y     |  N   |       | 当前生命周期重开人部门名称  |
|  19   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当前生命周期开始时间  |
|  20   | close_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当前生命周期关单时间  |
|  21   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 当前生命周期更新时间  |
|  22   | updater_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前生命周期更新人ID  |
|  23   | owner_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前生命周期处理人ID  |
|  24   | owner_login_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期处理人登录名  |
|  25   | owner_real_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期处理人姓名  |
|  26   | owner_dep_id |   varchar   | 20 |   0    |    Y     |  N   |       | 当前生命周期处理人部门ID  |
|  27   | owner_dep_name |   varchar   | 80 |   0    |    Y     |  N   |       | 当前生命周期处理人部门名称  |
|  28   | closer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前生命周期关单人ID  |
|  29   | closer_login_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期关单人登录名  |
|  30   | closer_real_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期关单人姓名  |
|  31   | closer_dep_id |   varchar   | 20 |   0    |    Y     |  N   |       | 当前生命周期关单人部门ID  |
|  32   | closer_dep_name |   varchar   | 80 |   0    |    Y     |  N   |       | 当前生命周期关单人部门名称  |
|  33   | manager_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前生命周期负责人ID  |
|  34   | manager_login_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期负责人登录名  |
|  35   | manager_real_name |   varchar   | 30 |   0    |    Y     |  N   |       | 当前生命周期负责人姓名  |
|  36   | manager_dep_id |   varchar   | 20 |   0    |    Y     |  N   |       | 当前生命周期负责人部门ID  |
|  37   | manager_dep_name |   varchar   | 80 |   0    |    Y     |  N   |       | 当前生命周期负责人部门名称  |
|  38   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 用户ID  |
|  39   | customer_type |   int   | 10 |   0    |    Y     |  N   |       | 用户类型代码  |
|  40   | customer_type_desc |   varchar   | 40 |   0    |    Y     |  N   |       | 用户类型描述  |
|  41   | first_category_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单一级问题类别ID  |
|  42   | first_category_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单一级问题类别名称  |
|  43   | second_category_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单二级问题类别ID  |
|  44   | second_category_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单二级问题类别名称  |
|  45   | third_category_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单三级问题类别ID  |
|  46   | third_category_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单三级问题类别名称  |
|  47   | fourth_category_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单四级问题类别ID  |
|  48   | fourth_category_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单四级问题类别名称  |
|  49   | fifth_category_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单五级问题类别ID  |
|  50   | fifth_category_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单五级问题类别名称  |
|  51   | question_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单问题ID  |
|  52   | question_name |   varchar   | 300 |   0    |    Y     |  N   |       | 工单问题-太平洋系统名称  |
|  53   | origin_question_name |   varchar   | 300 |   0    |    Y     |  N   |       | 工单问题-原始名称  |
|  54   | question_reason_id |   bigint   | 20 |   0    |    Y     |  N   |       | 问题原因ID  |
|  55   | question_reason_name |   varchar   | 200 |   0    |    Y     |  N   |       | 问题原因中文名称  |
|  56   | order__dtc_object_key |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-订单业务对象代码  |
|  57   | order__dtc_object_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-订单业务对象名称  |
|  58   | order__dtc_object_id |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-订单业务对象ID  |
|  59   | sku__dtc_object_key |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-SKU业务对象代码  |
|  60   | sku__dtc_object_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-SKU业务对象名称  |
|  61   | sku__dtc_object_id |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-SKU业务对象ID  |
|  62   | poi__dtc_object_key |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-POI业务对象代码  |
|  63   | poi__dtc_object_name |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-POI业务对象名称  |
|  64   | poi__dtc_object_id |   varchar   | 100 |   0    |    Y     |  N   |       | 工单关联-POI业务对象ID  |
|  65   | case_type_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单类型ID  |
|  66   | case_type_desc |   varchar   | 200 |   0    |    Y     |  N   |       | 工单类型名称  |
|  67   | status_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单状态ID  |
|  68   | status_name |   varchar   | 50 |   0    |    Y     |  N   |       | 工单状态名称  |
|  69   | priority_id |   bigint   | 20 |   0    |    Y     |  N   |       | 工单优先级ID  |
|  70   | deadline |   varchar   | 20 |   0    |    Y     |  N   |       | 截止时间  |
|  71   | source |   int   | 10 |   0    |    Y     |  N   |       | 来源渠道  |
|  72   | source_desc |   varchar   | 60 |   0    |    Y     |  N   |       | 来源渠道描述  |
|  73   | sub_source |   int   | 10 |   0    |    Y     |  N   |       | 来源子渠道  |
|  74   | content |   varchar   | 6000 |   0    |    Y     |  N   |       | 反馈内容  |
|  75   | memo |   varchar   | 300 |   0    |    Y     |  N   |       | 备注说明  |
|  76   | plan_type |   varchar   | 20 |   0    |    Y     |  N   |       | 方案职能类型  |
|  77   | is_upgrade |   int   | 10 |   0    |    Y     |  N   |       | 是否升级（1表示升级，0或null表示未升级）  |
|  78   | contact |   varchar   | 150 |   0    |    Y     |  N   |       | 反馈联系方式  |
|  79   | contact_phone |   varchar   | 40 |   0    |    Y     |  N   |       | 反馈呼入号码  |
|  80   | md5_contact_phone |   varchar   | 100 |   0    |    Y     |  N   |       | 反馈呼入号码md5加密  |
|  81   | contact_phone_area |   varchar   | 100 |   0    |    Y     |  N   |       | 反馈呼入号码归属地  |
|  82   | feedback_time |   datetime   | 19 |   0    |    Y     |  N   |       | 回访时间  |
|  83   | scheme_name |   varchar   | 20 |   0    |    Y     |  N   |       | 方案  |
|  84   | scheme_type |   varchar   | 20 |   0    |    Y     |  N   |       | 方案类型  |
|  85   | is_create |   int   | 10 |   0    |    Y     |  N   |       | 是否创建  |
|  86   | is_reopen |   int   | 10 |   0    |    Y     |  N   |       | 是否重开  |
|  87   | reopen_time |   datetime   | 19 |   0    |    Y     |  N   |       | 重开时间  |
|  88   | flow_id |   bigint   | 20 |   0    |    Y     |  N   |       | 流程ID  |
|  89   | node_id |   bigint   | 20 |   0    |    Y     |  N   |       | 节点ID  |
|  90   | on_time_close_cnt |   int   | 10 |   0    |    Y     |  N   |       | 准时关单量  |
|  91   | overtime_close_cnt |   int   | 10 |   0    |    Y     |  N   |       | 超时关单量  |
|  92   | close_case_overtime_duration |   int   | 10 |   0    |    Y     |  N   |       | 结案工单的超时时长  |
|  93   | overtime_case_close_duration |   int   | 10 |   0    |    Y     |  N   |       | 超时工单的结案时长  |
|  94   | close_duration |   int   | 10 |   0    |    Y     |  N   |       | 结案时长  |
|  95   | is_second_line |   int   | 10 |   0    |    Y     |  N   |       | 是否二线，0否，1是  |
|  96   | start_half_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 生命周期开始时间-半小时（开始时间）  |
|  97   | start_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 生命周期开始时间-小时（开始时间）  |
|  98   | close_half_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 关单时间-半小时（关单时间）  |
|  99   | close_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 关单时间-小时（关单时间）  |
|  100   | update_half_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 更新时间-半小时（更新时间）  |
|  101   | update_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 更新时间-小时（更新时间）  |
|  102   | update_datekey |   int   | 10 |   0    |    Y     |  N   |       | 更新时间-datekey日期键（更新时间）  |
|  103   | create_half_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 创建时间-半小时（关单时间）  |
|  104   | create_hour_time_piece |   varchar   | 30 |   0    |    Y     |  N   |       | 创建时间-小时（创建时间）  |
|  105   | create_datekey |   int   | 10 |   0    |    Y     |  N   |       | 创建时间-datekey日期键（创建时间）  |
|  106   | is_risk_control_bu |   smallint   | 6 |   0    |    Y     |  N   |       | 是否风控业务线，0否，1是  |
|  107   | allocate_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最新分配时间  |
|  108   | first_outbound_call_time |   datetime   | 19 |   0    |    Y     |  N   |       | 首次外呼时间  |

**表名：** <a id="dwd_wh_crane_nrt_parcel_sku">dwd_wh_crane_nrt_parcel_sku</a>

**说明：** 准实时包裹sku明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道ID  |
|  3   | parcel_no |   varchar   | 128 |   0    |    N     |  N   |       | 包裹号  |
|  4   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  5   | goods_owner_code |   varchar   | 255 |   0    |    N     |  N   |       | 货主编码  |
|  6   | goods_owner_name |   varchar   | 255 |   0    |    N     |  N   |       | 货主名称  |
|  7   | goods_owner_type |   smallint   | 6 |   0    |    N     |  N   |   1    | 货主类型:1自营、2POP、3代仓代配  |
|  8   | order_no |   varchar   | 64 |   0    |    N     |  N   |       | 订单号  |
|  9   | customer_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 商家ID  |
|  10   | customer_name |   varchar   | 128 |   0    |    N     |  N   |       | 商家名称  |
|  11   | seller_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 卖家ID  |
|  12   | seller_name |   varchar   | 128 |   0    |    N     |  N   |       | 卖家名称  |
|  13   | delivery_route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  14   | station_area_no |   varchar   | 32 |   0    |    N     |  N   |       | 站区编码  |
|  15   | station_route_seq |   varchar   | 32 |   0    |    N     |  N   |       | 站区线路  |
|  16   | poi_serial_code |   varchar   | 32 |   0    |    N     |  N   |       | 点位码  |
|  17   | appoint_time |   timestamp   | 19 |   0    |    Y     |  N   |       | 履约日期格式yyyy-mm-dd  |
|  18   | parcel_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 包裹状态:1已生成、2已收货、3已交接、4已取消  |
|  19   | parcel_weight |   decimal   | 11 |   3    |    N     |  N   |   0.000    | 包裹重量  |
|  20   | print_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 打印状态:1已生成、2待打印、3已打印  |
|  21   | print_count |   int   | 10 |   0    |    N     |  N   |   0    | 打印次数  |
|  22   | version |   bigint   | 20 |   0    |    Y     |  N   |       | 版本号  |
|  23   | sku_code |   int   | 10 |   0    |    N     |  N   |       | SKU编码  |
|  24   | sku_brand |   varchar   | 64 |   0    |    N     |  N   |       | 品牌  |
|  25   | sku_name |   varchar   | 255 |   0    |    N     |  N   |       | 名称  |
|  26   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 单位  |
|  27   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 单位描述  |
|  28   | sku_image_url |   varchar   | 1024 |   0    |    Y     |  N   |       | 商品图片url  |
|  29   | sku_qty |   int   | 10 |   0    |    N     |  N   |   0    | 数量  |
|  30   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1：有效0：删除  |
|  31   | create_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  32   | last_modify_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="dws_crane_ranking_info">dws_crane_ranking_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | created_at |   varchar   | 32 |   0    |    N     |  Y   |       | 数据创建日期  |
|  2   | bu_id |   int   | 10 |   0    |    N     |  Y   |       | 事业部id  |
|  3   | group_id |   int   | 10 |   0    |    N     |  Y   |       | 小组id  |
|  4   | bd_id |   int   | 10 |   0    |    N     |  Y   |       | bd_id  |
|  5   | bd_name |   varchar   | 64 |   0    |    N     |  N   |       | bd名称  |
|  6   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       | 客户数  |
|  7   | byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数个人排名  |
|  8   | byr_cnt_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数组排名  |
|  9   | byr_cnt_gap |   int   | 10 |   0    |    Y     |  N   |       | 客户数与上一名差额  |
|  10   | byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       | 客户数3p  |
|  11   | byr_cnt_3p_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数3p个人排名  |
|  12   | byr_cnt_3p_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数3p组排名  |
|  13   | byr_cnt_3p_gap |   int   | 10 |   0    |    Y     |  N   |       | 客户数3p与上一名差额  |
|  14   | byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       | 客户数自营  |
|  15   | byr_cnt_self_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数自营个人排名  |
|  16   | byr_cnt_self_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 客户数自营组排名  |
|  17   | byr_cnt_self_gap |   int   | 10 |   0    |    Y     |  N   |       | 客户数自营与上一名差额  |
|  18   | byr_cnt_new |   int   | 10 |   0    |    Y     |  N   |       | 新客数  |
|  19   | byr_cnt_new_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数个人排名  |
|  20   | byr_cnt_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 新客数组排名  |
|  21   | byr_cnt_new_gap |   int   | 10 |   0    |    Y     |  N   |       | 新客数与上一名差额  |
|  22   | byr_cnt_3p_pure_new |   int   | 10 |   0    |    Y     |  N   |       | 3p纯新客  |
|  23   | byr_cnt_3p_pure_new_ranking |   int   | 10 |   0    |    Y     |  N   |       | 3p纯新客个人排名  |
|  24   | byr_cnt_3p_pure_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 3p纯新客组排名  |
|  25   | byr_cnt_3p_pure_new_gap |   int   | 10 |   0    |    Y     |  N   |       | 3p纯新客与上一名差额  |
|  26   | byr_cnt_3p_from_self |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3p新客  |
|  27   | byr_cnt_3p_from_self_ranking |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3p新客个人排名  |
|  28   | byr_cnt_3p_from_self_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3p新客组排名  |
|  29   | byr_cnt_3p_from_self_gap |   int   | 10 |   0    |    Y     |  N   |       | 存量首次转3p新客与上一名差额  |
|  30   | byr_cnt_self_new |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数  |
|  31   | byr_cnt_self_new_ranking |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数个人排名  |
|  32   | byr_cnt_self_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数组排名  |
|  33   | byr_cnt_self_new_gap |   int   | 10 |   0    |    Y     |  N   |       | 非3P新客数与上一名差额  |
|  34   | sales_amt_3p_veg |   decimal   | 11 |   2    |    Y     |  N   |       | 3P蔬菜销售额  |
|  35   | sales_amt_3p_veg_ranking |   int   | 10 |   0    |    Y     |  N   |       | 3P蔬菜销售额个人排名  |
|  36   | sales_amt_3p_veg_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 3P蔬菜销售额组排名  |
|  37   | sales_amt_3p_veg_gap |   decimal   | 11 |   2    |    Y     |  N   |       | 3P蔬菜销售额与上一名差额  |
|  38   | sales_amt_3p_frozen_meat |   decimal   | 11 |   2    |    Y     |  N   |       | 3P冻肉销售额  |
|  39   | sales_amt_3p_frozen_meat_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 3P冻肉销售额组排名  |
|  40   | sales_amt_3p_frozen_meat_gap |   decimal   | 11 |   2    |    Y     |  N   |       | 3P冻肉销售额与上一名差额  |
|  41   | sales_amt_self_meat |   decimal   | 11 |   2    |    Y     |  N   |       | 自营肉禽销售额  |
|  42   | sales_amt_self_meat_ranking |   int   | 10 |   0    |    Y     |  N   |       | 自营肉禽销售额个人排名  |
|  43   | sales_amt_self_meat_group_ranking |   int   | 10 |   0    |    Y     |  N   |       | 自营肉禽销售额组排名  |
|  44   | sales_amt_self_meat_gap |   decimal   | 11 |   2    |    Y     |  N   |       | 自营肉禽销售额与上一名差额  |
|  45   | update_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 数据更新时间  |
|  46   | sales_amt_3p_frozen_meat_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  47   | byr_cnt_3p_new |   int   | 10 |   0    |    Y     |  N   |       |   |
|  48   | byr_cnt_3p_new_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  49   | byr_cnt_3p_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  50   | byr_cnt_3p_new_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  51   | group_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  52   | sales_amt |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  53   | sales_amt_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  54   | sales_amt_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  55   | sales_amt_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  56   | sales_amt_3p |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  57   | sales_amt_3p_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  58   | sales_amt_3p_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  59   | sales_amt_3p_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  60   | sales_amt_self |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  61   | sales_amt_self_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  62   | sales_amt_self_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  63   | sales_amt_self_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="dws_datacube_ranking_info">dws_datacube_ranking_info</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bu_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | group_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | bd_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  4   | bd_name |   varchar   | 64 |   0    |    N     |  N   |       |   |
|  5   | byr_cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | byr_cnt_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | byr_cnt_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  8   | byr_cnt_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | byr_cnt_3p |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | byr_cnt_3p_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | byr_cnt_3p_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  12   | byr_cnt_3p_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  13   | byr_cnt_self |   int   | 10 |   0    |    Y     |  N   |       |   |
|  14   | byr_cnt_self_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  15   | byr_cnt_self_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  16   | byr_cnt_self_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  17   | byr_cnt_new |   int   | 10 |   0    |    Y     |  N   |       |   |
|  18   | byr_cnt_new_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  19   | byr_cnt_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | byr_cnt_new_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  21   | byr_cnt_3p_pure_new |   int   | 10 |   0    |    Y     |  N   |       |   |
|  22   | byr_cnt_3p_pure_new_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  23   | byr_cnt_3p_pure_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  24   | byr_cnt_3p_pure_new_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  25   | byr_cnt_3p_from_self |   int   | 10 |   0    |    Y     |  N   |       |   |
|  26   | byr_cnt_3p_from_self_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  27   | byr_cnt_3p_from_self_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  28   | byr_cnt_3p_from_self_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  29   | byr_cnt_self_new |   int   | 10 |   0    |    Y     |  N   |       |   |
|  30   | byr_cnt_self_new_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  31   | byr_cnt_self_new_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  32   | byr_cnt_self_new_gap |   int   | 10 |   0    |    Y     |  N   |       |   |
|  33   | sales_amt_3p_veg |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  34   | sales_amt_3p_veg_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  35   | sales_amt_3p_veg_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  36   | sales_amt_3p_veg_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  37   | sales_amt3p_frozen_meat |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  38   | sales_amt3p_frozen_meatRanking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  39   | sales_amt3p_frozen_meat_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | sales_amt3p_frozen_meat_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  41   | sales_amt_self_meat |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  42   | sales_amt_self_meat_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  43   | sales_amt_self_meat_group_ranking |   int   | 10 |   0    |    Y     |  N   |       |   |
|  44   | sales_amt_self_meat_gap |   decimal   | 11 |   2    |    Y     |  N   |       |   |
|  45   | update_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 数据更新时间  |

**表名：** <a id="dws_flink_rt_bd_sales_amt">dws_flink_rt_bd_sales_amt</a>

**说明：** 快驴BD销售额汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   timestamp   | 19 |   0    |    N     |  Y   |   CURRENT_TIMESTAMP    | 统计日期  |
|  2   | bd_id |   int   | 10 |   0    |    N     |  Y   |       | bd_id  |
|  3   | sales_amt |   decimal   | 11 |   4    |    N     |  N   |       | 平台销售额  |
|  4   | sales_amt_3p |   decimal   | 11 |   4    |    N     |  N   |       | 3p销售额  |
|  5   | sales_amt_self |   decimal   | 11 |   4    |    N     |  N   |       | 自营销售额  |
|  6   | update_time |   timestamp   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 数据更新时间  |
|  7   | ____retract_flag |   varchar   | 32 |   0    |    Y     |  N   |       | 回撤标识  |

**表名：** <a id="fact_operator_rf_pv_time">fact_operator_rf_pv_time</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | dt |   date   | 10 |   0    |    N     |  N   |       | 分区字段:yyyy-MM-dd  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库ID  |
|  3   | operator_id |   bigint   | 20 |   0    |    Y     |  N   |       | 操作员id  |
|  4   | area_id |   bigint   | 20 |   0    |    Y     |  N   |       | 大区id  |
|  5   | area_name |   varchar   | 256 |   0    |    Y     |  N   |       | 大区名称  |
|  6   | wh_name |   varchar   | 256 |   0    |    N     |  N   |       | 仓库名称  |
|  7   | operator_name |   varchar   | 256 |   0    |    Y     |  N   |       | 操作员姓名  |
|  8   | temporary_status |   int   | 10 |   0    |    Y     |  N   |       | 员工类型:0:长工1:临时工  |
|  9   | rf_type |   int   | 10 |   0    |    Y     |  N   |       | rf类型：1入库，2库内，3加工，4出库，5其他  |
|  10   | operate_type |   int   | 10 |   0    |    Y     |  N   |       | 作业类型:1收货，2上架，3投线，4拣货，5加工，6复核，7移库，8补货，9盘点，10异常，11其他  |
|  11   | viwe_type |   varchar   | 16 |   0    |    Y     |  N   |       | 作业页面类型名称  |
|  12   | page_name |   varchar   | 256 |   0    |    Y     |  N   |       | 作业页面详细名称  |
|  13   | page_id |   bigint   | 20 |   0    |    Y     |  N   |       | 作业页面id  |
|  14   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 作业时间  |
|  15   | event_timestamp |   bigint   | 20 |   0    |    Y     |  N   |       | 事件时间戳  |

**表名：** <a id="mid_dim_caterb2b_bd">mid_dim_caterb2b_bd</a>

**说明：** B2B业务部-快驴BD信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增id  |
|  2   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  3   | bd_name |   varchar   | 38 |   0    |    Y     |  N   |       | 负责BD的姓名  |
|  4   | bd_info_id |   bigint   | 20 |   0    |    Y     |  N   |       | 亚食联为ep_id，快驴为mis_id  |
|  5   | mtid |   varchar   | 38 |   0    |    Y     |  N   |       | mtid(login)  |
|  6   | org_id |   int   | 10 |   0    |    Y     |  N   |       | 组织机构节点ID  |
|  7   | org_name |   varchar   | 38 |   0    |    Y     |  N   |       | 组织机构节点名称  |
|  8   | org_type |   int   | 10 |   0    |    Y     |  N   |       | 节点类型：1总部，2城市，3蜂窝  |
|  9   | parent_org_id |   int   | 10 |   0    |    Y     |  N   |       | 父节点ID  |
|  10   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市id  |
|  11   | city_name |   varchar   | 38 |   0    |    Y     |  N   |       | 城市名  |
|  12   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道ID  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部ID  |
|  14   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  15   | bdm_id |   bigint   | 20 |   0    |    Y     |  N   |       | BDM的ID  |
|  16   | bdm_name |   varchar   | 38 |   0    |    Y     |  N   |       | BDM姓名  |
|  17   | pos_code |   varchar   | 38 |   0    |    Y     |  N   |       | 岗位编码  |
|  18   | pos_name |   varchar   | 38 |   0    |    Y     |  N   |       | 岗位名称，如BD/BDM/CM  |
|  19   | pos_name_tran |   varchar   | 38 |   0    |    Y     |  N   |       | 岗位名称，如BD/BDM/CM  |
|  20   | latest_pos_name |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的工作岗位  |
|  21   | latest_pos_name_tran |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的工作岗位  |
|  22   | pos_change_cnts |   int   | 10 |   0    |    Y     |  N   |       | 岗位变更次数  |
|  23   | prev_pos_change_time |   varchar   | 38 |   0    |    Y     |  N   |       | 上次岗位变更时间  |
|  24   | is_bd |   int   | 10 |   0    |    Y     |  N   |       | 是否bd:1,是0,否  |
|  25   | is_bdm |   int   | 10 |   0    |    Y     |  N   |       | 是否bdm:1,是0,否  |
|  26   | is_cm |   int   | 10 |   0    |    Y     |  N   |       | 是否cm:1,是0,否  |
|  27   | org_cm_sets |   varchar   | 38 |   0    |    Y     |  N   |       | 机构CM负责人集  |
|  28   | org_cm_cnt |   int   | 10 |   0    |    Y     |  N   |       | 机构CM负责人数量  |
|  29   | entry_date |   varchar   | 38 |   0    |    Y     |  N   |       | 入职日期  |
|  30   | is_leave |   int   | 10 |   0    |    Y     |  N   |       | 是否离职:1,是0,否  |
|  31   | leave_date |   varchar   | 38 |   0    |    Y     |  N   |       | 离职日期  |
|  32   | leave_bd_date |   varchar   | 38 |   0    |    Y     |  N   |       | 离开bd岗的日期  |
|  33   | latest_work_dt |   varchar   | 38 |   0    |    Y     |  N   |       | 最近的工作日期  |
|  34   | onjob_days |   int   | 10 |   0    |    Y     |  N   |       | 在职天数  |
|  35   | wk_on_job_days |   int   | 10 |   0    |    Y     |  N   |       | 本周工作天数  |
|  36   | mon_on_job_days |   int   | 10 |   0    |    Y     |  N   |       | 本月工作天数  |
|  37   | bd_wk_on_job_days |   int   | 10 |   0    |    Y     |  N   |       | bd本周工作天数  |
|  38   | bd_mon_on_job_days |   int   | 10 |   0    |    Y     |  N   |       | bd本月工作天数  |
|  39   | is_this_week_join |   int   | 10 |   0    |    Y     |  N   |       | 是否本周入职:1,是0,否  |
|  40   | is_this_week_leave |   int   | 10 |   0    |    Y     |  N   |       | 是否本周离职:1,是0,否  |
|  41   | is_this_mon_join |   int   | 10 |   0    |    Y     |  N   |       | 是否本月入职:1,是0,否  |
|  42   | is_this_mon_leave |   int   | 10 |   0    |    Y     |  N   |       | 是否本月离职:1,是0,否  |
|  43   | job_status_tag |   int   | 10 |   0    |    Y     |  N   |   0    | 工作状态标签：1变更，0未变更  |
|  44   | bd_zone_id |   bigint   | 20 |   0    |    Y     |  N   |       | 分区节点ID  |
|  45   | bd_zone_name |   varchar   | 38 |   0    |    Y     |  N   |       | 分区节点名称  |
|  46   | bd_city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市节点ID  |
|  47   | bd_city_name |   varchar   | 38 |   0    |    Y     |  N   |       | 城市节点名称  |
|  48   | bd_region_id |   bigint   | 20 |   0    |    Y     |  N   |       | 大区节点ID  |
|  49   | bd_region_name |   varchar   | 38 |   0    |    Y     |  N   |       | 大区节点名称  |
|  50   | latest_org_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前的-组织机构节点ID  |
|  51   | latest_org_name |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的-组织机构节点名称  |
|  52   | latest_bd_zone_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前的-分区节点ID  |
|  53   | latest_bd_zone_name |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的-分区节点名称  |
|  54   | latest_bd_city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前的-城市节点ID  |
|  55   | latest_bd_city_name |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的-城市节点名称  |
|  56   | latest_bd_region_id |   bigint   | 20 |   0    |    Y     |  N   |       | 当前的-大区节点ID  |
|  57   | latest_bd_region_name |   varchar   | 38 |   0    |    Y     |  N   |       | 当前的-大区节点名称  |
|  58   | created_at |   varchar   | 24 |   0    |    Y     |  N   |       | 数仓数据创建时间  |

**表名：** <a id="mid_fact_caterb2b_city_csu_price_change">mid_fact_caterb2b_city_csu_price_change</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | city_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  2   | csu_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | change_amount |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    |   |
|  4   | previous_price |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    |   |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="mid_fact_caterb2b_cross_bill_detail">mid_fact_caterb2b_cross_bill_detail</a>

**说明：** 投线统计任务汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | route_no |   varchar   | 20 |   0    |    N     |  N   |       |   |
|  5   | appoint_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 履约时间  |
|  6   | cross_sorting_no |   varchar   | 50 |   0    |    N     |  N   |       | 拣货单编号  |
|  7   | cat |   int   | 10 |   0    |    N     |  N   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  8   | route_istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 排线逻辑删除正常1,删除0  |
|  9   | cross_sorting_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 投线状态10已生成20投线中30投线暂停40投线完成  |
|  10   | cross_istatus |   varchar   | 4 |   0    |    Y     |  N   |       | 逻辑删除1有效0删除  |
|  11   | cross_bill |   varchar   | 4 |   0    |    Y     |  N   |       | 逻辑删除1有效0删除  |
|  12   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  13   | actual_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  14   | detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 明细主键ID  |
|  15   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  16   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格代码  |
|  17   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人账号ID  |
|  18   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  19   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  20   | cm_dt |   int   | 10 |   0    |    Y     |  N   |   0    | CM创建时间  |
|  21   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  22   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="mid_fact_caterb2b_pick_bill_detail">mid_fact_caterb2b_pick_bill_detail</a>

**说明：** 拣货任务详情表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线号  |
|  5   | pick_bill_no |   varchar   | 50 |   0    |    N     |  N   |       | 拣货单编号  |
|  6   | appoint_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 履约时间  |
|  7   | detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 明细主键ID  |
|  8   | cat |   int   | 10 |   0    |    N     |  N   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  9   | sku_code |   int   | 10 |   0    |    N     |  N   |       | sku编码  |
|  10   | route_istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 排线逻辑删除正常1,删除0  |
|  11   | pick_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 拣货任务的状态10已生成，20拣货中30拣货完成cancel已取消  |
|  12   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  13   | actual_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  14   | handler_id |   bigint   | 20 |   0    |    Y     |  N   |       | 任务领取人账号ID  |
|  15   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  16   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  17   | cm_dt |   int   | 10 |   0    |    Y     |  N   |   0    | CM创建时间  |
|  18   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  19   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |
|  20   | zone_pick_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 分区拣货任务单号  |

**表名：** <a id="mid_fact_caterb2b_rt_activity_seckill_scene_goods">mid_fact_caterb2b_rt_activity_seckill_scene_goods</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 秒杀活动外键  |
|  2   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  Y   |   0    | 秒杀活动场次外键  |
|  3   | csu_code |   int   | 10 |   0    |    N     |  Y   |   0    |   |
|  4   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部ID  |
|  5   | sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | skuCode  |
|  6   | ssu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 秒杀商品名称  |
|  7   | discount_price |   int   | 10 |   0    |    Y     |  N   |   0    | 折扣价格  |
|  8   | price_version |   tinyint   | 3 |   0    |    Y     |  N   |   1    | 价格版本  |
|  9   | poi_top |   int   | 10 |   0    |    Y     |  N   |   0    | 门店限购数量  |
|  10   | total_top |   int   | 10 |   0    |    Y     |  N   |   0    | 总限购数量  |
|  11   | remain_top |   int   | 10 |   0    |    Y     |  N   |   0    | 剩余限购数  |
|  12   | sort_num |   int   | 10 |   0    |    Y     |  N   |   0    | 商品排序号  |
|  13   | version |   smallint   | 5 |   0    |    Y     |  N   |   1    | 商品列表快照版本号  |
|  14   | price_type |   int   | 10 |   0    |    Y     |  N   |   1    | 用户类型1-不区分；2-区分、新客价；3-区分、老客价  |
|  15   | lock_version |   int   | 10 |   0    |    Y     |  N   |   1    | 秒杀商品锁版本  |
|  16   | deleted |   bit   | 1 |   0    |    Y     |  N   |   1    | 删除标记1-正常2-删除  |
|  17   | start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 开始时间，毫秒数  |
|  18   | end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 结束时间，毫秒数  |
|  19   | state |   int   | 10 |   0    |    Y     |  N   |   0    | 约束状态，1:未开始，2:活动中，3:已暂停，4:已结束，5:已取消，6:待提审，7:操作冻结  |
|  20   | seq_no |   int   | 10 |   0    |    Y     |  N   |   0    | 秒杀场次号  |
|  21   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | dealer_id  |
|  22   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | channel_id  |
|  23   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 创建时间  |
|  24   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |

**表名：** <a id="mid_fact_caterb2b_rt_byr_csu_city">mid_fact_caterb2b_rt_byr_csu_city</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | byr_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | csu |   int   | 10 |   0    |    Y     |  N   |       |   |
|  4   | sku |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | cid |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | cnt |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | ts |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="mid_fact_caterb2b_rt_case_detail">mid_fact_caterb2b_rt_case_detail</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | case_id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | csu_code |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  3   | order_no |   varchar   | 60 |   0    |    N     |  Y   |       |   |
|  4   | question_name |   varchar   | 120 |   0    |    N     |  Y   |       |   |
|  5   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  6   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  7   | date_time |   datetime   | 19 |   0    |    N     |  Y   |       |   |
|  8   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  9   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  10   | fourth_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  11   | fourth_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  12   | fifth_category_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  13   | fifth_category_id |   int   | 10 |   0    |    Y     |  N   |       |   |

**表名：** <a id="mid_fact_caterb2b_rt_flink_marketing_activity">mid_fact_caterb2b_rt_flink_marketing_activity</a>

**说明：** 营销活动主题宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  3   | order_detail_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  4   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  7   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  8   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  9   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  10   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  11   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  12   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  13   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |
|  14   | sales_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 最终售卖金额冗余字段，目前计算逻辑:csu_amt-coupon_amt+coupon_revenue_amt  |
|  15   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  16   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  17   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  18   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  19   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  20   | sku_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  21   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  22   | order_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态冗余字段,1080:ord_status>10andord_status<=80的订单  |
|  23   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  24   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  25   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 更新时间  |

**表名：** <a id="mid_fact_caterb2b_rt_flink_order_detail">mid_fact_caterb2b_rt_flink_order_detail</a>

**说明：** 快驴订单详情事实宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |
|  45   | sku_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  46   | sku_name |   varchar   | 64 |   0    |    Y     |  N   |       | 名称  |
|  47   | sku_unit |   varchar   | 64 |   0    |    Y     |  N   |       | 单位  |
|  48   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 单位描述  |
|  49   | sale_mode |   smallint   | 6 |   0    |    Y     |  N   |       | 销售模式现货销售：0，无库存销售(预售)：1  |
|  50   | transport_category |   smallint   | 6 |   0    |    Y     |  N   |       | 商品运输品类：1标品、2蔬菜、3鲜肉  |
|  51   | warehouse_process_status |   smallint   | 6 |   0    |    Y     |  N   |       | 是否库内加工0:否1:是  |
|  52   | product_type |   smallint   | 6 |   0    |    Y     |  N   |       | 商品类型0:成品1:原料  |

**表名：** <a id="mid_fact_caterb2b_rt_flink_order_detail_bak">mid_fact_caterb2b_rt_flink_order_detail_bak</a>

**说明：** 快驴订单详情事实宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |
|  45   | hour |   varchar   | 4 |   0    |    Y     |  N   |       | 成交小时  |

**表名：** <a id="mid_fact_caterb2b_rt_flink_order_detail_with_pop">mid_fact_caterb2b_rt_flink_order_detail_with_pop</a>

**说明：** 快驴订单详情事实宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |
|  45   | sales_amt |   decimal   | 28 |   6    |    Y     |  N   |       | 销售额：csu_amt-coupon_amt+coupon_revenue_amt  |
|  46   | order_status |   int   | 10 |   0    |    Y     |  N   |       | 订单状态:1080计费订单,0不计费订单  |
|  47   | sku_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 品牌  |
|  48   | sku_name |   varchar   | 64 |   0    |    Y     |  N   |       | 名称  |
|  49   | sku_unit |   varchar   | 64 |   0    |    Y     |  N   |       | 单位  |
|  50   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 单位描述  |
|  51   | sale_mode |   smallint   | 6 |   0    |    Y     |  N   |       | 销售模式现货销售：0，无库存销售(预售)：1  |
|  52   | transport_category |   smallint   | 6 |   0    |    Y     |  N   |       | 商品运输品类：1标品、2蔬菜、3鲜肉  |
|  53   | warehouse_process_status |   smallint   | 6 |   0    |    Y     |  N   |       | 是否库内加工0:否1:是  |
|  54   | product_type |   smallint   | 6 |   0    |    Y     |  N   |       | 商品类型0:成品1:原料  |
|  55   | sales_grid_id |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖区域ID  |
|  56   | mark_word |   varchar   | 200 |   0    |    Y     |  N   |       | 订单标识位  |
|  57   | contains_3p_order |   int   | 10 |   0    |    N     |  N   |   0    | 订单是否包含3p订单  |
|  58   | is_3p_order |   int   | 10 |   0    |    N     |  N   |   0    | 是否是3p订单  |
|  59   | order_type_id |   int   | 10 |   0    |    N     |  N   |   0    | 订单3p标识，0自营，1单3p，2多3p，3混合  |
|  60   | is_self_support_order |   int   | 10 |   0    |    N     |  N   |   1    | 是否是自营订单  |
|  61   | order_split_id |   int   | 10 |   0    |    N     |  N   |   0    | 拆单标识，0普通订单，1父订单，2子订单  |
|  62   | receipt_bu_id |   int   | 10 |   0    |    Y     |  N   |       | 买家事业部ID  |

**表名：** <a id="mid_fact_caterb2b_rt_order_detail">mid_fact_caterb2b_rt_order_detail</a>

**说明：** 快驴订单详情事实宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名  |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 有价券分摊金额  |

**表名：** <a id="mid_fact_caterb2b_rt_order_detail_flink">mid_fact_caterb2b_rt_order_detail_flink</a>

**说明：** 快驴订单详情事实宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | order_date |   datetime   | 19 |   0    |    Y     |  N   |       | 订单日期  |
|  45   | bd_org_id |   int   | 10 |   0    |    Y     |  N   |       | BD机构id  |
|  46   | bd_org_name |   varchar   | 50 |   0    |    Y     |  N   |       | bd机构名  |
|  47   | bd_area_id |   int   | 10 |   0    |    Y     |  N   |       | BD父机构id  |
|  48   | bd_area_name |   varchar   | 50 |   0    |    Y     |  N   |       | bd父机构名  |
|  49   | sku_sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 销售模式现货销售：0，无库存销售(预售)：1  |
|  50   | sku_job_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 作业温层（计费）常温：1、冷藏：2、冷冻：3  |
|  51   | sku_warehouse_category |   smallint   | 6 |   0    |    Y     |  N   |       | 仓储品类：1标品，2蔬菜  |
|  52   | sku_transport_category |   smallint   | 6 |   0    |    Y     |  N   |       | 商品运输品类：1标品、2蔬菜、3鲜肉  |
|  53   | csu_brand_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 品牌ID  |
|  54   | csu_brand |   varchar   | 64 |   0    |    Y     |  N   |       | 商品品牌  |
|  55   | sku_name |   varchar   | 64 |   0    |    Y     |  N   |       | 名称  |
|  56   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 售卖单位  |
|  57   | sku_unit_desc |   varchar   | 255 |   0    |    Y     |  N   |       | SKU售卖描述  |
|  58   | is_cat3_first |   int   | 10 |   0    |    Y     |  N   |   0    | 三级类目新客标识:0:老客,1:新客  |
|  59   | payment_method |   tinyint   | 4 |   0    |    Y     |  N   |   -1    | 结款渠道:1-微信，2-支付宝，3-账期,4-余额,5-POS结款,6-组合支付(微信+余额),7-组合支付(支付宝+余额),8-线下付款  |
|  60   | sales_grid_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 售卖区域ID  |
|  61   | ba_cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 商分一级类目ID  |
|  62   | ba_cat1_name |   varchar   | 50 |   0    |    Y     |  N   |       | 商分一级类目名称  |
|  63   | ba_cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 商分二级类目ID  |
|  64   | ba_cat2_name |   varchar   | 50 |   0    |    Y     |  N   |       | 商分二级类目名称  |
|  65   | org_cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 组织一级分类ID  |
|  66   | org_cat1_name |   varchar   | 100 |   0    |    Y     |  N   |       | 组织一级分类名  |
|  67   | org_cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 组织二级分类ID  |
|  68   | org_cat2_name |   varchar   | 100 |   0    |    Y     |  N   |       | 组织二级分类名  |
|  69   | org_cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 组织三级分类ID  |
|  70   | org_cat3_name |   varchar   | 100 |   0    |    Y     |  N   |       | 组织三级分类名  |
|  71   | kpi_id |   bigint   | 20 |   0    |    Y     |  N   |       | kpi分类ID  |
|  72   | kpi_cat_name |   varchar   | 100 |   0    |    Y     |  N   |       | kpi分类名  |
|  73   | order_status |   int   | 10 |   0    |    Y     |  N   |       | 订单状态:1=(10,80],2=90  |

**表名：** <a id="mid_fact_caterb2b_rt_purchase_inbound">mid_fact_caterb2b_rt_purchase_inbound</a>

**说明：** 采购入库中间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购入库履约时间  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   0000-00-0000:00:00    | 采购单创建时间  |
|  5   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  6   | wh_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名称  |
|  7   | creator_name |   varchar   | 255 |   0    |    Y     |  N   |       | 采购单创建人  |
|  8   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |   1    | 采购单号  |
|  9   | supplier_id |   int   | 10 |   0    |    Y     |  N   |       | 服务商id  |
|  10   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |   1    | 服务商名称  |
|  11   | estimate_arr_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购单预计到达时间  |
|  12   | standard_disc_time |   datetime   | 19 |   0    |    Y     |  N   |       | 标准卸货时间  |
|  13   | standard_arr_time |   datetime   | 19 |   0    |    Y     |  N   |       | 标准到货时间  |
|  14   | purchase_valid |   smallint   | 6 |   0    |    Y     |  N   |       | 采购单删除标志1:正常,2:删除,0:异常  |
|  15   | pur_status |   smallint   | 6 |   0    |    Y     |  N   |       | 采购单状态，0:待确认，1：已确认，2：已完成，3：已取消  |
|  16   | approval_status |   smallint   | 6 |   0    |    Y     |  N   |       | 审批状态，0：待审核，1：审核中，2：审核完成，3：已驳回，4：已撤销  |
|  17   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  18   | arrive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库单预计到达时间  |
|  19   | inbound_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购入库完成时间  |
|  20   | inbound_bill_status |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单状态：1未完成,2完成,3取消,4生成任务单,5收货中,6收货完成,7上架中,8上架完成  |
|  21   | inbound_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库单创建时间  |
|  22   | inbound_istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单删除状态1：有效0：删除  |
|  23   | purchase_sale_type |   smallint   | 6 |   0    |    Y     |  N   |       | 是否预售0：非预售,1：预售  |
|  24   | inbound_bill_detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 采购入库单明细id  |
|  25   | purchase_qty |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  26   | receive_qty |   int   | 10 |   0    |    Y     |  N   |       | 收货数  |
|  27   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |       | SKU编码  |
|  28   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | 规格代码  |
|  29   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 规格  |
|  30   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 单位  |
|  31   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  32   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  33   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  34   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  35   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  36   | sku_category3_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  37   | vendor_arrive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 到货时间  |
|  38   | vendor_discharge_time |   datetime   | 19 |   0    |    Y     |  N   |       | 供应商供应商卸货时间卸货时间  |
|  39   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  40   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  41   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型：0-全部；1-自营；2-pop；3-代仓代配  |

**表名：** <a id="mid_fact_caterb2b_rt_purchase_inbound_car">mid_fact_caterb2b_rt_purchase_inbound_car</a>

**说明：** 供应上商到货车次明细

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  5   | wh_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名称  |
|  6   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |   1    | 采购单号  |
|  7   | supplier_id |   int   | 10 |   0    |    Y     |  N   |       | 服务商id  |
|  8   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |   1    | 服务商名称  |
|  9   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  10   | asn_bill_istatus |   smallint   | 5 |   0    |    Y     |  N   |   1    | 预约单逻辑删除：1-正常，0-删除  |
|  11   | car_sequence |   smallint   | 5 |   0    |    Y     |  N   |   1    | 签到车次排序标识  |
|  12   | car_plate |   varchar   | 64 |   0    |    Y     |  N   |       | 签到车牌照  |
|  13   | sign_from |   smallint   | 5 |   0    |    Y     |  N   |   2    | 签到来源：0-司机扫码，1-PC签到，2-初始值，3-系统自动签到  |
|  14   | sign_status |   smallint   | 6 |   0    |    Y     |  N   |   2    | 签到状态：0-成功，1-失败，2-初始值  |
|  15   | reserve_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预约开始时间  |
|  16   | reserve_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预约结束时间  |
|  17   | sign_time |   datetime   | 19 |   0    |    Y     |  N   |       | 车次签到时间  |
|  18   | unload_time |   datetime   | 19 |   0    |    Y     |  N   |       | 车次卸货完成时间  |
|  19   | sign_fail_reason |   varchar   | 128 |   0    |    Y     |  N   |       | 签到失败原因  |
|  20   | car_istatus |   smallint   | 5 |   0    |    Y     |  N   |   1    | 逻辑删除：1-正常，0-删除  |
|  21   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  22   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  23   | sign_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总签到车次数  |
|  24   | unload_all_car_cnt |   int   | 10 |   0    |    Y     |  N   |   0    | 总卸货车次数  |
|  25   | goods_owner_type |   smallint   | 6 |   0    |    Y     |  N   |       | 货主类型：0-全部；1-自营；2-pop；3-代仓代配  |

**表名：** <a id="mid_fact_caterb2b_rt_purchase_inbound_flink">mid_fact_caterb2b_rt_purchase_inbound_flink</a>

**说明：** 采购入库中间表-Flink

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | purchase_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购入库履约时间  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   0000-00-0000:00:00    | 采购单创建时间  |
|  5   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  6   | wh_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名称  |
|  7   | creator_name |   varchar   | 255 |   0    |    Y     |  N   |       | 采购单创建人  |
|  8   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  9   | supplier_id |   int   | 10 |   0    |    Y     |  N   |       | 服务商id  |
|  10   | supplier_name |   varchar   | 255 |   0    |    Y     |  N   |       | 服务商名称  |
|  11   | estimate_arr_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购单预计到达时间  |
|  12   | standard_arr_time |   datetime   | 19 |   0    |    Y     |  N   |       | 标准到货时间  |
|  13   | purchase_valid |   smallint   | 6 |   0    |    Y     |  N   |       | 采购单删除标志1:正常,2:删除,0:异常  |
|  14   | pur_status |   smallint   | 6 |   0    |    Y     |  N   |       | 采购单状态，0:待确认，1：已确认，2：已完成，3：已取消  |
|  15   | approval_status |   smallint   | 6 |   0    |    Y     |  N   |       | 审批状态，0：待审核，1：审核中，2：审核完成，3：已驳回，4：已撤销  |
|  16   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 采购单号  |
|  17   | arrive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库单预计到达时间  |
|  18   | inbound_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购入库完成时间  |
|  19   | inbound_bill_status |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单状态：1未完成,2完成,3取消,4生成任务单,5收货中,6收货完成,7上架中,8上架完成  |
|  20   | inbound_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库单创建时间  |
|  21   | inbound_istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单删除状态1：有效0：删除  |
|  22   | inbound_bill_detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 采购入库单明细id  |
|  23   | purchase_qty |   int   | 10 |   0    |    Y     |  N   |       | 采购数量  |
|  24   | receive_qty |   int   | 10 |   0    |    Y     |  N   |       | 收货数  |
|  25   | base_sku_code |   int   | 10 |   0    |    Y     |  N   |       | SKU编码  |
|  26   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | 规格代码  |
|  27   | sku_unit_desc |   varchar   | 64 |   0    |    Y     |  N   |       | 规格  |
|  28   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | 单位  |
|  29   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | sku类目1id  |
|  30   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | sku类目1名字  |
|  31   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | sku类目2id  |
|  32   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       | sku类目2名字  |
|  33   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       | sku类目3id  |
|  34   | sku_category3_name |   varchar   | 64 |   0    |    Y     |  N   |       | sku类目3名字  |
|  35   | vendor_arrive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 到货时间  |
|  36   | vendor_discharge_time |   datetime   | 19 |   0    |    Y     |  N   |       | 供应商供应商卸货时间卸货时间  |
|  37   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  38   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  39   | purchase_sale_type |   smallint   | 6 |   0    |    Y     |  N   |       | 采购售卖类型  |

**表名：** <a id="mid_fact_caterb2b_rt_standard_stock_sku">mid_fact_caterb2b_rt_standard_stock_sku</a>

**说明：** 非预售品库存汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | location_id |   bigint   | 20 |   0    |    N     |  N   |       | 库位id  |
|  5   | location_code |   varchar   | 32 |   0    |    N     |  N   |       | 库位编码  |
|  6   | storage_type |   smallint   | 6 |   0    |    N     |  N   |       | 贮存方式常温：1、冷藏：2、冷冻：3  |
|  7   | job_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 作业温层（计费）常温：1、冷藏：2、冷冻：3  |
|  8   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 商品编码  |
|  9   | sku_category1_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 一级分类ID  |
|  10   | sku_category2_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 二级分类ID  |
|  11   | sku_category3_id |   bigint   | 20 |   0    |    N     |  N   |   0    | 三级分类ID  |
|  12   | sku_category1_name |   varchar   | 64 |   0    |    N     |  N   |       | 一级分类名称  |
|  13   | sku_category2_name |   varchar   | 64 |   0    |    N     |  N   |       | 二级分类名称  |
|  14   | sku_category3_name |   varchar   | 64 |   0    |    N     |  N   |       | 三级分类名称  |
|  15   | sku_pack_spec |   int   | 10 |   0    |    N     |  N   |   1    | 包装率  |
|  16   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 商品编码  |
|  17   | total_qty |   int   | 10 |   0    |    N     |  N   |   0    | 总库存  |
|  18   | available_qty |   int   | 10 |   0    |    N     |  N   |   0    | 可用库存  |
|  19   | lock_qty |   int   | 10 |   0    |    N     |  N   |   0    | 锁定数量  |
|  20   | freeze_qty |   int   | 10 |   0    |    N     |  N   |   0    | 冻结数量  |
|  21   | sku_name |   varchar   | 64 |   0    |    N     |  N   |       | 名称  |
|  22   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 单位  |
|  23   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 单位描述  |
|  24   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1正常0删除  |
|  25   | hour_str |   varchar   | 16 |   0    |    N     |  N   |       | 小时  |
|  26   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  27   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="mid_fact_caterb2b_rt_stock_sku">mid_fact_caterb2b_rt_stock_sku</a>

**说明：** 库存预警汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | location_code |   varchar   | 32 |   0    |    N     |  N   |       | 库位编码  |
|  5   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 商品编码  |
|  6   | sku_pack_spec |   int   | 10 |   0    |    N     |  N   |   1    | 包装率  |
|  7   | base_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | 商品编码  |
|  8   | total_qty |   int   | 10 |   0    |    N     |  N   |   0    | 总库存  |
|  9   | available_qty |   int   | 10 |   0    |    N     |  N   |   0    | 可用库存  |
|  10   | lock_qty |   int   | 10 |   0    |    N     |  N   |   0    | 锁定数量  |
|  11   | freeze_qty |   int   | 10 |   0    |    N     |  N   |   0    | 冻结数量  |
|  12   | sku_name |   varchar   | 64 |   0    |    N     |  N   |       | 名称  |
|  13   | sku_unit |   varchar   | 64 |   0    |    N     |  N   |       | 单位  |
|  14   | sku_unit_desc |   varchar   | 64 |   0    |    N     |  N   |       | 单位描述  |
|  15   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1正常0删除  |
|  16   | hour_str |   varchar   | 16 |   0    |    N     |  N   |       | 小时  |
|  17   | create_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  18   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_delivery">mid_fact_caterb2b_rt_wh_delivery</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | outbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  4   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  5   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  6   | return_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  7   | delivery_route_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  8   | delivery_route_no |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  9   | outbound_bill_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | outbound_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  11   | outbound_delivery_times |   varchar   | 256 |   0    |    Y     |  N   |       |   |
|  12   | order_shortage |   int   | 10 |   0    |    Y     |  N   |       |   |
|  13   | outbound_cancel_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  14   | delivery_bill_no |   varchar   | 32 |   0    |    N     |  Y   |       |   |
|  15   | is_completed |   varchar   | 4 |   0    |    Y     |  N   |       |   |
|  16   | is_abnormal_signed |   varchar   | 4 |   0    |    Y     |  N   |       |   |
|  17   | delivery_bill_status |   varchar   | 4 |   0    |    Y     |  N   |       |   |
|  18   | delivery_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  19   | unit_total |   int   | 10 |   0    |    Y     |  N   |       |   |
|  20   | service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  21   | delivery_is_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  22   | order_label |   int   | 10 |   0    |    Y     |  N   |       |   |
|  23   | address_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  24   | is_complete_short_supply |   smallint   | 6 |   0    |    Y     |  N   |       | 是否整单缺货  |
|  25   | service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  26   | route_date |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  27   | route_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  28   | route_is_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  29   | route_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  30   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  31   | route_final_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  32   | route_task_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  33   | route_depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  34   | route_accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  35   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  36   | wh_name |   varchar   | 45 |   0    |    Y     |  N   |       |   |
|  37   | ago_minutes |   int   | 10 |   0    |    Y     |  N   |       |   |
|  38   | delivery_cancel_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  39   | outbound_is_status |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | wrap_qty |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | actual_delivery_qty |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  42   | driver_id |   int   | 10 |   0    |    Y     |  N   |       | 司机id  |
|  43   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机姓名  |
|  44   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 排线名称  |
|  45   | vehicle_type_id |   int   | 10 |   0    |    Y     |  N   |       | 车型id  |
|  46   | volume_total |   decimal   | 16 |   3    |    Y     |  N   |       | 体积立方  |
|  47   | weight_total |   decimal   | 16 |   3    |    Y     |  N   |       | 重量KG  |
|  48   | cooperation_mode |   smallint   | 6 |   0    |    Y     |  N   |       |   |
|  49   | accept_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否已接单  |
|  50   | actual_delivery_time |   varchar   | 32 |   0    |    Y     |  N   |       | 实际配送时间  |
|  51   | sign_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 签收类型1：正常签收；2：整单拒收；3：部分签收；4：物流代签  |
|  52   | driver_service_provider_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  53   | route_order_label |   smallint   | 6 |   0    |    Y     |  N   |       |   |
|  54   | start_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段起始时间(分钟数)  |
|  55   | end_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段结束时间(分钟数)  |
|  56   | delivery_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段结束时间(分钟数)  |
|  57   | lable_end_min |   int   | 10 |   0    |    Y     |  N   |       | 大宗订单配送时段结束时间(分钟数)  |
|  58   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  59   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  60   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 客户ID  |
|  61   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 门店ID  |
|  62   | poi_name |   varchar   | 255 |   0    |    Y     |  N   |       | 门店名称  |
|  63   | bd_name |   varchar   | 128 |   0    |    Y     |  N   |       | bd名  |
|  64   | sign_mode |   smallint   | 6 |   0    |    Y     |  N   |   0    | 签收方式1：当面签收；2：非当面签收  |
|  65   | expect_delivery_time_start |   datetime   | 19 |   0    |    Y     |  N   |       | 期望收货时间开始  |
|  66   | expect_delivery_time_end |   datetime   | 19 |   0    |    Y     |  N   |       | 期望收货时间结束  |
|  67   | delivery_remark |   varchar   | 255 |   0    |    N     |  N   |       | 配送备注  |
|  68   | region_id |   int   | 10 |   0    |    N     |  N   |   0    | 网格id  |
|  69   | region_name |   varchar   | 255 |   0    |    Y     |  N   |       | 区域名称  |
|  70   | route_transfer_type |   int   | 10 |   0    |    N     |  N   |   0    | 单据转移类型0正常1被调单2调单3被救援4救援  |
|  71   | delivery_feedback_times |   datetime   | 19 |   0    |    N     |  N   |       | 城市反馈发车时间  |
|  72   | ontime_status |   int   | 10 |   0    |    Y     |  N   |   0    | 及时状态:0-未知1-及时2-未及时  |
|  73   | depart_ontime_status |   int   | 10 |   0    |    Y     |  N   |   0    | 发车及时状态:0-未知1-及时2-未及时  |
|  74   | audit_committed |   int   | 10 |   0    |    Y     |  N   |   0    | 是否审核1：是0：否  |
|  75   | route_status_new |   int   | 10 |   0    |    Y     |  N   |   0    | 排线状态。0：无意义老数据，10：初始态，20：已审核30：已绑定40：已下发50：已接线60：已核货70：已发车80：已完成  |
|  76   | customer_level |   varchar   | 32 |   0    |    Y     |  N   |       | 客户级别  |
|  77   | order_category_label |   int   | 10 |   0    |    Y     |  N   |   0    | 订单运输品类0：空；1：全标品；2:含蔬菜；4：含鲜肉；6：含蔬菜，含鲜肉；8:含冻品；10：含蔬菜，含冻品；12：含鲜肉，含冻品；14：含蔬菜，含鲜肉，含冻品  |
|  78   | delivery_product |   varchar   | 128 |   0    |    N     |  N   |       | 配送产品  |
|  79   | supervisor |   varchar   | 64 |   0    |    Y     |  N   |       | 区域责任主管  |
|  80   | sign_in_state |   int   | 10 |   0    |    N     |  N   |   -1    | 报名状态，如：-1未知0未签到1已签到  |
|  81   | time_interval |   int   | 10 |   0    |    Y     |  N   |       | 1:上午2:下午  |
|  82   | arrive_wh_time |   datetime   | 19 |   0    |    Y     |  N   |       | 班次到仓时间  |
|  83   | shift_id |   bigint   | 20 |   0    |    Y     |  N   |       | 班次到仓时间  |
|  84   | sign_in_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到起始时间  |
|  85   | sign_in_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到截止时间  |
|  86   | sign_in_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到时间  |
|  87   | order_amt |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 下单金额  |
|  88   | avg_delivery_time |   double   | 23 |   0    |    Y     |  N   |       | 单仓商户平均配送时长  |
|  89   | source_cooperation_mode |   int   | 10 |   0    |    Y     |  N   |       | 原线路司机履约服务商合作模式：0未知10自营20三方  |
|  90   | mall_delivery_times |   varchar   | 512 |   0    |    Y     |  N   |       | 商城配送时段  |
|  91   | mall_start_min |   int   | 10 |   0    |    Y     |  N   |       | 商城配送时段起始时间(分钟数)  |
|  92   | mall_end_min |   int   | 10 |   0    |    Y     |  N   |       | 商城配送时段结束时间(分钟数)  |
|  93   | ext_customer_route_id |   varchar   | 1024 |   0    |    Y     |  N   |       | 履约次数id:客户id+线路id  |
|  94   | source_driver_name |   varchar   | 512 |   0    |    Y     |  N   |       | 原线路司机名称  |
|  95   | customer_region_id |   int   | 10 |   0    |    Y     |  N   |       | 客户所在配区id  |
|  96   | customer_supervisor |   varchar   | 512 |   0    |    Y     |  N   |       | 客户所在配区责任调度  |
|  97   | area_name |   varchar   | 200 |   0    |    Y     |  N   |       | 大区名称  |
|  98   | source_driver_service_provider_name |   varchar   | 512 |   0    |    Y     |  N   |       | 原线路司机履约服务商  |
|  99   | customer_region_name |   varchar   | 512 |   0    |    Y     |  N   |       | 客户所在配区名称  |
|  100   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 大区ID  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_delivery_flink">mid_fact_caterb2b_rt_wh_delivery_flink</a>

**说明：** 配送明细实时宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | delivery_detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送单明细id  |
|  3   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | dtl_cdate |   date   | 10 |   0    |    Y     |  N   |       | 明细创建日期  |
|  5   | dtl_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 明细创建时间  |
|  6   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  7   | address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送地址  |
|  8   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店ID  |
|  9   | driver_id |   int   | 10 |   0    |    Y     |  N   |       | 司机id  |
|  10   | delivery_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 配送单号  |
|  11   | outbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 出库单号  |
|  12   | order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 订单号  |
|  13   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道  |
|  14   | return_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 退货单号  |
|  15   | delivery_route_id |   bigint   | 20 |   0    |    Y     |  N   |       | 排线ID  |
|  16   | delivery_route_no |   varchar   | 64 |   0    |    Y     |  N   |       | 排序编号  |
|  17   | outbound_bill_status |   int   | 10 |   0    |    Y     |  N   |       | 出库单状态  |
|  18   | outbound_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 出库时间  |
|  19   | outbound_delivery_times |   varchar   | 64 |   0    |    Y     |  N   |       | 配送时段  |
|  20   | order_shortage |   int   | 10 |   0    |    Y     |  N   |       | 是否缺货:0缺货1不缺货  |
|  21   | outbound_cancel_status |   int   | 10 |   0    |    Y     |  N   |       | 出库单取消状态：1取消0未取消  |
|  22   | is_completed |   varchar   | 64 |   0    |    Y     |  N   |       | 是否配送完成：已完成1未完成0  |
|  23   | is_abnormal_signed |   varchar   | 64 |   0    |    Y     |  N   |       | 是否地址异常:是1否0  |
|  24   | delivery_bill_status |   varchar   | 64 |   0    |    Y     |  N   |       | 配送单状态:1已生成2已发车3已送达  |
|  25   | delivery_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 配送完成时间  |
|  26   | unit_total |   int   | 10 |   0    |    Y     |  N   |       | 订单件数  |
|  27   | service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 所属区域的履约服务商  |
|  28   | delivery_is_status |   int   | 10 |   0    |    Y     |  N   |       | 配送单逻辑删除:0删除，1正常  |
|  29   | order_label |   int   | 10 |   0    |    Y     |  N   |       | 订单标签，0：未知，1：普通订单；2：大宗订单  |
|  30   | service_provider_name |   varchar   | 1024 |   0    |    Y     |  N   |       | 所属区域的履约服务商名称  |
|  31   | route_date |   datetime   | 19 |   0    |    Y     |  N   |       | 排线日期  |
|  32   | route_status |   int   | 10 |   0    |    Y     |  N   |       | 排线状态1：待接线，2：已接线，3：已发车,  |
|  33   | route_is_status |   int   | 10 |   0    |    Y     |  N   |       | 排线状态。1：待接线，2：已接线，3：已发车,4已完成，5已核货  |
|  34   | route_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 排线配送单完成时间  |
|  35   | route_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 排线履约日期  |
|  36   | route_final_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最终完成时间  |
|  37   | route_take_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货单完成时间  |
|  38   | route_depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  39   | route_accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  40   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |
|  41   | appointment_time |   datetime   | 19 |   0    |    Y     |  N   |       | 配送单履约时间  |
|  42   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
|  43   | ago_minutes |   int   | 10 |   0    |    Y     |  N   |       | 标准出库时间  |
|  44   | delivery_cancel_status |   int   | 10 |   0    |    Y     |  N   |       | 配送单是否取消1：取消0：未取消  |
|  45   | outbound_is_status |   int   | 10 |   0    |    Y     |  N   |       | 出库单逻辑删除:0删除  |
|  46   | wrap_qty |   int   | 10 |   0    |    Y     |  N   |       | 配送单包装物数量  |
|  47   | actual_delivery_qty |   int   | 10 |   0    |    Y     |  N   |       | 配送单数量  |
|  48   | driver_name |   varchar   | 64 |   0    |    Y     |  N   |       | 司机姓名  |
|  49   | route_name |   varchar   | 64 |   0    |    Y     |  N   |       | 排线名称  |
|  50   | vehicle_type_id |   int   | 10 |   0    |    Y     |  N   |       | 车型id  |
|  51   | vehicle_type_name |   varchar   | 64 |   0    |    Y     |  N   |       | 明细创建时间  |
|  52   | volume_total |   decimal   | 16 |   3    |    Y     |  N   |       | 体积立方  |
|  53   | weight_total |   decimal   | 16 |   3    |    Y     |  N   |       | 重量KG  |
|  54   | cooperation_mode |   int   | 10 |   0    |    Y     |  N   |       | 服务商合作模式:0未知10自营20三方  |
|  55   | accept_status |   int   | 10 |   0    |    Y     |  N   |       | 是否已接单  |
|  56   | actual_delivery_time |   varchar   | 64 |   0    |    Y     |  N   |       | 实际配送时间  |
|  57   | sign_type |   int   | 10 |   0    |    Y     |  N   |       | 签收类型1：正常签收；2：整单拒收；3：部分签收；4：物流代签  |
|  58   | driver_service_provider_id |   int   | 10 |   0    |    Y     |  N   |       | 司机所属服务商ID  |
|  59   | driver_service_provider_name |   varchar   | 64 |   0    |    Y     |  N   |       | 司机所属服务商名称  |
|  60   | route_order_label |   int   | 10 |   0    |    Y     |  N   |       | 排线订单标签:1：普通订单；2：大宗订单  |
|  61   | start_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段起始时间(分钟数)  |
|  62   | end_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段结束时间(分钟数)  |
|  63   | delivery_min |   int   | 10 |   0    |    Y     |  N   |       | 配送时段结束时间(分钟数)  |
|  64   | lable_end_min |   int   | 10 |   0    |    Y     |  N   |       | 大宗订单配送时段结束时间(分钟数)  |
|  65   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级类目id  |
|  66   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  67   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级类目id  |
|  68   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级类目名称  |
|  69   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级类目id  |
|  70   | sku_category3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级类目名称  |
|  71   | delivery_qty |   int   | 10 |   0    |    Y     |  N   |       | 数量  |
|  72   | volume |   decimal   | 21 |   2    |    Y     |  N   |       | 体积立方厘米  |
|  73   | gross_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 毛重  |
|  74   | net_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 净重  |
|  75   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku_code  |
|  76   | order_hour |   varchar   | 64 |   0    |    Y     |  N   |       | 小时  |
|  77   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户ID  |
|  78   | customer_level |   varchar   | 64 |   0    |    Y     |  N   |       | 客户级别  |
|  79   | poi_name |   varchar   | 1024 |   0    |    Y     |  N   |       | 门店名称  |
|  80   | bd_name |   varchar   | 64 |   0    |    Y     |  N   |       | bd名  |
|  81   | bd_phone |   varchar   | 64 |   0    |    Y     |  N   |       | bd电话  |
|  82   | sign_mode |   smallint   | 6 |   0    |    Y     |  N   |       | 签收方式1：当面签收；2：非当面签收  |
|  83   | sku_name |   varchar   | 64 |   0    |    Y     |  N   |       | sku名称  |
|  84   | sku_unit_desc |   varchar   | 1024 |   0    |    Y     |  N   |       | sku_规格  |
|  85   | sku_unit |   varchar   | 64 |   0    |    Y     |  N   |       | 单位  |
|  86   | sku_price |   varchar   | 64 |   0    |    Y     |  N   |       | 单价  |
|  87   | expect_delivery_time_start |   datetime   | 19 |   0    |    Y     |  N   |       | 期望收货时间开始  |
|  88   | expect_delivery_time_end |   datetime   | 19 |   0    |    Y     |  N   |       | 期望收货时间结束  |
|  89   | delivery_remark |   varchar   | 1024 |   0    |    Y     |  N   |       | 配送备注  |
|  90   | region_id |   int   | 10 |   0    |    Y     |  N   |       | 配送区域id  |
|  91   | region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 区域名称  |
|  92   | route_transfer_type |   int   | 10 |   0    |    Y     |  N   |       | 单据转移类型0正常1被调单2调单3被救援4救援  |
|  93   | delivery_feedback_times |   int   | 10 |   0    |    Y     |  N   |       | 城市反馈发车时间  |
|  94   | audit_committed |   int   | 10 |   0    |    Y     |  N   |       | 是否审核1：是0：否  |
|  95   | route_status_new |   int   | 10 |   0    |    Y     |  N   |       | 排线状态。0：无意义老数据，10：初始态，20：已审核30：已绑定40：已下发50：已接线60：已核货70：已发车80：已完成  |
|  96   | order_category_label |   int   | 10 |   0    |    Y     |  N   |       | 订单运输品类0：空；1：全标品；2:含蔬菜；4：含鲜肉；6：含蔬菜，含鲜肉；8:含冻品；10：含蔬菜，含冻品；12：含鲜肉，含冻品；14：含蔬菜，含鲜肉，含冻品  |
|  97   | delivery_product |   int   | 10 |   0    |    Y     |  N   |       | 配送产品名称0：未知1：极鲜达2：下午达3：标准达  |
|  98   | supervisor |   varchar   | 64 |   0    |    Y     |  N   |       | 区域责任主管  |
|  99   | depart_ontime_status |   int   | 10 |   0    |    Y     |  N   |       | 发车及时状态:0-未知1-及时2-未及时  |
|  100   | delivery_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 配送单创建时间  |
|  101   | delivery_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 配送单修改时间  |
|  102   | dtl_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 配送单明细修改时间  |
|  103   | out_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 出库单修改时间  |
|  104   | route_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 排线单修改时间  |
|  105   | is_complete_short_supply |   int   | 10 |   0    |    Y     |  N   |       | 是否整单缺货  |
|  106   | sign_in_state |   int   | 10 |   0    |    Y     |  N   |       | 司机签到状态：-1未知0未签到1已签到  |
|  107   | time_interval |   int   | 10 |   0    |    Y     |  N   |       | 1:上午2:下午  |
|  108   | arrive_wh_time |   datetime   | 19 |   0    |    Y     |  N   |       | 班次到仓时间  |
|  109   | shift_id |   bigint   | 20 |   0    |    Y     |  N   |       | 班次  |
|  110   | sign_in_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到起始时间  |
|  111   | sign_in_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到截止时间  |
|  112   | sign_in_time |   datetime   | 19 |   0    |    Y     |  N   |       | 签到时间  |
|  113   | sort_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 分拣完成时间  |
|  114   | check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 复核完成时间  |
|  115   | route_load_weight |   decimal   | 21 |   3    |    Y     |  N   |       | 毛重  |
|  116   | route_volume |   decimal   | 21 |   5    |    Y     |  N   |       | 净重  |
|  117   | avg_delivery_time |   decimal   | 21 |   4    |    Y     |  N   |       | 单仓商品平均配送时长  |
|  118   | source_driver_name |   varchar   | 64 |   0    |    Y     |  N   |       | 原线路司机名称  |
|  119   | customer_region_id |   int   | 10 |   0    |    Y     |  N   |       | 客户所在配区id  |
|  120   | customer_supervisor |   varchar   | 64 |   0    |    Y     |  N   |       | 客户所在配区责任调度  |
|  121   | area_name |   varchar   | 200 |   0    |    Y     |  N   |       | 大区名称  |
|  122   | source_driver_service_provider_name |   varchar   | 512 |   0    |    Y     |  N   |       | 原线路司机履约服务商  |
|  123   | customer_region_name |   varchar   | 64 |   0    |    Y     |  N   |       | 客户所在配区名称  |
|  124   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 大区ID  |
|  125   | source_cooperation_mode |   int   | 10 |   0    |    Y     |  N   |       | 原线路司机履约服务商合作模式：0未知10自营20三方  |
|  126   | warehouse_process_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否库内加工0:否1:是  |
|  127   | product_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 商品类型0:成品1:原料  |
|  128   | storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 贮存方式  |
|  129   | outer_packing_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 外包装转化率（箱规）  |
|  130   | sale_mode |   smallint   | 6 |   0    |    Y     |  N   |   0    | 销售模式现货销售：0，无库存销售(预售)：1  |
|  131   | sku_type |   int   | 10 |   0    |    Y     |  N   |       | 商品类型,100:正常商品，200：包装物，300：原材料  |
|  132   | expect_sign_mode |   smallint   | 6 |   0    |    Y     |  N   |       | 客户期望签收方式0未选择1当面签收2非当面签收  |
|  133   | mall_delivery_times |   varchar   | 64 |   0    |    Y     |  N   |       | 商城配送时段  |
|  134   | mall_start_min |   int   | 10 |   0    |    Y     |  N   |       | 商城配送时段起始时间(分钟数)  |
|  135   | mall_end_min |   int   | 10 |   0    |    Y     |  N   |       | 商城配送时段结束时间(分钟数)  |
|  136   | ext_customer_route_id |   varchar   | 1024 |   0    |    Y     |  N   |       | 履约次数id:客户id+线路id  |
|  137   | parent_seller_management_type |   smallint   | 6 |   0    |    Y     |  N   |       | 父单卖家类型0:自营1:单pop2:多pop3:混合  |
|  138   | seller_management_type |   smallint   | 6 |   0    |    Y     |  N   |       | 卖家类型0:自营1:单pop  |
|  139   | seller_bu_name |   varchar   | 64 |   0    |    Y     |  N   |       | 卖家名称  |
|  140   | parent_order_no |   varchar   | 64 |   0    |    Y     |  N   |       | 父订单号  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_delivery_take">mid_fact_caterb2b_rt_wh_delivery_take</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  5   | route_istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 排线单逻辑删除:0删除  |
|  6   | route_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 排线状态。1：待接线，2：已接线，3：已发车  |
|  7   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约日期  |
|  8   | delivery_take_no |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  9   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  10   | return_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  11   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  12   | take_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 提货单类型1：退货；2：包装物；3：换货  |
|  13   | take_istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 提货单逻辑删除:0删除  |
|  14   | take_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 提货单状态:1已生成,2已排线,3已发车,4已提货,5提货失败,6已返仓,7已取消  |
|  15   | take_source |   smallint   | 6 |   0    |    Y     |  N   |   1    | 渠道来源1：客服；2：司机APP  |
|  16   | take_address_id |   int   | 10 |   0    |    Y     |  N   |       | 提货商家地址id  |
|  17   | take_is_abnormal_signed |   varchar   | 4 |   0    |    Y     |  N   |       | 是否异常是：1；否：0  |
|  18   | take_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货完成时间  |
|  19   | business_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名称  |
|  20   | order_category_label |   smallint   | 6 |   0    |    Y     |  N   |       | 订单运输品类0：空；1：全标品；2:含蔬菜；4：含鲜肉；6：含蔬菜，含鲜肉；8:含冻品；10：含蔬菜，含冻品；12：含鲜肉，含冻品；14：含蔬菜，含鲜肉，含冻品  |
|  21   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 派车单名称  |
|  22   | delivery_plan_qty |   int   | 10 |   0    |    Y     |  N   |       | 计划提货量  |
|  23   | delivery_real_qty |   int   | 10 |   0    |    Y     |  N   |       | 实际提货量  |
|  24   | driver_service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 司机所属服务商id  |
|  25   | driver_service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属服务商名称  |
|  26   | vehicle_type_id |   bigint   | 20 |   0    |    Y     |  N   |       | 车型ID  |
|  27   | vehicle_type_name |   varchar   | 64 |   0    |    Y     |  N   |       | 车型名称  |
|  28   | transport_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 运输方式1：专车；2：顺风车  |
|  29   | take_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货单创建时间  |
|  30   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 派车单创建时间  |
|  31   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  32   | depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  33   | delivery_take_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货时间  |
|  34   | return_warehouse_time |   datetime   | 19 |   0    |    Y     |  N   |       | 返仓时间  |
|  35   | take_reason |   varchar   | 1024 |   0    |    Y     |  N   |       | 退货原因描述  |
|  36   | abnormal_reason |   varchar   | 1024 |   0    |    Y     |  N   |       | 提货失败原因  |
|  37   | abnormal_desc |   varchar   | 1024 |   0    |    Y     |  N   |       | 提货失败详细描述  |
|  38   | appointment_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  39   | driver_id |   bigint   | 20 |   0    |    Y     |  N   |       | 司机id  |
|  40   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机名称  |
|  41   | driver_take_type |   smallint   | 6 |   0    |    Y     |  N   |       | 领取方式0:未领取10:司机APP20:排线  |
|  42   | return_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 返仓履约时间  |
|  43   | ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 配送单创建时间  |
|  44   | utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  45   | time_interval |   int   | 10 |   0    |    Y     |  N   |       | 1:上午2:下午  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_delivery_take_flink">mid_fact_caterb2b_rt_wh_delivery_take_flink</a>

**说明：** 提货明细宽表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | delivery_take_id |   bigint   | 20 |   0    |    N     |  N   |       | 明细id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  5   | route_no |   varchar   | 20 |   0    |    Y     |  N   |       | 排线号  |
|  6   | route_istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 排线单逻辑删除:0删除  |
|  7   | route_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 排线状态。1：待接线，2：已接线，3：已发车  |
|  8   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约日期  |
|  9   | delivery_take_no |   varchar   | 32 |   0    |    Y     |  N   |       |   |
|  10   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  11   | return_no |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  12   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       |   |
|  13   | take_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 提货单类型1：退货；2：包装物；3：换货  |
|  14   | take_istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 提货单逻辑删除:0删除  |
|  15   | take_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 提货单状态:1已生成,2已排线,3已发车,4已提货,5提货失败,6已返仓,7已取消  |
|  16   | take_source |   smallint   | 6 |   0    |    Y     |  N   |   1    | 渠道来源1：客服；2：司机APP  |
|  17   | take_address_id |   int   | 10 |   0    |    Y     |  N   |       | 提货商家地址id  |
|  18   | take_is_abnormal_signed |   varchar   | 4 |   0    |    Y     |  N   |       | 是否异常是：1；否：0  |
|  19   | take_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货完成时间  |
|  20   | business_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商家名称  |
|  21   | order_category_label |   smallint   | 6 |   0    |    Y     |  N   |       | 订单运输品类0：空；1：全标品，2:含蔬菜，4：含鲜肉，6：含蔬菜，含鲜肉，8:含冻品，10：含蔬菜，含冻品，12：含鲜肉，含冻品，14：含蔬菜，含鲜肉，含冻品  |
|  22   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 派车单名称  |
|  23   | delivery_plan_qty |   int   | 10 |   0    |    Y     |  N   |       | 计划提货量  |
|  24   | delivery_real_qty |   int   | 10 |   0    |    Y     |  N   |       | 实际提货量  |
|  25   | driver_service_provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 司机所属服务商id  |
|  26   | driver_service_provider_name |   varchar   | 128 |   0    |    Y     |  N   |       | 司机所属服务商名称  |
|  27   | vehicle_type_id |   bigint   | 20 |   0    |    Y     |  N   |       | 车型ID  |
|  28   | vehicle_type_name |   varchar   | 64 |   0    |    Y     |  N   |       | 车型名称  |
|  29   | transport_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 运输方式1：专车，2：顺风车  |
|  30   | take_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货单创建时间  |
|  31   | route_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 派车单创建时间  |
|  32   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 接单时间  |
|  33   | depart_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发车时间  |
|  34   | delivery_take_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货时间  |
|  35   | return_warehouse_time |   datetime   | 19 |   0    |    Y     |  N   |       | 返仓时间  |
|  36   | take_reason |   varchar   | 1024 |   0    |    Y     |  N   |       | 退货原因描述  |
|  37   | abnormal_reason |   varchar   | 1024 |   0    |    Y     |  N   |       | 提货失败原因  |
|  38   | abnormal_desc |   varchar   | 1024 |   0    |    Y     |  N   |       | 提货失败详细描述  |
|  39   | appointment_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  40   | driver_id |   bigint   | 20 |   0    |    Y     |  N   |       | 司机id  |
|  41   | driver_name |   varchar   | 20 |   0    |    Y     |  N   |       | 司机名称  |
|  42   | driver_take_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 领取方式0:未领取10:司机APP20:排线  |
|  43   | return_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 返仓履约时间  |
|  44   | time_interval |   int   | 10 |   0    |    Y     |  N   |       | 1:上午2:下午  |
|  45   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  46   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  47   | route_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 排线ID  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_delivery_take_inbound">mid_fact_caterb2b_rt_wh_delivery_take_inbound</a>

**说明：** 提货入库中间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  3   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  4   | inbound_appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货入库履约时间  |
|  5   | take_type |   smallint   | 6 |   0    |    Y     |  N   |   0    | 提货单类型1：退货；2：包装物；3：换货  |
|  6   | take_status |   smallint   | 6 |   0    |    Y     |  N   |   1    | 提货单状态:1已生成,2已排线,3已发车,4已提货,5提货失败,6已返仓,7已取消  |
|  7   | take_source |   smallint   | 6 |   0    |    Y     |  N   |   1    | 渠道来源1：客服；2：司机APP  |
|  8   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提货履约时间  |
|  9   | delivery_take_no |   varchar   | 32 |   0    |    Y     |  N   |       | 提货单号  |
|  10   | return_no |   varchar   | 64 |   0    |    Y     |  N   |       | 退货单号  |
|  11   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       | 订单号  |
|  12   | take_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 提货单/退货单创建时间  |
|  13   | inbound_istatus |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单逻辑删除1：有效0：删除  |
|  14   | inbound_cancel_status |   smallint   | 6 |   0    |    Y     |  N   |       | 是否取消1：取消0：未取消  |
|  15   | inbound_bill_no |   varchar   | 32 |   0    |    Y     |  N   |       | 入库单号  |
|  16   | inbound_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 入库单创建时间  |
|  17   | inbound_completed_time |   datetime   | 19 |   0    |    Y     |  N   |       | 入库完成时间  |
|  18   | inbound_bill_status |   smallint   | 6 |   0    |    Y     |  N   |       | 入库单状态：1未完成,2完成,3取消,4生成任务单,5收货中,6收货完成,7上架中,8上架完成  |
|  19   | purchase_qty |   int   | 10 |   0    |    Y     |  N   |       | 预计提货数  |
|  20   | receive_qty |   int   | 10 |   0    |    Y     |  N   |       | 实际提货数  |
|  21   | customer_service_qty |   int   | 10 |   0    |    Y     |  N   |       | 实际收货数  |
|  22   | receiving_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 收货任务创建时间  |
|  23   | receiving_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 收货单号  |
|  24   | receiving_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 收货完成时间  |
|  25   | putaway_create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 上架单创建时间  |
|  26   | putaway_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 上架单号  |
|  27   | putaway_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 上架完成时间  |
|  28   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  29   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="mid_fact_caterb2b_rt_wh_order_cat">mid_fact_caterb2b_rt_wh_order_cat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | order_no |   varchar   | 128 |   0    |    N     |  Y   |       | 订单号  |
|  2   | sku_code |   int   | 10 |   0    |    N     |  Y   |       | sku_code  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  5   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  6   | order_hour |   varchar   | 8 |   0    |    Y     |  N   |       | 下单时间小时  |
|  7   | address_id |   int   | 10 |   0    |    Y     |  N   |       | 门店地址  |
|  8   | cancel_status |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否取消1：取消0：未取消  |
|  9   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1未删除0删除  |
|  10   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级类目id  |
|  11   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  12   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级类目id  |
|  13   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  14   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  15   | sku_category3_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  16   | mode_storage_cat |   smallint   | 6 |   0    |    N     |  N   |   0    | 预售分类标品:1冻品:2生鲜:3肉禽4  |
|  17   | wh_process_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 是否库内加工0:否1:是  |
|  18   | delivery_qty |   int   | 10 |   0    |    Y     |  N   |       | 数量  |
|  19   | volume |   decimal   | 21 |   2    |    Y     |  N   |       | 体积立方厘米  |
|  20   | gross_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 毛重  |
|  21   | net_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 净重  |
|  22   | appointment_dt |   int   | 10 |   0    |    Y     |  N   |   0    | 履约日期  |
|  23   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  24   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="mid_fact_caterb2b_rt_wh_order_cat_flink">mid_fact_caterb2b_rt_wh_order_cat_flink</a>

**说明：** 配送单订单flinkmid表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | delivery_detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送单明细id  |
|  3   | delivery_bill_no |   varbinary   | 32 |   0    |    Y     |  N   |       | 配送单号  |
|  4   | order_no |   varchar   | 128 |   0    |    Y     |  N   |       | 订单号  |
|  5   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku_code  |
|  6   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  7   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  8   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  9   | order_hour |   varchar   | 8 |   0    |    Y     |  N   |       | 下单时间小时  |
|  10   | address_id |   int   | 10 |   0    |    Y     |  N   |       | 门店地址  |
|  11   | cancel_status |   bit   | 1 |   0    |    Y     |  N   |   0    | 是否取消1：取消0：未取消  |
|  12   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1未删除0删除  |
|  13   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级类目id  |
|  14   | sku_category1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级类目名称  |
|  15   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级类目id  |
|  16   | sku_category2_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  17   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       |   |
|  18   | sku_category3_name |   varchar   | 64 |   0    |    Y     |  N   |       |   |
|  19   | delivery_qty |   int   | 10 |   0    |    Y     |  N   |       | 数量  |
|  20   | volume |   decimal   | 21 |   2    |    Y     |  N   |       | 体积立方厘米  |
|  21   | gross_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 毛重  |
|  22   | net_weight |   decimal   | 11 |   3    |    Y     |  N   |       | 净重  |
|  23   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  24   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |

**表名：** <a id="mid_fact_caterb2b_rt_wh_stock_attendance_user">mid_fact_caterb2b_rt_wh_stock_attendance_user</a>

**说明：** 仓储主题-考勤人员数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | attendance_id |   bigint   | 20 |   0    |    Y     |  N   |       | 考勤id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  4   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  5   | labour_id |   bigint   | 20 |   0    |    N     |  N   |       | 人员id  |
|  6   | provider_id |   bigint   | 20 |   0    |    Y     |  N   |       | 服务商id  |
|  7   | job_position_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 岗位类型  |
|  8   | temporary_status |   tinyint   | 4 |   0    |    Y     |  N   |       | 是否临时工0:否1:是  |
|  9   | attence_date |   date   | 10 |   0    |    N     |  N   |       | 考勤日期  |
|  10   | first_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 首次打卡时间  |
|  11   | end_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 末次打卡时间  |
|  12   | status |   tinyint   | 4 |   0    |    Y     |  N   |       | 考勤状态:0--无,1--正常,2--休,3--假,4--迟到,5--早退,6--半天旷工,7--全天旷工,8--迟到+半天旷工,9--早退+半天旷工,10--迟到+早退  |
|  13   | istatus |   tinyint   | 4 |   0    |    Y     |  N   |   1    | 是否有效：1-有效，0-无效  |
|  14   | account_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 账号类型1:passport2:miss账号  |
|  15   | account_id |   bigint   | 20 |   0    |    Y     |  N   |       | 账号id  |
|  16   | name |   varchar   | 64 |   0    |    Y     |  N   |       | 姓名  |
|  17   | rac_user_id |   bigint   | 20 |   0    |    Y     |  N   |       | rac用户id  |
|  18   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  19   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |
|  20   | job_start_time |   time   | 8 |   0    |    Y     |  N   |       | 值班开始时间  |
|  21   | job_end_time |   time   | 8 |   0    |    Y     |  N   |       | 值班结束时间  |
|  22   | job_cross_day |   tinyint   | 4 |   0    |    Y     |  N   |       | 班次时间是否跨天，0-不跨天，1-跨天  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_stock_attendance_user_task">mid_fact_caterb2b_rt_wh_stock_attendance_user_task</a>

**说明：** 仓储主题-人员任务表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | attendance_id |   bigint   | 20 |   0    |    Y     |  N   |       | 考勤id  |
|  3   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道ID  |
|  4   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  5   | labour_id |   bigint   | 20 |   0    |    N     |  N   |       | userid  |
|  6   | handler_id |   bigint   | 20 |   0    |    N     |  N   |       | 人员id  |
|  7   | handler_name |   varchar   | 64 |   0    |    Y     |  N   |       | 人员姓名  |
|  8   | attence_date |   date   | 10 |   0    |    N     |  N   |       | 考勤日期  |
|  9   | first_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 首次打卡时间  |
|  10   | end_clockin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 末次打卡时间  |
|  11   | account_type |   tinyint   | 4 |   0    |    Y     |  N   |       | 账号类型1:passport2:miss账号  |
|  12   | account_id |   bigint   | 20 |   0    |    Y     |  N   |       | 账号id  |
|  13   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 履约时间  |
|  14   | accept_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  15   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  16   | last_task_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最新操作时间  |
|  17   | task_time_min |   int   | 10 |   0    |    Y     |  N   |       | 任务时长  |
|  18   | task_cnt |   int   | 10 |   0    |    Y     |  N   |       | 任务数量  |
|  19   | task_qty |   int   | 10 |   0    |    Y     |  N   |       | 作业件数  |
|  20   | task_status |   int   | 10 |   0    |    Y     |  N   |       | 任务状态  |
|  21   | task_type |   int   | 10 |   0    |    Y     |  N   |       | 任务类型:1拣货，2投线，3复核，4核货  |
|  22   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  23   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 修改时间  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_stock_check_task">mid_fact_caterb2b_rt_wh_stock_check_task</a>

**说明：** 仓储主题-复核-复核中间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | check_task_no |   varchar   | 50 |   0    |    Y     |  N   |       | 复核任务号  |
|  5   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线编码  |
|  6   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 排线名称  |
|  7   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区编码  |
|  8   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  9   | check_task_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 复核任务的状态10已生成，20复核中30复核完成99取消  |
|  10   | receiver_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 任务领取人账号ID  |
|  11   | receiver_name |   varchar   | 128 |   0    |    Y     |  N   |       | 任务领取人姓名  |
|  12   | receive_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务领取时间  |
|  13   | complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 任务完成时间  |
|  14   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效，0删除1有效0删除  |
|  15   | item_id |   bigint   | 20 |   0    |    N     |  N   |       | 明细主键  |
|  16   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格代码  |
|  17   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 最小规格编码sku  |
|  18   | expect_check_qty |   int   | 10 |   0    |    Y     |  N   |       | 应核货数量  |
|  19   | actual_check_qty |   int   | 10 |   0    |    Y     |  N   |       | 实核货数量  |
|  20   | cm_dt |   int   | 10 |   0    |    Y     |  N   |   0    | CM创建时间  |
|  21   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  22   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="mid_fact_caterb2b_rt_wh_stock_route_check">mid_fact_caterb2b_rt_wh_stock_route_check</a>

**说明：** 仓储主题-核货-核货中间表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  4   | route_no |   varchar   | 20 |   0    |    N     |  N   |       | 排线编码  |
|  5   | route_name |   varchar   | 20 |   0    |    Y     |  N   |       | 排线名称  |
|  6   | check_status |   smallint   | 6 |   0    |    Y     |  N   |       | 核货状态，10待核货，20核货中，30已完成  |
|  7   | shortage_status |   smallint   | 6 |   0    |    Y     |  N   |       | 0不缺货，1缺货  |
|  8   | sort_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 分拣完成时间  |
|  9   | check_begin_time |   datetime   | 19 |   0    |    Y     |  N   |       | 开始复核时间  |
|  10   | check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 复核完成时间  |
|  11   | check_operator_id |   varchar   | 20 |   0    |    Y     |  N   |       | 复核人id  |
|  12   | check_operator_name |   varchar   | 20 |   0    |    Y     |  N   |       | 复核人姓名  |
|  13   | driver_check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 核货完成时间  |
|  14   | ship_area_code |   varchar   | 32 |   0    |    Y     |  N   |   00000    | 发货区编码  |
|  15   | ship_area_name |   varchar   | 32 |   0    |    Y     |  N   |       | 发货区名称  |
|  16   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效，0删除1有效0删除  |
|  17   | item_id |   bigint   | 20 |   0    |    N     |  N   |       | 明细主键  |
|  18   | sku_code |   int   | 10 |   0    |    N     |  N   |       | 规格代码  |
|  19   | base_sku_code |   int   | 10 |   0    |    N     |  N   |       | 最小规格编码sku  |
|  20   | expect_check_qty |   int   | 10 |   0    |    Y     |  N   |       | 应核货数量  |
|  21   | actual_check_qty |   int   | 10 |   0    |    Y     |  N   |       | 实核货数量  |
|  22   | cm_dt |   int   | 10 |   0    |    Y     |  N   |   0    | CM创建时间  |
|  23   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  24   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |       | 最后修改时间  |

**表名：** <a id="mid_fact_rt_flink_order_detail_for_purchase">mid_fact_rt_flink_order_detail_for_purchase</a>

**说明：** 快驴订单详情事实宽表-采购看板实时专用

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | date_time |   datetime   | 19 |   0    |    N     |  N   |       | 生成时间，YYYY-MM-DD  |
|  2   | order_detail_id |   bigint   | 20 |   0    |    N     |  Y   |   0    |   |
|  3   | order_id |   bigint   | 20 |   0    |    N     |  N   |       | 订单ID  |
|  4   | order_no |   varchar   | 60 |   0    |    N     |  N   |       | 订单号  |
|  5   | city_id |   bigint   | 20 |   0    |    Y     |  N   |       | 城市ID  |
|  6   | csu_id |   bigint   | 20 |   0    |    N     |  N   |       | csuid  |
|  7   | sku_id |   bigint   | 20 |   0    |    Y     |  N   |       | csu对应的skuid  |
|  8   | spu_code |   varchar   | 60 |   0    |    Y     |  N   |       | spu_code  |
|  9   | bd_id |   bigint   | 20 |   0    |    Y     |  N   |       | bdid  |
|  10   | customer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 客户id  |
|  11   | poi_id |   bigint   | 20 |   0    |    Y     |  N   |       | 门店id  |
|  12   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库id  |
|  13   | bu_id |   bigint   | 20 |   0    |    Y     |  N   |       | 事业部id  |
|  14   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道id  |
|  15   | dealer_id |   bigint   | 20 |   0    |    Y     |  N   |       | 经销商ID  |
|  16   | poi_address_id |   bigint   | 20 |   0    |    Y     |  N   |       | 配送（地址）信息ID  |
|  17   | ord_status |   bigint   | 20 |   0    |    Y     |  N   |       | 订单状态,10:待支付,15:未接单,19:接单中,20:已接单,55:已发货,60:已送达,80:已完成,89:取消中,90:已取消  |
|  18   | ord_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  19   | ord_payment_type |   bigint   | 20 |   0    |    Y     |  N   |       | 订单类型，1:货到付款2:线上支付  |
|  20   | csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 售卖数量  |
|  21   | csu_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖促销优惠后单价:只是减去了单品促销,没有减去单品满减优惠券的价格  |
|  22   | csu_origin_price |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前单价  |
|  23   | csu_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠后价格:售卖单价*售卖数量-单品满减券的价格  |
|  24   | csu_origin_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 售卖优惠前价:售卖原价*售卖数量  |
|  25   | coupon_amt |   decimal   | 39 |   6    |    Y     |  N   |       | 单品优惠券金额:售卖单价*售卖数量-售卖价格  |
|  26   | gift_csu_cnt |   bigint   | 20 |   0    |    Y     |  N   |       | 赠品数量  |
|  27   | cat1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级品类类目  |
|  28   | cat1_name |   varchar   | 64 |   0    |    Y     |  N   |       | 一级品类类目名称  |
|  29   | cat2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级品类类目  |
|  30   | cat2_name |   varchar   | 64 |   0    |    Y     |  N   |       | 二级品类类目名称  |
|  31   | cat3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级品类类目  |
|  32   | cat3_name |   varchar   | 64 |   0    |    Y     |  N   |       | 三级品类类目名称  |
|  33   | activity_seckill_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  34   | activity_seckill_scene_id |   bigint   | 20 |   0    |    N     |  N   |   0    |   |
|  35   | is_first |   int   | 10 |   0    |    Y     |  N   |   0    | 0:老客,1:新客  |
|  36   | item_utime |   datetime   | 19 |   0    |    Y     |  N   |       | order_item更新时间  |
|  37   | csu_name |   varchar   | 255 |   0    |    Y     |  N   |       | 商品名称  |
|  38   | ord_utime |   datetime   | 19 |   0    |    Y     |  N   |       | biz_order更新时间  |
|  39   | poi_cat |   int   | 10 |   0    |    Y     |  N   |       |   |
|  40   | is_new_first |   int   | 10 |   0    |    Y     |  N   |       |   |
|  41   | is_ka |   int   | 10 |   0    |    Y     |  N   |       |   |
|  42   | customer_name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  43   | divide_amount |   decimal   | 39 |   6    |    N     |  N   |   0.000000    | 赠品分担金额  |
|  44   | coupon_revenue_amt |   decimal   | 39 |   6    |    Y     |  N   |   0.000000    | 有价券分摊金额  |

**表名：** <a id="mid_fact_rt_reservation_bill">mid_fact_rt_reservation_bill</a>

**说明：** 预约明细表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | detail_id |   bigint   | 20 |   0    |    N     |  N   |       | 明细ID  |
|  3   | appoint_time |   datetime   | 19 |   0    |    Y     |  N   |       | 采购入库履约时间  |
|  4   | wh_id |   int   | 10 |   0    |    Y     |  N   |       | 仓库id  |
|  5   | channel_id |   int   | 10 |   0    |    Y     |  N   |       | 渠道id  |
|  6   | reserve_start_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-起始  |
|  7   | reserve_end_time |   datetime   | 19 |   0    |    Y     |  N   |       | 预计送货时间-截止  |
|  8   | reservation_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 预约单号  |
|  9   | purchase_bill_no |   varchar   | 64 |   0    |    Y     |  N   |   1    | 采购单号  |
|  10   | supplier_code |   varchar   | 64 |   0    |    Y     |  N   |       | 供应商ID  |
|  11   | unload_time |   datetime   | 19 |   0    |    Y     |  N   |       | 卸货完成时间  |
|  12   | reservation_bill_type |   int   | 10 |   0    |    N     |  N   |   1    | 预约单类型：0-非预售品，1-预售品  |
|  13   | reservation_status |   smallint   | 6 |   0    |    N     |  N   |   1    | 预约状态：1-已预约，2-已签到，3-完成，4-取消  |
|  14   | cancel_reason |   smallint   | 6 |   0    |    Y     |  N   |       | 取消原因：枚举类  |
|  15   | pur_istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除：1-正常，0-删除  |
|  16   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | 规格代码  |
|  17   | reserve_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 预约数量  |
|  18   | reserve_whole_package_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 预约箱数:根据每个sku/箱规，向下取整进行累加  |
|  19   | received_qty |   decimal   | 11 |   2    |    Y     |  N   |       | 入库收货数量  |
|  20   | job_storage_type |   smallint   | 6 |   0    |    Y     |  N   |       | 作业温层（计费）常温：1、冷藏：2、冷冻：3  |
|  21   | warehouse_process_status |   smallint   | 6 |   0    |    N     |  N   |   0    | 是否库内加工0:否1:是  |
|  22   | product_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 商品类型0:成品1:原料  |
|  23   | sale_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 销售模式现货销售：0，无库存销售(预售)：1  |
|  24   | outer_packing_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 外包装转化率（箱规）  |
|  25   | sku_type |   int   | 10 |   0    |    Y     |  N   |       | 商品类型,100:正常商品，200：包装物，300：原材料  |
|  26   | add_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  27   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |
|  28   | bill_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 预约单创建时间  |

**表名：** <a id="mid_outbound_detail_flink">mid_outbound_detail_flink</a>

**说明：** mid_outbound_detail

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | id  |
|  2   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | channel_id  |
|  3   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | wh_id  |
|  4   | dtl_cdate |   datetime   | 19 |   0    |    Y     |  N   |       | dtl_cdate  |
|  5   | dtl_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | dtl_ctime  |
|  6   | dtl_utime |   datetime   | 19 |   0    |    Y     |  N   |       | dtl_utime  |
|  7   | detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | detail_id  |
|  8   | wh_name |   varchar   | 50 |   0    |    Y     |  N   |       | 仓库名称  |
|  9   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  10   | sku_name |   varchar   | 50 |   0    |    Y     |  N   |       | sku名称  |
|  11   | order_qty |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  12   | volume |   decimal   | 21 |   6    |    Y     |  N   |       | 体积：cm^3  |
|  13   | gross_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 毛重kg  |
|  14   | net_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 毛重kg  |
|  15   | mode_storage_cat |   smallint   | 6 |   0    |    Y     |  N   |   0    | 预售分类标品:1冻品:2生鲜:3肉禽4  |
|  16   | wh_process_status |   int   | 10 |   0    |    Y     |  N   |       | 是否库内加工0:否1:是  |
|  17   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级分类ID  |
|  18   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级分类ID  |
|  19   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级分类ID  |
|  20   | sku_category1_name |   varchar   | 256 |   0    |    Y     |  N   |       | 一级分类名称  |
|  21   | sku_category2_name |   varchar   | 256 |   0    |    Y     |  N   |       | 二级分类名称  |
|  22   | sku_category3_name |   varchar   | 256 |   0    |    Y     |  N   |       | 三级分类名称  |
|  23   | outbound_qty |   int   | 10 |   0    |    Y     |  N   |       | 出库数量  |
|  24   | shortage_reason |   varchar   | 50 |   0    |    Y     |  N   |       | 缺货原因  |
|  25   | outbound_bill_no |   varchar   | 50 |   0    |    Y     |  N   |       | 出库单号  |
|  26   | order_no |   varchar   | 50 |   0    |    Y     |  N   |       | 订单号  |
|  27   | delivery_route_id |   varchar   | 50 |   0    |    Y     |  N   |       | 排线ID  |
|  28   | delivery_route_no |   varchar   | 50 |   0    |    Y     |  N   |       | 排线编号  |
|  29   | delivery_route_name |   varchar   | 50 |   0    |    Y     |  N   |       | 排线名称  |
|  30   | scheduled_delivery_date |   varchar   | 50 |   0    |    Y     |  N   |       | 履约时间  |
|  31   | order_time |   varchar   | 50 |   0    |    Y     |  N   |       | 下单时间  |
|  32   | outbound_bill_status |   int   | 10 |   0    |    Y     |  N   |       | 1已生成,2出库完成,5已生成拣货任务,6拣货中,7拣货完成,8已集货,2出库完成  |
|  33   | outbound_bill_type |   int   | 10 |   0    |    N     |  N   |   1    | 1订单出库2调整出库3升级出库4降级出库5退货出库6消残出库7.调拨8.盘亏9样品10检验品  |
|  34   | complete_time |   varchar   | 50 |   0    |    Y     |  N   |       | 出库完成时间  |
|  35   | delivery_times |   varchar   | 50 |   0    |    Y     |  N   |       | 配送时段  |
|  36   | order_shortage |   int   | 10 |   0    |    Y     |  N   |       | 0缺货1不缺货  |
|  37   | cancel_status |   int   | 10 |   0    |    Y     |  N   |       | 是否取消1：取消0：未取消  |
|  38   | istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除:0删除，1未删除  |
|  39   | start_min |   bigint   | 20 |   0    |    Y     |  N   |       | 开始时间  |
|  40   | end_min |   bigint   | 20 |   0    |    Y     |  N   |       | 结束数据  |
|  41   | ago_minutes |   bigint   | 20 |   0    |    Y     |  N   |       | 标准出库时间  |
|  42   | sort_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 分拣完成时间  |
|  43   | check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 复核完成时间  |
|  44   | out_utime |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="mid_outbound_detail_flink_v2">mid_outbound_detail_flink_v2</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | detail_id |   bigint   | 20 |   0    |    Y     |  N   |       | 明细ID  |
|  3   | dtl_cdate |   date   | 10 |   0    |    Y     |  N   |       | 明细创建日期  |
|  4   | wh_id |   bigint   | 20 |   0    |    Y     |  N   |       | 仓库ID  |
|  5   | outbound_bill_no |   varchar   | 256 |   0    |    Y     |  N   |       | 出库单号  |
|  6   | channel_id |   bigint   | 20 |   0    |    Y     |  N   |       | 渠道ID  |
|  7   | dtl_ctime |   datetime   | 19 |   0    |    Y     |  N   |       | 明细创建时间  |
|  8   | dtl_utime |   datetime   | 19 |   0    |    Y     |  N   |       | 明细更新时间  |
|  9   | wh_name |   varchar   | 256 |   0    |    Y     |  N   |       | 仓库名称  |
|  10   | sku_code |   int   | 10 |   0    |    Y     |  N   |       | sku编码  |
|  11   | sku_name |   varchar   | 256 |   0    |    Y     |  N   |       | sku名称  |
|  12   | order_qty |   int   | 10 |   0    |    Y     |  N   |       | 订单数量  |
|  13   | volume |   decimal   | 21 |   6    |    Y     |  N   |       | 体积：cm^3  |
|  14   | gross_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 毛重kg  |
|  15   | net_weight |   decimal   | 11 |   2    |    Y     |  N   |       | 毛重kg  |
|  16   | mode_storage_cat |   int   | 10 |   0    |    Y     |  N   |       | 预售分类标品:1冻品:2生鲜:3肉禽4  |
|  17   | wh_process_status |   int   | 10 |   0    |    Y     |  N   |       | 是否库内加工0:否1:是  |
|  18   | sku_category1_id |   bigint   | 20 |   0    |    Y     |  N   |       | 一级分类ID  |
|  19   | sku_category2_id |   bigint   | 20 |   0    |    Y     |  N   |       | 二级分类ID  |
|  20   | sku_category3_id |   bigint   | 20 |   0    |    Y     |  N   |       | 三级分类ID  |
|  21   | sku_category1_name |   varchar   | 256 |   0    |    Y     |  N   |       | 一级分类名称  |
|  22   | sku_category2_name |   varchar   | 256 |   0    |    Y     |  N   |       | 二级分类名称  |
|  23   | sku_category3_name |   varchar   | 256 |   0    |    Y     |  N   |       | 三级分类名称  |
|  24   | outbound_qty |   int   | 10 |   0    |    Y     |  N   |       | 出库数量  |
|  25   | shortage_reason |   varchar   | 256 |   0    |    Y     |  N   |       | 缺货原因  |
|  26   | order_no |   varchar   | 256 |   0    |    Y     |  N   |       | 订单号  |
|  27   | delivery_route_id |   varchar   | 256 |   0    |    Y     |  N   |       | 排线ID  |
|  28   | delivery_route_no |   varchar   | 256 |   0    |    Y     |  N   |       | 排线编号  |
|  29   | delivery_route_name |   varchar   | 256 |   0    |    Y     |  N   |       | 排线名称  |
|  30   | scheduled_delivery_date |   varchar   | 256 |   0    |    Y     |  N   |       | 履约时间  |
|  31   | order_time |   datetime   | 19 |   0    |    Y     |  N   |       | 下单时间  |
|  32   | outbound_bill_status |   int   | 10 |   0    |    Y     |  N   |       | 1已生成,2出库完成,5已生成拣货任务,6拣货中,7拣货完成,8已集货,2出库完成  |
|  33   | outbound_bill_type |   int   | 10 |   0    |    Y     |  N   |       | 1订单出库2调整出库3升级出库4降级出库5退货出库6消残出库7.调拨8.盘亏9样品10检验品  |
|  34   | complete_time |   varchar   | 256 |   0    |    Y     |  N   |       | 出库完成时间  |
|  35   | delivery_times |   varchar   | 256 |   0    |    Y     |  N   |       | 配送时段  |
|  36   | order_shortage |   int   | 10 |   0    |    Y     |  N   |       | 0缺货1不缺货  |
|  37   | cancel_status |   int   | 10 |   0    |    Y     |  N   |       | 是否取消1：取消0：未取消  |
|  38   | istatus |   int   | 10 |   0    |    Y     |  N   |       | 逻辑删除:0删除，1未删除  |
|  39   | start_min |   bigint   | 20 |   0    |    Y     |  N   |       | 开始时间  |
|  40   | end_min |   bigint   | 20 |   0    |    Y     |  N   |       | 结束时间  |
|  41   | ago_minutes |   bigint   | 20 |   0    |    Y     |  N   |       | 标准出库时间  |
|  42   | sort_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 分拣完成时间  |
|  43   | check_complete_time |   datetime   | 19 |   0    |    Y     |  N   |       | 复核完成时间  |
|  44   | out_utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="min_fact_caterb2b_cross_bill">min_fact_caterb2b_cross_bill</a>

**说明：** 缺货统计任务汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | channel_id |   int   | 10 |   0    |    N     |  Y   |       | 渠道id  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  3   | route_no |   varchar   | 20 |   0    |    N     |  Y   |       |   |
|  4   | appoint_time |   datetime   | 19 |   0    |    N     |  Y   |   1970-01-0100:00:00    | 履约时间  |
|  5   | cross_sorting_no |   varchar   | 50 |   0    |    N     |  Y   |       | 拣货单编号  |
|  6   | cat |   int   | 10 |   0    |    N     |  Y   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  7   | route_istatus |   varchar   | 4 |   0    |    N     |  N   |   1    | 排线逻辑删除正常1,删除0  |
|  8   | cross_sorting_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 投线状态10已生成20投线中30投线暂停40投线完成  |
|  9   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  10   | actual_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  11   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="min_fact_caterb2b_pick_bill">min_fact_caterb2b_pick_bill</a>

**说明：** 拣货任务详情表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | channel_id |   int   | 10 |   0    |    N     |  Y   |       | 渠道id  |
|  2   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  3   | route_no |   varchar   | 20 |   0    |    N     |  Y   |       | 排线号  |
|  4   | pick_bill_no |   varchar   | 50 |   0    |    N     |  Y   |       | 拣货单编号  |
|  5   | appoint_time |   datetime   | 19 |   0    |    N     |  Y   |   1970-01-0100:00:00    | 履约时间  |
|  6   | cat |   int   | 10 |   0    |    N     |  Y   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  7   | route_istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 排线逻辑删除正常1,删除0  |
|  8   | pick_status |   smallint   | 6 |   0    |    N     |  N   |   10    | 拣货任务的状态10已生成，20拣货中30拣货完成cancel已取消  |
|  9   | order_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 应拣件数  |
|  10   | actual_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 实拣件数  |
|  11   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  12   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="min_fact_caterb2b_shortage_sku_bill">min_fact_caterb2b_shortage_sku_bill</a>

**说明：** 投线任务汇总表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | shortage_id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | channel_id |   int   | 10 |   0    |    N     |  Y   |       | 渠道id  |
|  3   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  4   | appoint_time |   datetime   | 19 |   0    |    N     |  Y   |   1970-01-0100:00:00    | 履约时间  |
|  5   | cat |   smallint   | 6 |   0    |    N     |  Y   |   0    | 分类：1-生鲜，2-冻品，3-标品  |
|  6   | route_no |   varchar   | 20 |   0    |    N     |  Y   |       | 排线号  |
|  7   | sku_code |   int   | 10 |   0    |    N     |  Y   |       | sku编码  |
|  8   | route_istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 排线逻辑删除正常1,删除0  |
|  9   | record_status |   smallint   | 6 |   0    |    Y     |  N   |   10    | 记录状态10暂存20已确认  |
|  10   | shortage_istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 是否有效0删除1有效  |
|  11   | shortage_qty |   int   | 10 |   0    |    Y     |  N   |       | 缺货件数  |
|  12   | shortage_reason |   varchar   | 100 |   0    |    Y     |  N   |       | 缺货原因  |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 修改时间  |

**表名：** <a id="mq_purchase_check">mq_purchase_check</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | purchase_bill_type |   int   | 10 |   0    |    Y     |  N   |       | 10标品,20预售,30原料  |
|  3   | check_result |   int   | 10 |   0    |    Y     |  N   |       | 10合格,20不合格（让步收）,30仓库原因无法收货,40供应商迟到,50检查中,60未到货,70不合格（拒收）  |
|  4   | portal_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  5   | sku_code |   int   | 10 |   0    |    Y     |  N   |       |   |
|  6   | channel_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  7   | inbound_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 入库单号  |
|  8   | warehouse_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  9   | dealer_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  10   | opaertor_name |   varchar   | 64 |   0    |    Y     |  N   |       | 操作人  |
|  11   | operator |   varchar   | 64 |   0    |    Y     |  N   |       | 操作人信息  |
|  12   | operate_time |   datetime   | 19 |   0    |    Y     |  N   |       | 操作时间  |
|  13   | ctime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  14   | utime |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    |   |
|  15   | receiving_bill_no |   varchar   | 64 |   0    |    Y     |  N   |       | 收货任务单号  |
|  16   | check_deduction_rate |   double   | 23 |   0    |    Y     |  N   |       | 品控检查扣称比例  |

**表名：** <a id="ods_dbus_task_opt_extra">ods_dbus_task_opt_extra</a>

**说明：** 任务过程拓展表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | channel_id |   int   | 10 |   0    |    N     |  N   |       | 渠道ID  |
|  4   | task_no |   varchar   | 50 |   0    |    N     |  N   |       | 任务编号  |
|  5   | task_type |   smallint   | 6 |   0    |    N     |  N   |       | 任务类型10投线20复核  |
|  6   | handler_id |   bigint   | 20 |   0    |    N     |  N   |       | 任务操作人账号id  |
|  7   | handler_name |   varchar   | 128 |   0    |    N     |  N   |       | 任务操作人姓名  |
|  8   | handler_time |   datetime   | 19 |   0    |    N     |  N   |       | 操作时间  |
|  9   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1有效0删除  |
|  10   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  11   | create_time |   datetime   | 19 |   0    |    N     |  N   |       | 创建时间  |
|  12   | operation_name |   varchar   | 50 |   0    |    N     |  N   |       | 操作名称  |
|  13   | operation_type |   smallint   | 6 |   0    |    N     |  N   |       | 操作结果类型20继续30暂停  |

**表名：** <a id="ods_dts_kuailv_kl_pms__purchase_bill">ods_dts_kuailv_kl_pms__purchase_bill</a>

**说明：** 新采购单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_code |   varchar   | 60 |   0    |    N     |  N   |       | 采购单号  |
|  3   | vendor_code |   varchar   | 64 |   0    |    N     |  N   |       | 供应商编码  |
|  4   | vendor_name |   varchar   | 255 |   0    |    Y     |  N   |       | 供应商名  |
|  5   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 事业部id  |
|  6   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 事业部名  |
|  7   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库id  |
|  8   | warehouse_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名  |
|  9   | creator_id |   int   | 10 |   0    |    N     |  N   |   0    | 创建人id  |
|  10   | creator_name |   varchar   | 64 |   0    |    N     |  N   |       | 创建人名称  |
|  11   | creator_account |   varchar   | 64 |   0    |    N     |  N   |       | 创建人账号  |
|  12   | settle_type |   smallint   | 6 |   0    |    Y     |  N   |   1    | 结算类型0：先款后货，1：先货后款  |
|  13   | pur_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 采购单状态，0:待提交，1：审批中，2：审批驳回，3：审批通过，4：供应商确认，10：部分入库，20：完结中，21：完结，22：取消中，23：已取消  |
|  14   | settlement_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 结算状态：0待结算1部分结算2结算完成  |
|  15   | bill_sku_type |   tinyint   | 4 |   0    |    N     |  N   |   0    | 单据品类类型；0正常品，1原材料  |
|  16   | bill_origin |   tinyint   | 4 |   0    |    N     |  N   |   0    | 订单来源；0普通订单，1统一品订单,2供应商加工订单  |
|  17   | estimate_arr_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 预计到达时间，精确到分  |
|  18   | inbound_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 入库时间  |
|  19   | approve_complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 审批完成时间  |
|  20   | bill_complete_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 采购单完成时间  |
|  21   | remark |   varchar   | 256 |   0    |    Y     |  N   |       | 备注信息  |
|  22   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  23   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  24   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建者  |
|  25   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  26   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 修改人  |
|  27   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1:正常0:删除  |
|  28   | place_order_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 下单模式0手动1自动  |
|  29   | purchase_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 采购模式:0非以销定采,1以销定采  |
|  30   | bill_create_entrance |   tinyint   | 4 |   0    |    N     |  N   |   1    | 采购单创建入口,0供应商和老采购计划下采购单，1新采购计划下采购单  |
|  31   | operate_mode |   smallint   | 6 |   0    |    N     |  N   |   0    | 操作模式：0:系统正常流转，1:异常关单  |

**表名：** <a id="ods_dts_kuailv_kl_pms__purchase_bill_detail">ods_dts_kuailv_kl_pms__purchase_bill_detail</a>

**说明：** 新采购单详情

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_code |   varchar   | 60 |   0    |    N     |  N   |       | 采购单号  |
|  3   | sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | sku编码  |
|  4   | spu_code |   varchar   | 20 |   0    |    N     |  N   |       | spu编码  |
|  5   | spu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 商品名称  |
|  6   | brand |   varchar   | 255 |   0    |    Y     |  N   |       | 品牌  |
|  7   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | sku单位  |
|  8   | sku_unit_desc |   varchar   | 255 |   0    |    Y     |  N   |       | 规格描述  |
|  9   | tax_rate |   decimal   | 3 |   2    |    N     |  N   |   0.00    | 税率  |
|  10   | cat1_id |   int   | 10 |   0    |    N     |  N   |       | 商品分类1  |
|  11   | cat1_name |   varchar   | 20 |   0    |    N     |  N   |       | 商品一级分类名称  |
|  12   | cat2_id |   int   | 10 |   0    |    N     |  N   |       | 商品分类2  |
|  13   | cat2_name |   varchar   | 20 |   0    |    N     |  N   |       | 商品二级分类名称  |
|  14   | cat3_id |   int   | 10 |   0    |    N     |  N   |       | 商品分类3  |
|  15   | cat3_name |   varchar   | 20 |   0    |    N     |  N   |       | 商品三级分类名称  |
|  16   | min_supply_quantity |   decimal   | 15 |   2    |    Y     |  N   |   0.00    | 起批量  |
|  17   | pur_quantity |   decimal   | 11 |   2    |    Y     |  N   |   0.00    | 采购量  |
|  18   | suggest_pur_quantity |   varchar   | 45 |   0    |    Y     |  N   |       | 采购建议量  |
|  19   | instock_quantity |   decimal   | 11 |   2    |    N     |  N   |   0.00    | 入库量  |
|  20   | pur_price |   decimal   | 11 |   4    |    Y     |  N   |   0.0000    | 采购价  |
|  21   | parent_sku_code |   int   | 10 |   0    |    N     |  N   |   0    | >0当前包装品对应主商品sku，=0主商品不含包装物  |
|  22   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  23   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  24   | create_by |   varchar   | 64 |   0    |    N     |  N   |       | 创建者  |
|  25   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  26   | last_modify_by |   varchar   | 64 |   0    |    N     |  N   |       | 修改人  |
|  27   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 逻辑删除1:正常0:删除  |
|  28   | vendor_confirm_qty |   decimal   | 11 |   2    |    Y     |  N   |   0.00    | 供应商确认数量  |
|  29   | paste_barcode_qty |   decimal   | 11 |   4    |    N     |  N   |   0.0000    | 仓库贴码量  |
|  30   | packing_factor |   int   | 10 |   0    |    N     |  N   |   0    | 箱规  |
|  31   | packing_unit |   varchar   | 24 |   0    |    N     |  N   |       | 箱规单位  |
|  32   | receive_effective_weight |   decimal   | 13 |   2    |    N     |  N   |   0.00    | 原料扣称后的重量  |
|  33   | gift_type |   smallint   | 6 |   0    |    N     |  N   |   0    | 赠品类型:0:无类型,1:纯赠品,2:搭赠,3:货补,4:纯赠品-非指定,5:纯赠品-指定  |

**表名：** <a id="ods_dts_rt_wh_delivery_bill">ods_dts_rt_wh_delivery_bill</a>

**说明：** 送货单表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_code |   varchar   | 60 |   0    |    Y     |  N   |       | 送货单号  |
|  3   | bu_id |   int   | 10 |   0    |    Y     |  N   |   0    | 卖家id  |
|  4   | bu_name |   varchar   | 128 |   0    |    Y     |  N   |       | 卖家名称  |
|  5   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库id  |
|  6   | warehouse_name |   varchar   | 255 |   0    |    Y     |  N   |       | 仓库名  |
|  7   | bill_status |   smallint   | 6 |   0    |    Y     |  N   |   0    | 送货单状态，0:待入库，10：审批通过，20：部分入库，30：入库完成，39：取消中，40：已取消  |
|  8   | inbound_completed_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 入库时间  |
|  9   | create_mode |   smallint   | 6 |   0    |    Y     |  N   |   0    | 下单模式0手动1自动  |
|  10   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  11   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  12   | create_by |   varchar   | 64 |   0    |    Y     |  N   |       | 创建者  |
|  13   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  14   | last_modify_by |   varchar   | 64 |   0    |    Y     |  N   |       | 修改人  |
|  15   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1:正常0:删除  |

**表名：** <a id="ods_dts_rt_wh_delivery_bill_detail">ods_dts_rt_wh_delivery_bill_detail</a>

**说明：** 送货单详情

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       |   |
|  2   | bill_code |   varchar   | 60 |   0    |    Y     |  N   |       | 送货单号  |
|  3   | sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | sku编码  |
|  4   | spu_code |   varchar   | 20 |   0    |    Y     |  N   |       | spu编码  |
|  5   | sku_name |   varchar   | 128 |   0    |    Y     |  N   |       | 商品名称  |
|  6   | brand_id |   int   | 10 |   0    |    Y     |  N   |       | 品牌id  |
|  7   | brand_name |   varchar   | 255 |   0    |    Y     |  N   |       | 品牌名称  |
|  8   | sku_unit |   varchar   | 32 |   0    |    Y     |  N   |       | sku单位  |
|  9   | sku_unit_desc |   varchar   | 255 |   0    |    Y     |  N   |       | 规格描述  |
|  10   | cat1_id |   int   | 10 |   0    |    Y     |  N   |       | 商品分类1  |
|  11   | cat1_name |   varchar   | 20 |   0    |    Y     |  N   |       | 商品一级分类名称  |
|  12   | cat2_id |   int   | 10 |   0    |    Y     |  N   |       | 商品分类2  |
|  13   | cat2_name |   varchar   | 20 |   0    |    Y     |  N   |       | 商品二级分类名称  |
|  14   | cat3_id |   int   | 10 |   0    |    Y     |  N   |       | 商品分类3  |
|  15   | cat3_name |   varchar   | 20 |   0    |    Y     |  N   |       | 商品三级分类名称  |
|  16   | packing_factor |   int   | 10 |   0    |    Y     |  N   |   0    | 箱规  |
|  17   | packing_unit |   varchar   | 24 |   0    |    Y     |  N   |       | 箱规单位  |
|  18   | delivery_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 送货量  |
|  19   | inbound_qty |   int   | 10 |   0    |    Y     |  N   |   0    | 入库量  |
|  20   | relation_sku_code |   int   | 10 |   0    |    Y     |  N   |   0    | >0当前包装品对应主商品sku，=0主商品不含包装物  |
|  21   | channel_id |   int   | 10 |   0    |    Y     |  N   |   0    | 渠道id  |
|  22   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  23   | create_by |   varchar   | 64 |   0    |    Y     |  N   |       | 创建者  |
|  24   | last_modify_time |   datetime   | 19 |   0    |    Y     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  25   | last_modify_by |   varchar   | 64 |   0    |    Y     |  N   |       | 修改人  |
|  26   | istatus |   smallint   | 6 |   0    |    Y     |  N   |   1    | 逻辑删除1:正常0:删除  |

**表名：** <a id="pay_evaluate">pay_evaluate</a>

**说明：** 美团评价相关

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键  |
|  2   | hotel_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 屏芯商户号  |
|  3   | merchant_id |   varchar   | 32 |   0    |    Y     |  N   |       | 美团商户号  |
|  4   | real_merchant_id |   varchar   | 32 |   0    |    Y     |  N   |       | 美团真实商户号  |
|  5   | evaluate_auth |   int   | 10 |   0    |    Y     |  N   |   0    | 是否拥有评价权限（0无,1有）  |
|  6   | remark |   varchar   | 64 |   0    |    Y     |  N   |       | 备注  |
|  7   | create_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 创建时间  |
|  8   | update_time |   datetime   | 19 |   0    |    Y     |  N   |   CURRENT_TIMESTAMP    | 更新时间  |
|  9   | app_id |   varchar   | 32 |   0    |    Y     |  N   |       | 商户所属渠道  |

**表名：** <a id="poc_rt_data">poc_rt_data</a>

**说明：** POC实时结果表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | ID  |
|  2   | date_time |   varchar   | 10 |   0    |    N     |  N   |       | 日期(YYYYMMDD)  |
|  3   | sku_id |   int   | 10 |   0    |    N     |  N   |       | 商品SKUCode  |
|  4   | warehouse_id |   bigint   | 20 |   0    |    Y     |  N   |   0    | 仓库ID  |
|  5   | count |   bigint   | 20 |   0    |    Y     |  N   |   0    | 销量  |
|  6   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |
|  7   | modified_time |   datetime   | 19 |   0    |    Y     |  N   |       |   |

**表名：** <a id="promotion_info">promotion_info</a>

**说明：** 促销信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   bigint   | 20 |   0    |    N     |  Y   |       | 主键Id  |
|  2   | warehouse_id |   bigint   | 20 |   0    |    N     |  N   |       | 仓库id  |
|  3   | promotion_date |   date   | 10 |   0    |    N     |  N   |       | 促销日期  |
|  4   | promotion_category |   smallint   | 6 |   0    |    N     |  N   |   1    | 促销品类(1:全品类,2:生鲜品,3:标品)  |
|  5   | promotion_category_desc |   varchar   | 1000 |   0    |    N     |  N   |       | 促销品类描述  |
|  6   | expect_sales_amount |   int   | 10 |   0    |    N     |  N   |       | 预计销售额  |
|  7   | expect_daily_poi_num |   int   | 10 |   0    |    N     |  N   |       | 预计日活  |
|  8   | promotion_mode |   varchar   | 100 |   0    |    N     |  N   |   2    | 促销方式(2:阶梯满减,3:每满减,4:阶梯满赠,5:每满赠,6:套装,7:满返,8:连续下单,9:累计下单,10:充返)  |
|  9   | promotion_mode_desc |   varchar   | 1000 |   0    |    N     |  N   |       | 促销方式描述  |
|  10   | remark |   varchar   | 1000 |   0    |    N     |  N   |       | 备注  |
|  11   | channel_id |   int   | 10 |   0    |    N     |  N   |   0    | 渠道Id  |
|  12   | istatus |   smallint   | 6 |   0    |    N     |  N   |   1    | 是否逻辑删除  |
|  13   | create_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 创建时间  |
|  14   | create_by |   varchar   | 128 |   0    |    N     |  N   |       | 创建者  |
|  15   | last_modify_time |   datetime   | 19 |   0    |    N     |  N   |   1970-01-0100:00:00    | 修改时间  |
|  16   | last_modify_by |   varchar   | 128 |   0    |    N     |  N   |       | 修改者  |

**表名：** <a id="tab1">tab1</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 20 |   0    |    Y     |  N   |       |   |

**表名：** <a id="upload_table_standard_location">upload_table_standard_location</a>

**说明：** 上传表-库位使用报表-已标准化

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | wh_id |   bigint   | 20 |   0    |    N     |  Y   |       | 仓库id  |
|  2   | wh_name |   varchar   | 64 |   0    |    Y     |  N   |       | 仓库名称  |
