//
//  HelloWorldModule.m
//  RNTestNCTS
//
//  Created by Admin on 22/05/22.
//

#import "RCTHelloWorldModule.h"
#import <HelloWorldLib2/WorldMe.h>

@implementation RCTHelloWorldModule

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(print:(NSString *)word){
  WorldMe *printingOriginal = [[WorldMe alloc]init];
  
  [WorldMe print:word];
  [printingOriginal printInstanceMethod:word];
}

@end
