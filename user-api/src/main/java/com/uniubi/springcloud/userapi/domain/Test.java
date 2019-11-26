package com.uniubi.springcloud.userapi.domain;

import java.util.*;

/**
 * @version 1.0  2019/11/14
 * @auther <a href="mailto:fengwei@uni-ubi.com">参宿</a>
 * @since 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("aa", 1));
        list.add(new User("bb", 2));
        list.add(new User("cc", 3));
        list.add(new User(null, 6));
        HashMap<Integer, List<User>> collect = list.stream().collect(HashMap::new, (targe, arg) -> {
            Integer age = arg.getAge();
            List<User> users = targe.computeIfAbsent(age, k -> new ArrayList<>());//key赋值  value是null
            users.add(arg);
        }, HashMap::putAll);
        System.out.println(collect.entrySet());
//        List<DeviceIotInfoDto> deviceIotInfoDtos = fetchDeviceIotInfoDtos(accessKey, aliIotDeviceKeys);
//        Map<String, List<DeviceIotInfoDto>> productKey2DeviceKeys = deviceIotInfoDtos.stream().collect(HashMap::new, (innerProductKey2DeviceKeys, deviceIotInfoDto) -> {
//            String iotProductKey = deviceIotInfoDto.getIotProductKey();
//            List<DeviceIotInfoDto> deviceKeys = innerProductKey2DeviceKeys.computeIfAbsent(iotProductKey, k -> new ArrayList<>());
//            deviceKeys.add(deviceIotInfoDto);
//        }, HashMap::putAll);
//        Map<String, List<String>> map = new HashMap<>();
//        List<String> list;
//
//        // 一般这样写
//        list = map.get("list-1");
//        if (list == null) {
//            list = new LinkedList<>();
//            map.put("list-1", list);
//        }
//        list.add("one");
//        System.out.println(map.entrySet());

    }
}
