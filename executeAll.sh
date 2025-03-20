#!/bin/bash

cd tools/llm-repok-generator ;  git checkout main ; cd ../.. ;
./parameterizedExecution.sh "casestudies/hashmap/HashMap.java"="HashMap" "casestudies/linkedlist/LinkedList.java"="LinkedList" "casestudies/nodecachinglinkedlist/NodeCachingLinkedList.java"="NodeCachingLinkedList" ;
cd tools/llm-repok-generator ; git checkout avltree-and-treemap-test ; cd ../.. ;
./parameterizedExecution.sh "casestudies/avltree/AvlTree.java"="AvlTree" "casestudies/bintree/BinTree.java"="BinTree" "casestudies/treemap/TreeMap.java"="TreeMap" ;
cd tools/llm-repok-generator ; git checkout binomialheap-test ; cd ../.. ;
./parameterizedExecution.sh "casestudies/binheap/BinomialHeap.java"="BinomialHeap" ; 
cd tools/llm-repok-generator ;  git checkout main ; cd ../.. ;