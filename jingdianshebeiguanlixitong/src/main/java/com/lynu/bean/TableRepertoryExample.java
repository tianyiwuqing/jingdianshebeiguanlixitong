package com.lynu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TableRepertoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableRepertoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeIsNull() {
            addCriterion("equipmentuniquecode is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeIsNotNull() {
            addCriterion("equipmentuniquecode is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeEqualTo(String value) {
            addCriterion("equipmentuniquecode =", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeNotEqualTo(String value) {
            addCriterion("equipmentuniquecode <>", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeGreaterThan(String value) {
            addCriterion("equipmentuniquecode >", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeGreaterThanOrEqualTo(String value) {
            addCriterion("equipmentuniquecode >=", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeLessThan(String value) {
            addCriterion("equipmentuniquecode <", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeLessThanOrEqualTo(String value) {
            addCriterion("equipmentuniquecode <=", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeLike(String value) {
            addCriterion("equipmentuniquecode like", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeNotLike(String value) {
            addCriterion("equipmentuniquecode not like", value, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeIn(List<String> values) {
            addCriterion("equipmentuniquecode in", values, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeNotIn(List<String> values) {
            addCriterion("equipmentuniquecode not in", values, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeBetween(String value1, String value2) {
            addCriterion("equipmentuniquecode between", value1, value2, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentuniquecodeNotBetween(String value1, String value2) {
            addCriterion("equipmentuniquecode not between", value1, value2, "equipmentuniquecode");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdIsNull() {
            addCriterion("address_stong_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdIsNotNull() {
            addCriterion("address_stong_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdEqualTo(Integer value) {
            addCriterion("address_stong_id =", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdNotEqualTo(Integer value) {
            addCriterion("address_stong_id <>", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdGreaterThan(Integer value) {
            addCriterion("address_stong_id >", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_stong_id >=", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdLessThan(Integer value) {
            addCriterion("address_stong_id <", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_stong_id <=", value, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdIn(List<Integer> values) {
            addCriterion("address_stong_id in", values, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdNotIn(List<Integer> values) {
            addCriterion("address_stong_id not in", values, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdBetween(Integer value1, Integer value2) {
            addCriterion("address_stong_id between", value1, value2, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andAddressStongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_stong_id not between", value1, value2, "addressStongId");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeIsNull() {
            addCriterion("create_intime is null");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeIsNotNull() {
            addCriterion("create_intime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_intime =", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_intime <>", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_intime >", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_intime >=", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeLessThan(Date value) {
            addCriterionForJDBCDate("create_intime <", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_intime <=", value, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_intime in", values, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_intime not in", values, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_intime between", value1, value2, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateIntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_intime not between", value1, value2, "createIntime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeIsNull() {
            addCriterion("create_outtime is null");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeIsNotNull() {
            addCriterion("create_outtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_outtime =", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_outtime <>", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_outtime >", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_outtime >=", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeLessThan(Date value) {
            addCriterionForJDBCDate("create_outtime <", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_outtime <=", value, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_outtime in", values, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_outtime not in", values, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_outtime between", value1, value2, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andCreateOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_outtime not between", value1, value2, "createOuttime");
            return (Criteria) this;
        }

        public Criteria andShopTimeIsNull() {
            addCriterion("shop_time is null");
            return (Criteria) this;
        }

        public Criteria andShopTimeIsNotNull() {
            addCriterion("shop_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopTimeEqualTo(Date value) {
            addCriterionForJDBCDate("shop_time =", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shop_time <>", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shop_time >", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_time >=", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeLessThan(Date value) {
            addCriterionForJDBCDate("shop_time <", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shop_time <=", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeIn(List<Date> values) {
            addCriterionForJDBCDate("shop_time in", values, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shop_time not in", values, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_time between", value1, value2, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shop_time not between", value1, value2, "shopTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdIsNull() {
            addCriterion("department_out_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdIsNotNull() {
            addCriterion("department_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdEqualTo(Integer value) {
            addCriterion("department_out_id =", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdNotEqualTo(Integer value) {
            addCriterion("department_out_id <>", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdGreaterThan(Integer value) {
            addCriterion("department_out_id >", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_out_id >=", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdLessThan(Integer value) {
            addCriterion("department_out_id <", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_out_id <=", value, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdIn(List<Integer> values) {
            addCriterion("department_out_id in", values, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdNotIn(List<Integer> values) {
            addCriterion("department_out_id not in", values, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdBetween(Integer value1, Integer value2) {
            addCriterion("department_out_id between", value1, value2, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andDepartmentOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_out_id not between", value1, value2, "departmentOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdIsNull() {
            addCriterion("employee_out_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdIsNotNull() {
            addCriterion("employee_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdEqualTo(Integer value) {
            addCriterion("employee_out_id =", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdNotEqualTo(Integer value) {
            addCriterion("employee_out_id <>", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdGreaterThan(Integer value) {
            addCriterion("employee_out_id >", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_out_id >=", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdLessThan(Integer value) {
            addCriterion("employee_out_id <", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_out_id <=", value, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdIn(List<Integer> values) {
            addCriterion("employee_out_id in", values, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdNotIn(List<Integer> values) {
            addCriterion("employee_out_id not in", values, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_out_id between", value1, value2, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andEmployeeOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_out_id not between", value1, value2, "employeeOutId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentIsNull() {
            addCriterion("owndepartment is null");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentIsNotNull() {
            addCriterion("owndepartment is not null");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentEqualTo(Integer value) {
            addCriterion("owndepartment =", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentNotEqualTo(Integer value) {
            addCriterion("owndepartment <>", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentGreaterThan(Integer value) {
            addCriterion("owndepartment >", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("owndepartment >=", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentLessThan(Integer value) {
            addCriterion("owndepartment <", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("owndepartment <=", value, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentIn(List<Integer> values) {
            addCriterion("owndepartment in", values, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentNotIn(List<Integer> values) {
            addCriterion("owndepartment not in", values, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentBetween(Integer value1, Integer value2) {
            addCriterion("owndepartment between", value1, value2, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andOwndepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("owndepartment not between", value1, value2, "owndepartment");
            return (Criteria) this;
        }

        public Criteria andFunctionaryIsNull() {
            addCriterion("functionary is null");
            return (Criteria) this;
        }

        public Criteria andFunctionaryIsNotNull() {
            addCriterion("functionary is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionaryEqualTo(Integer value) {
            addCriterion("functionary =", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryNotEqualTo(Integer value) {
            addCriterion("functionary <>", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryGreaterThan(Integer value) {
            addCriterion("functionary >", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("functionary >=", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryLessThan(Integer value) {
            addCriterion("functionary <", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryLessThanOrEqualTo(Integer value) {
            addCriterion("functionary <=", value, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryIn(List<Integer> values) {
            addCriterion("functionary in", values, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryNotIn(List<Integer> values) {
            addCriterion("functionary not in", values, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryBetween(Integer value1, Integer value2) {
            addCriterion("functionary between", value1, value2, "functionary");
            return (Criteria) this;
        }

        public Criteria andFunctionaryNotBetween(Integer value1, Integer value2) {
            addCriterion("functionary not between", value1, value2, "functionary");
            return (Criteria) this;
        }

        public Criteria andIsDeleterIsNull() {
            addCriterion("is_deleter is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleterIsNotNull() {
            addCriterion("is_deleter is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleterEqualTo(Integer value) {
            addCriterion("is_deleter =", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterNotEqualTo(Integer value) {
            addCriterion("is_deleter <>", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterGreaterThan(Integer value) {
            addCriterion("is_deleter >", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleter >=", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterLessThan(Integer value) {
            addCriterion("is_deleter <", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleter <=", value, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterIn(List<Integer> values) {
            addCriterion("is_deleter in", values, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterNotIn(List<Integer> values) {
            addCriterion("is_deleter not in", values, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterBetween(Integer value1, Integer value2) {
            addCriterion("is_deleter between", value1, value2, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsDeleterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleter not between", value1, value2, "isDeleter");
            return (Criteria) this;
        }

        public Criteria andIsSrcapIsNull() {
            addCriterion("is_srcap is null");
            return (Criteria) this;
        }

        public Criteria andIsSrcapIsNotNull() {
            addCriterion("is_srcap is not null");
            return (Criteria) this;
        }

        public Criteria andIsSrcapEqualTo(Integer value) {
            addCriterion("is_srcap =", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapNotEqualTo(Integer value) {
            addCriterion("is_srcap <>", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapGreaterThan(Integer value) {
            addCriterion("is_srcap >", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_srcap >=", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapLessThan(Integer value) {
            addCriterion("is_srcap <", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapLessThanOrEqualTo(Integer value) {
            addCriterion("is_srcap <=", value, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapIn(List<Integer> values) {
            addCriterion("is_srcap in", values, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapNotIn(List<Integer> values) {
            addCriterion("is_srcap not in", values, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapBetween(Integer value1, Integer value2) {
            addCriterion("is_srcap between", value1, value2, "isSrcap");
            return (Criteria) this;
        }

        public Criteria andIsSrcapNotBetween(Integer value1, Integer value2) {
            addCriterion("is_srcap not between", value1, value2, "isSrcap");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}