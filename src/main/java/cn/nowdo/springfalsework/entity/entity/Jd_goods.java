package cn.nowdo.springfalsework.entity.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author atang
 * @since 2019-01-22
 */
public class Jd_goods extends Model<Jd_goods> {

    private static final long serialVersionUID = 1L;

    private Long skuId;

    private Long spuId;

    private String skuUrl;

    private String imgUrl;

    private String title;

    private BigDecimal price;

    private BigDecimal commissionPrice;

    private Integer goodCom;

    private Integer saleCount;

    private BigDecimal comRate;

    private Long couponId;

    private Long venderId;

    private Integer couponNum;

    private Integer usedNum;

    private Integer denomination;

    private Integer quota;

    private Integer validityType;

    private Integer days;

    private String link;

    private Date validBeginTime;

    private Date validEndTime;

    private Integer couponValid;

    private Integer isPinGou;

    private Integer pingouTmCount;

    private BigDecimal pgPrice;

    private String owner;

    private String diyImgUrl;

    private String diyTitle;

    private String diyBenefit;

    private String imageUrls;

    private Integer isSeckill;

    private BigDecimal seckillOriPrice;

    private BigDecimal seckillPrice;

    private Date seckillStartTime;

    private Date seckillEndTime;

    private String shareUrl;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }
    public String getSkuUrl() {
        return skuUrl;
    }

    public void setSkuUrl(String skuUrl) {
        this.skuUrl = skuUrl;
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getCommissionPrice() {
        return commissionPrice;
    }

    public void setCommissionPrice(BigDecimal commissionPrice) {
        this.commissionPrice = commissionPrice;
    }
    public Integer getGoodCom() {
        return goodCom;
    }

    public void setGoodCom(Integer goodCom) {
        this.goodCom = goodCom;
    }
    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }
    public BigDecimal getComRate() {
        return comRate;
    }

    public void setComRate(BigDecimal comRate) {
        this.comRate = comRate;
    }
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }
    public Integer getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }
    public Integer getDenomination() {
        return denomination;
    }

    public void setDenomination(Integer denomination) {
        this.denomination = denomination;
    }
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }
    public Integer getValidityType() {
        return validityType;
    }

    public void setValidityType(Integer validityType) {
        this.validityType = validityType;
    }
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public Date getValidBeginTime() {
        return validBeginTime;
    }

    public void setValidBeginTime(Date validBeginTime) {
        this.validBeginTime = validBeginTime;
    }
    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }
    public Integer getCouponValid() {
        return couponValid;
    }

    public void setCouponValid(Integer couponValid) {
        this.couponValid = couponValid;
    }
    public Integer getIsPinGou() {
        return isPinGou;
    }

    public void setIsPinGou(Integer isPinGou) {
        this.isPinGou = isPinGou;
    }
    public Integer getPingouTmCount() {
        return pingouTmCount;
    }

    public void setPingouTmCount(Integer pingouTmCount) {
        this.pingouTmCount = pingouTmCount;
    }
    public BigDecimal getPgPrice() {
        return pgPrice;
    }

    public void setPgPrice(BigDecimal pgPrice) {
        this.pgPrice = pgPrice;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getDiyImgUrl() {
        return diyImgUrl;
    }

    public void setDiyImgUrl(String diyImgUrl) {
        this.diyImgUrl = diyImgUrl;
    }
    public String getDiyTitle() {
        return diyTitle;
    }

    public void setDiyTitle(String diyTitle) {
        this.diyTitle = diyTitle;
    }
    public String getDiyBenefit() {
        return diyBenefit;
    }

    public void setDiyBenefit(String diyBenefit) {
        this.diyBenefit = diyBenefit;
    }
    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }
    public Integer getIsSeckill() {
        return isSeckill;
    }

    public void setIsSeckill(Integer isSeckill) {
        this.isSeckill = isSeckill;
    }
    public BigDecimal getSeckillOriPrice() {
        return seckillOriPrice;
    }

    public void setSeckillOriPrice(BigDecimal seckillOriPrice) {
        this.seckillOriPrice = seckillOriPrice;
    }
    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }
    public Date getSeckillStartTime() {
        return seckillStartTime;
    }

    public void setSeckillStartTime(Date seckillStartTime) {
        this.seckillStartTime = seckillStartTime;
    }
    public Date getSeckillEndTime() {
        return seckillEndTime;
    }

    public void setSeckillEndTime(Date seckillEndTime) {
        this.seckillEndTime = seckillEndTime;
    }
    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.skuId;
    }

    @Override
    public String toString() {
        return "Jd_goods{" +
        "skuId=" + skuId +
        ", spuId=" + spuId +
        ", skuUrl=" + skuUrl +
        ", imgUrl=" + imgUrl +
        ", title=" + title +
        ", price=" + price +
        ", commissionPrice=" + commissionPrice +
        ", goodCom=" + goodCom +
        ", saleCount=" + saleCount +
        ", comRate=" + comRate +
        ", couponId=" + couponId +
        ", venderId=" + venderId +
        ", couponNum=" + couponNum +
        ", usedNum=" + usedNum +
        ", denomination=" + denomination +
        ", quota=" + quota +
        ", validityType=" + validityType +
        ", days=" + days +
        ", link=" + link +
        ", validBeginTime=" + validBeginTime +
        ", validEndTime=" + validEndTime +
        ", couponValid=" + couponValid +
        ", isPinGou=" + isPinGou +
        ", pingouTmCount=" + pingouTmCount +
        ", pgPrice=" + pgPrice +
        ", owner=" + owner +
        ", diyImgUrl=" + diyImgUrl +
        ", diyTitle=" + diyTitle +
        ", diyBenefit=" + diyBenefit +
        ", imageUrls=" + imageUrls +
        ", isSeckill=" + isSeckill +
        ", seckillOriPrice=" + seckillOriPrice +
        ", seckillPrice=" + seckillPrice +
        ", seckillStartTime=" + seckillStartTime +
        ", seckillEndTime=" + seckillEndTime +
        ", shareUrl=" + shareUrl +
        "}";
    }
}
