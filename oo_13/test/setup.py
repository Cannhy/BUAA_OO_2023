check_rounds = 100                  # 评测轮数
books_account = 100                 # 书籍总数
operations_account = 100           # 操作指令总数，当总数大于 100 时，会解锁日期限制（超过 2023-12-31）
input_store_dir = 'input'           # 输入文件所存放的文件夹名
output_store_dir = 'output'         # 输出文件所存放的文件夹名
ans_store_dir = 'ans'               # 答案文件所存放的文件夹名
res_store_dir = 'operation_res'     # 指令的详细运行结果（即答案输出没体现的另一面）所存放的文件夹名
clean_if_no_diff = True             # 是否清除无差别文件（一轮中，如果存在一份文件有差异，就认为“有差别”）
store_operation_res = True          # 是否需要保留每条指令的详细输出
max_threads = 10                    # 最大同时评测线程数
