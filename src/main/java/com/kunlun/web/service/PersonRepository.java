package com.kunlun.web.service;

import com.kunlun.web.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by kunlun on 2017/2/27.
 */
public interface PersonRepository {
    /**
     * Mono<T> 对应传统的 T 对象
     * 根据id查询 对象信息
     * @param id
     * @return
     */
    Mono<Person> getPerson(String id);

    /**
     * Flux<T> 对应传统的List<T>
     * 查询 对象集合
     * @return
     */
    Flux<Person> getAllPerson();

    /**
     * Mono<void> 作为完成标识
     * @param person
     * @return
     */
    Mono<Void> savePerson(Mono<Person> person);
}
