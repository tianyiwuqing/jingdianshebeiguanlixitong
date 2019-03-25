package com.lynu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableAddequipmentbillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableAddequipmentbillsExample() {
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

        public Criteria andBillsnumberIsNull() {
            addCriterion("billsnumber is null");
            return (Criteria) this;
        }

        public Criteria andBillsnumberIsNotNull() {
            addCriterion("billsnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBillsnumberEqualTo(String value) {
            addCriterion("billsnumber =", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberNotEqualTo(String value) {
            addCriterion("billsnumber <>", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberGreaterThan(String value) {
            addCriterion("billsnumber >", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("billsnumber >=", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberLessThan(String value) {
            addCriterion("billsnumber <", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberLessThanOrEqualTo(String value) {
            addCriterion("billsnumber <=", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberLike(String value) {
            addCriterion("billsnumber like", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberNotLike(String value) {
            addCriterion("billsnumber not like", value, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberIn(List<String> values) {
            addCriterion("billsnumber in", values, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberNotIn(List<String> values) {
            addCriterion("billsnumber not in", values, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberBetween(String value1, String value2) {
            addCriterion("billsnumber between", value1, value2, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andBillsnumberNotBetween(String value1, String value2) {
            addCriterion("billsnumber not between", value1, value2, "billsnumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdIsNull() {
            addCriterion("shopdepartment_id is null");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdIsNotNull() {
            addCriterion("shopdepartment_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdEqualTo(String value) {
            addCriterion("shopdepartment_id =", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdNotEqualTo(String value) {
            addCriterion("shopdepartment_id <>", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdGreaterThan(String value) {
            addCriterion("shopdepartment_id >", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("shopdepartment_id >=", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdLessThan(String value) {
            addCriterion("shopdepartment_id <", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("shopdepartment_id <=", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdLike(String value) {
            addCriterion("shopdepartment_id like", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdNotLike(String value) {
            addCriterion("shopdepartment_id not like", value, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdIn(List<String> values) {
            addCriterion("shopdepartment_id in", values, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdNotIn(List<String> values) {
            addCriterion("shopdepartment_id not in", values, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdBetween(String value1, String value2) {
            addCriterion("shopdepartment_id between", value1, value2, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andShopdepartmentIdNotBetween(String value1, String value2) {
            addCriterion("shopdepartment_id not between", value1, value2, "shopdepartmentId");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIsNull() {
            addCriterion("receptionperson is null");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIsNotNull() {
            addCriterion("receptionperson is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonEqualTo(String value) {
            addCriterion("receptionperson =", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotEqualTo(String value) {
            addCriterion("receptionperson <>", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonGreaterThan(String value) {
            addCriterion("receptionperson >", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonGreaterThanOrEqualTo(String value) {
            addCriterion("receptionperson >=", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLessThan(String value) {
            addCriterion("receptionperson <", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLessThanOrEqualTo(String value) {
            addCriterion("receptionperson <=", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLike(String value) {
            addCriterion("receptionperson like", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotLike(String value) {
            addCriterion("receptionperson not like", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIn(List<String> values) {
            addCriterion("receptionperson in", values, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotIn(List<String> values) {
            addCriterion("receptionperson not in", values, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonBetween(String value1, String value2) {
            addCriterion("receptionperson between", value1, value2, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotBetween(String value1, String value2) {
            addCriterion("receptionperson not between", value1, value2, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("purchase_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("purchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterion("purchase_time =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterion("purchase_time <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterion("purchase_time >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_time >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterion("purchase_time <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchase_time <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterion("purchase_time in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterion("purchase_time not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("purchase_time between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchase_time not between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsIsNull() {
            addCriterion("abstractdetails is null");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsIsNotNull() {
            addCriterion("abstractdetails is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsEqualTo(String value) {
            addCriterion("abstractdetails =", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsNotEqualTo(String value) {
            addCriterion("abstractdetails <>", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsGreaterThan(String value) {
            addCriterion("abstractdetails >", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("abstractdetails >=", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsLessThan(String value) {
            addCriterion("abstractdetails <", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsLessThanOrEqualTo(String value) {
            addCriterion("abstractdetails <=", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsLike(String value) {
            addCriterion("abstractdetails like", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsNotLike(String value) {
            addCriterion("abstractdetails not like", value, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsIn(List<String> values) {
            addCriterion("abstractdetails in", values, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsNotIn(List<String> values) {
            addCriterion("abstractdetails not in", values, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsBetween(String value1, String value2) {
            addCriterion("abstractdetails between", value1, value2, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andAbstractdetailsNotBetween(String value1, String value2) {
            addCriterion("abstractdetails not between", value1, value2, "abstractdetails");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIsNull() {
            addCriterion("equipment_furnish is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIsNotNull() {
            addCriterion("equipment_furnish is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishEqualTo(String value) {
            addCriterion("equipment_furnish =", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotEqualTo(String value) {
            addCriterion("equipment_furnish <>", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishGreaterThan(String value) {
            addCriterion("equipment_furnish >", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_furnish >=", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishLessThan(String value) {
            addCriterion("equipment_furnish <", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishLessThanOrEqualTo(String value) {
            addCriterion("equipment_furnish <=", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishLike(String value) {
            addCriterion("equipment_furnish like", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotLike(String value) {
            addCriterion("equipment_furnish not like", value, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishIn(List<String> values) {
            addCriterion("equipment_furnish in", values, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotIn(List<String> values) {
            addCriterion("equipment_furnish not in", values, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishBetween(String value1, String value2) {
            addCriterion("equipment_furnish between", value1, value2, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andEquipmentFurnishNotBetween(String value1, String value2) {
            addCriterion("equipment_furnish not between", value1, value2, "equipmentFurnish");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonIsNull() {
            addCriterion("operatorperson is null");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonIsNotNull() {
            addCriterion("operatorperson is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonEqualTo(String value) {
            addCriterion("operatorperson =", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonNotEqualTo(String value) {
            addCriterion("operatorperson <>", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonGreaterThan(String value) {
            addCriterion("operatorperson >", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonGreaterThanOrEqualTo(String value) {
            addCriterion("operatorperson >=", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonLessThan(String value) {
            addCriterion("operatorperson <", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonLessThanOrEqualTo(String value) {
            addCriterion("operatorperson <=", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonLike(String value) {
            addCriterion("operatorperson like", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonNotLike(String value) {
            addCriterion("operatorperson not like", value, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonIn(List<String> values) {
            addCriterion("operatorperson in", values, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonNotIn(List<String> values) {
            addCriterion("operatorperson not in", values, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonBetween(String value1, String value2) {
            addCriterion("operatorperson between", value1, value2, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andOperatorpersonNotBetween(String value1, String value2) {
            addCriterion("operatorperson not between", value1, value2, "operatorperson");
            return (Criteria) this;
        }

        public Criteria andIsDelateIsNull() {
            addCriterion("is_delate is null");
            return (Criteria) this;
        }

        public Criteria andIsDelateIsNotNull() {
            addCriterion("is_delate is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelateEqualTo(Integer value) {
            addCriterion("is_delate =", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotEqualTo(Integer value) {
            addCriterion("is_delate <>", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateGreaterThan(Integer value) {
            addCriterion("is_delate >", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delate >=", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateLessThan(Integer value) {
            addCriterion("is_delate <", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateLessThanOrEqualTo(Integer value) {
            addCriterion("is_delate <=", value, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateIn(List<Integer> values) {
            addCriterion("is_delate in", values, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotIn(List<Integer> values) {
            addCriterion("is_delate not in", values, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateBetween(Integer value1, Integer value2) {
            addCriterion("is_delate between", value1, value2, "isDelate");
            return (Criteria) this;
        }

        public Criteria andIsDelateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delate not between", value1, value2, "isDelate");
            return (Criteria) this;
        }

        public Criteria andBillspersonIsNull() {
            addCriterion("billsperson is null");
            return (Criteria) this;
        }

        public Criteria andBillspersonIsNotNull() {
            addCriterion("billsperson is not null");
            return (Criteria) this;
        }

        public Criteria andBillspersonEqualTo(String value) {
            addCriterion("billsperson =", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonNotEqualTo(String value) {
            addCriterion("billsperson <>", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonGreaterThan(String value) {
            addCriterion("billsperson >", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonGreaterThanOrEqualTo(String value) {
            addCriterion("billsperson >=", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonLessThan(String value) {
            addCriterion("billsperson <", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonLessThanOrEqualTo(String value) {
            addCriterion("billsperson <=", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonLike(String value) {
            addCriterion("billsperson like", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonNotLike(String value) {
            addCriterion("billsperson not like", value, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonIn(List<String> values) {
            addCriterion("billsperson in", values, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonNotIn(List<String> values) {
            addCriterion("billsperson not in", values, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonBetween(String value1, String value2) {
            addCriterion("billsperson between", value1, value2, "billsperson");
            return (Criteria) this;
        }

        public Criteria andBillspersonNotBetween(String value1, String value2) {
            addCriterion("billsperson not between", value1, value2, "billsperson");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andUsedirIsNull() {
            addCriterion("usedir is null");
            return (Criteria) this;
        }

        public Criteria andUsedirIsNotNull() {
            addCriterion("usedir is not null");
            return (Criteria) this;
        }

        public Criteria andUsedirEqualTo(String value) {
            addCriterion("usedir =", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirNotEqualTo(String value) {
            addCriterion("usedir <>", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirGreaterThan(String value) {
            addCriterion("usedir >", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirGreaterThanOrEqualTo(String value) {
            addCriterion("usedir >=", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirLessThan(String value) {
            addCriterion("usedir <", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirLessThanOrEqualTo(String value) {
            addCriterion("usedir <=", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirLike(String value) {
            addCriterion("usedir like", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirNotLike(String value) {
            addCriterion("usedir not like", value, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirIn(List<String> values) {
            addCriterion("usedir in", values, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirNotIn(List<String> values) {
            addCriterion("usedir not in", values, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirBetween(String value1, String value2) {
            addCriterion("usedir between", value1, value2, "usedir");
            return (Criteria) this;
        }

        public Criteria andUsedirNotBetween(String value1, String value2) {
            addCriterion("usedir not between", value1, value2, "usedir");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonIsNull() {
            addCriterion("checkingperson is null");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonIsNotNull() {
            addCriterion("checkingperson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonEqualTo(String value) {
            addCriterion("checkingperson =", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonNotEqualTo(String value) {
            addCriterion("checkingperson <>", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonGreaterThan(String value) {
            addCriterion("checkingperson >", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonGreaterThanOrEqualTo(String value) {
            addCriterion("checkingperson >=", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonLessThan(String value) {
            addCriterion("checkingperson <", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonLessThanOrEqualTo(String value) {
            addCriterion("checkingperson <=", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonLike(String value) {
            addCriterion("checkingperson like", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonNotLike(String value) {
            addCriterion("checkingperson not like", value, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonIn(List<String> values) {
            addCriterion("checkingperson in", values, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonNotIn(List<String> values) {
            addCriterion("checkingperson not in", values, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonBetween(String value1, String value2) {
            addCriterion("checkingperson between", value1, value2, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andCheckingpersonNotBetween(String value1, String value2) {
            addCriterion("checkingperson not between", value1, value2, "checkingperson");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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