'use strict';

// 导入 js-yaml 和 fs
const yaml = require('js-yaml');
const fs = require('fs');

// 读取 yaml
const yamlData = fs.readFileSync('example.yaml','utf8');

// 将 yaml 转换成 js 对象
const parserData = yaml.load(yamlData);

console.log(parserData);
