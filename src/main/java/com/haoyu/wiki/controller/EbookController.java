package com.haoyu.wiki.controller;

import com.haoyu.wiki.req.EbookReq;
import com.haoyu.wiki.resp.CommonResp;
import com.haoyu.wiki.resp.EbookResp;
import com.haoyu.wiki.resp.PageResp;
import com.haoyu.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
