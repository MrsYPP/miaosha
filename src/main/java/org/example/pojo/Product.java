package org.example.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */

    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.product_id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.product_name
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.product_price
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private BigDecimal productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.product_explain
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private String productExplain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.create_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_miaosha_product.update_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.id
     *
     * @return the value of t_miaosha_product.id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.id
     *
     * @param id the value for t_miaosha_product.id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.product_id
     *
     * @return the value of t_miaosha_product.product_id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.product_id
     *
     * @param productId the value for t_miaosha_product.product_id
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.product_name
     *
     * @return the value of t_miaosha_product.product_name
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.product_name
     *
     * @param productName the value for t_miaosha_product.product_name
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.product_price
     *
     * @return the value of t_miaosha_product.product_price
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.product_price
     *
     * @param productPrice the value for t_miaosha_product.product_price
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.product_explain
     *
     * @return the value of t_miaosha_product.product_explain
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public String getProductExplain() {
        return productExplain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.product_explain
     *
     * @param productExplain the value for t_miaosha_product.product_explain
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setProductExplain(String productExplain) {
        this.productExplain = productExplain == null ? null : productExplain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.create_time
     *
     * @return the value of t_miaosha_product.create_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.create_time
     *
     * @param createTime the value for t_miaosha_product.create_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_miaosha_product.update_time
     *
     * @return the value of t_miaosha_product.update_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_miaosha_product.update_time
     *
     * @param updateTime the value for t_miaosha_product.update_time
     *
     * @mbg.generated Tue Mar 30 22:46:27 CST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}