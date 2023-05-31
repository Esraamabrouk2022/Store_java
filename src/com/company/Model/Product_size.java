package com.company.Model;

public class Product_size {
    int id;
    int products_id;
    int sizes_id;
    int size;
    int quantity_id;
    float price;

 public Product_size() {
 }

 public Product_size(int id, int products_id, int sizes_id, int size, int quantity_id, float price) {
  this.id = id;
  this.products_id = products_id;
  this.sizes_id = sizes_id;
  this.size = size;
  this.quantity_id = quantity_id;
  this.price = price;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public int getProducts_id() {
  return products_id;
 }

 public void setProducts_id(int products_id) {
  this.products_id = products_id;
 }

 public int getSizes_id() {
  return sizes_id;
 }

 public void setSizes_id(int sizes_id) {
  this.sizes_id = sizes_id;
 }

 public int getSize() {
  return size;
 }

 public void setSize(int size) {
  this.size = size;
 }

 public int getQuantity_id() {
  return quantity_id;
 }

 public void setQuantity_id(int quantity_id) {
  this.quantity_id = quantity_id;
 }

 public float getPrice() {
  return price;
 }

 public void setPrice(float price) {
  this.price = price;
 }
}

