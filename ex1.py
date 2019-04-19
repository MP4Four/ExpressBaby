#coding:utf-8
import requests


r = requests.get("www.baidu.com")
if r.status_code == requests.codes.ok:
	print(r.status_code)
	print(r.headers)
	print(r.headers.get('content-type'))
else:
	r.raise_for_status()