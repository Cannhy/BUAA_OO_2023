# hw13 多线程评测机

## 使用方法

### 可执行文件(.exe)

​		如果是 Windows 系统，可以利用已打包好的 exe 文件进行评测，直接将评测的 exe 文件和所有待评测的 jar 包放于同一目录下，双击可执行文件即可开始运行评测。需要注意的是，下载 exe 和打开 exe 的过程可能会被 edge 等阻拦，全部保留/允许即可。

​		使用时，会弹出命令窗口，可以对参数进行自定义。默认设置为**100本书** + **1000条指令** + **解锁日期限制** + **保留详细输出**，具体参数说明可见后文。

### 编译源码

​		将 `main.py`, `generate_data.py` 和所有待评测的 jar 包放于同一目录下，终端运行 `python ./main.py` 即可开始运行。

​		对于参数的调整，可通过 `setup.py` 进行设置，具体参数说明可见后文。



## 注意事项

### 参数说明

```python
check_rounds = 100                  # 评测轮数
books_account = 100                 # 书籍总数
operations_account = 1000           # 操作指令总数，当总数大于 100 时，会解锁日期限制（超过 2023-12-31）
input_store_dir = 'input'           # 输入文件所存放的文件夹名
output_store_dir = 'output'         # 输出文件所存放的文件夹名
ans_store_dir = 'ans'               # 答案文件所存放的文件夹名
res_store_dir = 'operation_res'     # 指令的详细运行结果（即指令的详细行为）所存放的文件夹名
clean_if_no_diff = True             # 是否清除无差别文件（一轮中，如果存在一份文件有差异，就认为“有差别”）
store_operation_res = True          # 是否需要保留每条指令的详细输出
max_threads = 10                    # 最大同时评测线程数
```

### 运行结果

​		评测后，如果没有对路径进行修改，则会生成四个文件夹：`input`, `output`, `ans`, `operation_res`。

- `input`：存放生成的测试输入数据。如果启用了【清除无差别文件】，则不会保留通过评测的数据
- `output`：存放 jar 包的输出结果。如果启用了【清除无差别文件】，则不会保留通过评测的数据
- `ans`：存放评测机生成的参考结果。如果启用了【清除无差别文件】，则不会保留通过评测的数据
- `operation_res`：存放更详细的指令参考行为。如果启用了【清除无差别文件】，则不会保留通过评测的数据

​		需要注意的是，**每次运行会清空之前所有的数据**。



## 其他说明

1. 如果是从源码运行，虽然使用的是内置库（`datetime`, `threading`），但仍有可能出现找不到包的情况，那么需要 `pip install` 一下对应的库。
2. 如果想测试同一天的多发情况，可以将指令数调为 100，这样日期会阻塞在 `2023-12-31`
3. 如果想修改更详细的参数，例如指令的抽取权重等，可以在 `generate_data.py` 中修改
4. 评测结果仅供参考
