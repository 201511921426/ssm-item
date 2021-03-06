package com.vip.items.controller;

import com.vip.items.service.IndexService;
import com.vip.items.utils.Bean;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/find")
public class IndexController {
		@Resource
		IndexService indexService;

		@GetMapping("/nav")
		public Result find1(){
				try {
						Bean finds = indexService.finds();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/cate")
		public Result find2(){
				try {
						Bean finds = indexService.find2();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/pro")
		public Result find3(int page,int size){
				try {
						Bean finds = indexService.find3(page,size);
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/sub2")
		public Result find4(){
				try {
						Bean finds = indexService.find4();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}
		@GetMapping("/sub3")
		public Result find5(){
				try {
						Bean finds = indexService.find5();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

}
