package com.example.correctweekone.gsonbean;

import java.util.List;

public class DataEntity {



    private String msg;
    private String code;
    private String page;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * bargainPrice : 3455
         * createtime : 2017-10-03T23:53:28
         * detailUrl : https://item.m.jd.com/product/12224420750.html?utm_source=androidapp&utm_medium=appshare&utm_campaign=t_335139774&utm_term=QQfriends
         * images : https://m.360buyimg.com/n0/jfs/t9106/106/1785172479/537280/253bc0ab/59bf78a7N057e5ff7.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t9106/106/1785172479/537280/253bc0ab/59bf78a7N057e5ff7.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t8461/5/1492479653/68388/7255e013/59ba5e84N91091843.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t8461/5/1492479653/68388/7255e013/59ba5e84N91091843.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t8803/356/1478945529/489755/2a163ace/59ba5e84N7bb9a666.jpg!q70.jpg
         * itemtype : 0
         * pid : 54
         * price : 888
         * pscid : 39
         * salenum : 7575
         * sellerid : 10
         * subhead : 【现货新品抢购】全面屏2.0震撼来袭，骁龙835处理器，四曲面陶瓷机
         * title : 小米（MI） 小米MIX2 手机 黑色 全网通 (6GB+64GB)【标配版】
         */

        private int bargainPrice;
        private String createtime;
        private String detailUrl;
        private String images;
        private int itemtype;
        private int pid;
        private int price;
        private int pscid;
        private int salenum;
        private int sellerid;
        private String subhead;
        private String title;

        public int getBargainPrice() {
            return bargainPrice;
        }

        public void setBargainPrice(int bargainPrice) {
            this.bargainPrice = bargainPrice;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public int getItemtype() {
            return itemtype;
        }

        public void setItemtype(int itemtype) {
            this.itemtype = itemtype;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPscid() {
            return pscid;
        }

        public void setPscid(int pscid) {
            this.pscid = pscid;
        }

        public int getSalenum() {
            return salenum;
        }

        public void setSalenum(int salenum) {
            this.salenum = salenum;
        }

        public int getSellerid() {
            return sellerid;
        }

        public void setSellerid(int sellerid) {
            this.sellerid = sellerid;
        }

        public String getSubhead() {
            return subhead;
        }

        public void setSubhead(String subhead) {
            this.subhead = subhead;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
