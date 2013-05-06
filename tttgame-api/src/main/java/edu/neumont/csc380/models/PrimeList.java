package edu.neumont.csc380.models;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name="factors")
public class PrimeList {
 
 public PrimeList(){}
 
 public PrimeList(long key, long e) {
  ProbablyPrimeService service = new ProbablyPrimeService();
  BigInteger factor = BigInteger.valueOf(service.factorization(key));
  setFactorOne(factor);
  setFactorTwo(BigInteger.valueOf(key).divide(factor));
  setD(p, q, BigInteger.valueOf(e));
 }
 
 @XmlElement(name="p")
 private BigInteger p;
 
 @XmlElement(name="q")
 private BigInteger q;
 
 @XmlElement(name="d")
 private BigInteger d;

 @XmlTransient
 public long getFactorOne() {
  return p.longValue();
 }

 public void setFactorOne(BigInteger factorOne) {
  this.p = factorOne;
 }

 @XmlTransient
 public long getFactorTwo() {
  return q.longValue();
 }

 public void setFactorTwo(BigInteger factorTwo) {
  this.q = factorTwo;
 }
 
 @XmlTransient
 public long getD() {
  return d.longValue();
 }
 
 public void setD(BigInteger p, BigInteger q, BigInteger e) {
  BigInteger phi = (p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));
  this.d = e.modInverse(phi);
 }
 
}