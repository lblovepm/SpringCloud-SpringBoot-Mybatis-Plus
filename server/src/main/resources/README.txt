################ server �� client ����������#####################
#����˿������ұ���ģʽ������ʲô���������˶��ᱣ��һ�������ķ��񡣱���client��server���������⣬�����ִ����ķ��������
eureka.server.enable-self-preservation=true
#���������Ч����Ķ�ʱ����ʱ������Ĭ��1����
eureka.server.eviction-interval-timer-in-ms= 60000
#����೤ʱ�䣬������ڵ�delta����
eureka.server.delta-retention-timer-interval-in-ms=0
#�������ݣ��Ƿ�Ҳ�ṩ��client
eureka.server.disable-delta=false
#eureka������Ƿ��¼client�����header
eureka.server.log-identity-headers=true
#����Ƶ��������
eureka.server.rate-limiter-burst-size=10
#�Ƿ�������Ƶ��������
eureka.server.rate-limiter-enabled=false
